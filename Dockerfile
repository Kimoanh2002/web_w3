# ---------- Stage 1: Build WAR từ source ----------
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy pom.xml và tải dependencies để cache
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy toàn bộ source code
COPY . .

# Build WAR
RUN mvn clean package -DskipTests

# ---------- Stage 2: Tomcat chạy WAR ----------
FROM tomcat:10.1.44-jdk17-temurin

# Xóa webapps mặc định
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR vừa build vào ROOT.war để chạy ở "/"
COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose cổng 8080
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
