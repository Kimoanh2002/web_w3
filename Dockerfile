FROM tomcat:10.1.44-jdk17-temurin

# Optional: xóa webapps mặc định
RUN rm -rf /usr/local/tomcat/webapps/*

# tải WAR trực tiếp từ GitHub release/raw URL:
ADD https://raw.githubusercontent.com/<username>/<repo>/main/target/ch05-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose cổng
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
