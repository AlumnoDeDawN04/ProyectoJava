<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Añadimos el Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <!--end bootstrap -->
        <title>Login</title>
    </head>
    <body>
        <div class="p-5 bg-info">
            <div class="d-flex justify-content-center flex-wrap">
                <div class="card p-4 mb-4 mt-4">
                    <div class="card-body">
                        <form:form modelAttribute="usuari" method = "POST" action = "login">
                            <div class="form-group">
                            <form:label path = "email_user">Usuario:</form:label>
                            <form:input path = "email_user" />
                            </div>
                            
                            <div class="form-group">
                            <form:label path = "password_user">Contraseña:</form:label>
                            <form:password path = "password_user"/><br>
                            <input type = "submit" value = "Entrar"/>
                            </div>

                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>   
</html>

