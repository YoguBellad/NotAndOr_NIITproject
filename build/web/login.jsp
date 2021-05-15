<%--
    Document   : login
    Created on : Aug 3, 2013, 9:43:07 PM
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
        <h1>login</h1>
        <%
         String eid=(request.getParameter("uname")+request.getParameter("host"));
         String pwd=request.getParameter("password");
         HttpSession ses = request.getSession();
         String sid=ses.getId();

         int rid=0;

         ses.setAttribute("rid", rid);

         %>
         <h1>login aftr</h1>
    </body>
</html>
