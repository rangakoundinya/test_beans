<%-- 
    Document   : index
    Created on : 20-Jul-2014, 14:01:32
    Author     : ranga
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%
          String test = "test";   
          String requestParameters = request.getQueryString().toString();
         %>
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {  
                   var test = encodeURI('<%=requestParameters%>');
                   $.get('calc',{param:test},function(responseText) {
                        var test = decodeURI(responseText);
                        $('#welcometext').text(test);         
                   });
            });
        </script>
    </head>
    <body>
      
    
<div id="welcometext">
</div>   
    </body>
</html>