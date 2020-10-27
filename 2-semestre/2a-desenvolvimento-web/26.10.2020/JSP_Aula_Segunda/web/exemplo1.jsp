<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>

    </head>
    <body>
        <h1>ARQUIVO JSP</h1>
        
        <%
            out.print("<table>");
            int n, i;
            
            out.print("");
            for (n = 0; n <= 10; n++) {
                
                out.print("<tr>");
                for (i = 1; i <= 10; i++) {
                    
                    if (n == 0) {
                        out.print("<th>Tabuada " + i + "</th>");
                    } else {
                        out.println("<td>" + i + " x " + n + " = " + (i * n) + "</td>");
                    }
                }
                out.print("</tr>");
                
            }
            
            out.print("</table>");
        %>    
    </body>
</html>
