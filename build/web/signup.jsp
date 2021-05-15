<%--
    Document   : signup
    Created on : Aug 3, 2013, 9:38:28 PM
    Author     : yogu
--%>
<%@page  extends="db.db_interactor" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        String fname=request.getParameter("fname");
            String lname=request.getParameter("lastname");
            String adres=request.getParameter("Adres");
            String eid=(request.getParameter("uname")+request.getParameter("host"));
            String code=request.getParameter("postalcode");
            String city=request.getParameter("city");
            String country=request.getParameter("Country");
            String pwd=request.getParameter("password");
            String dob=(request.getParameter("y")+request.getParameter("m")+request.getParameter("d"));

         HttpSession ses = request.getSession();
         String sid=ses.getId();

            //int rid=(Integer.parseInt(selectsmt("select rid")));
            
             %>
    </body>
</html>
