<%--
    Document   : hmsearch
    Created on : Aug 3, 2013, 10:09:03 PM
    Author     : yogu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>hm search</h1>
         <%
            String search="http://www.google.co.in/search?q="+request.getParameter("searchtxtaera")+"&sourceid=ie7&rls=com.microsoft:en-us:IE-SearchBox&ie=&oe=&gws_rd=cr&ei=OM73Uc2CIoyErAfvooCoCw";
            response.sendRedirect(search);
         %>

    </body>
</html>
