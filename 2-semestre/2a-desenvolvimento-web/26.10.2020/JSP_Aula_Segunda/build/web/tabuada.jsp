<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INDEX</title>
    </head>
    <body>
        <h1>ARQUIVO JSP</h1>
        
        <%  
            int n = 2, x;
            
            for (x = 1; x <= 10; x++) {
                out.print(n + " x " + x + " = " + (n*x) + "<br>");
            }
        %>
    </body>
</html>
