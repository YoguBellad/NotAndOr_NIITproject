<%@page import="db.db_interactor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
body {
	font-size: 16px;
	font-family: "Comic Sans MS", cursive;
	background-color: #C3C3C3;
}
textarea { font-size: 20px }
</style>
    </head>
<body bgcolor="#C0DCC0" align="centre">
     <%  if(!(request.getParameter("y").equals(null)))
    {
        String doj=(request.getParameter("y")+request.getParameter("m")+request.getParameter("d"));
    }

        %>

<table width="1220" border="1" cellspacing="0" cellpadding="0">
  <tr>
    <td width="1216" height="80"><table width="1218" height="75" border="1" cellpadding="0" cellspacing="0">
      <tr>
          <td width="229" height="54">!&O</td>
        <td width="770">headr</td>
        <td width="211"><h2 align="right">
     <%! db_interactor tm=new db_interactor(); %>
     <%= tm.time("h").substring(0,10)  %>

   <p></p>
     <%= tm.time("h").substring(10,tm.time("h").length()-3)  %>
 </h2></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="430" align="right"><table width="1235" height="437" border="1" cellpadding="0" cellspacing="0">
       <tr>
        <td width="176">&nbsp;</td>
        <td width="822">&nbsp;</td>
        <td width="229"><a href="resume.jsp">Resume</a></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td><a href="bio.jsp">Biography</a></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><a href="mail.jsp">Mail</a></td>
        <td></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr align="center">
    <td  align="centre" height="150">&nbsp;
        <form action="bioupdate.jsp">
      <textarea placeholder="Quote on wats happening wit u" name="bioip" cols="100" rows="1"></textarea>
      <textarea placeholder="Wats happening wit u" name="bioip" cols="100" rows="6"></textarea>
      <input type="image" name="submit" value="biobut" src="nao/etc/update bio.jpg" />

      <form action="biodate.jsp">
          <input type="text" name="y" Placeholder="yyyy" size="4"/>/<input type="text" name="m" size="2" Placeholder="mm" />/<input type="text" name="d" Placeholder="dd" size="2" />
          <input type="submit" value="Jump to" />
        </form></form></td>
  </tr>
</table>
</body>
</html>

