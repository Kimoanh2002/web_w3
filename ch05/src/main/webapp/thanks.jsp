<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <link rel="stylesheet" href="css/servey.css">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap" rel="stylesheet">
</head>
<body>
<header>
    <div class="header-content">
        <div class="title-section">
            <h1>Thank You!</h1>
            <p>We appreciate your feedback.</p>
        </div>
        <div class="logo-section">
            <img src="images/murach-logo.png" alt="Murach Logo" class="logo">
            <span class="brand">MURACH</span>
        </div>
    </div>
</header>
<div class="container">
    <h2>Your Information</h2>
    <div class="summary">
        <p><strong>First Name:</strong> ${user.firstName}</p>
        <p><strong>Last Name:</strong> ${user.lastName}</p>
        <p><strong>Email:</strong> ${user.email}</p>
        <p><strong>Date of Birth:</strong> ${param.dob}</p>
        <p><strong>Heard about us:</strong> ${param.source}</p>
        <p><strong>Preferences:</strong>
            <c:if test="${param.announcements != null}">Announcements, </c:if>
            <c:if test="${param.emailOK != null}">Email Updates</c:if>
        </p>
        <p><strong>Contact Method:</strong> ${param.contactMethod}</p>
    </div>
    <a href="index.jsp">← Back to Survey</a>
</div>
</body>
</html>
