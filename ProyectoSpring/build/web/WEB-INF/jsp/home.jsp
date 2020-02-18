<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <c:if test="${sessionScope.nombreLogin == null}">
            <% response.sendRedirect("login");%>
    </c:if>
    <body>
        <h1>Bienvenido ${sessionScope.nombreLogin}</h1>
    </body>
</html>
