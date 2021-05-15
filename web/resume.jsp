<%--
    Document   : resume
    Created on : Aug 3, 2013, 11:02:18 PM
    Author     : yogu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
input { font-size: 20px }

body,td,th {
	font-size: 16px;
	font-family: "Comic Sans MS", cursive;
}
</style>
    <body>

        <form action="resumeip.jsp">
<table width="450" border="1" cellspacing="5" cellpadding="2">
  <caption>
    RESUME
  </caption>
  <tr>
    <td width="282"><input type="text" name="fname" value="" size="45" placeholder="First Name" /></td>
  </tr>
  <tr>
    <td><input type="text" name="lname" value="" size="45" placeholder="Last Name" /></td>
  </tr>
  <tr>
    <td><input type="text" name="nickname" value="" size="45" placeholder="Nick Name" /></td>
  </tr>
  <tr>
    <td><input name="uname" type="text" placeholder="Username / ID" size="25">
  <select name="host" size="1">
    <option value="@ notandor">@ notandor</option>
    <option value="@gmail">@gmail</option>
    <option value="@yahoo">@yahoo</option>
    <option value="@facebook">@facebook</option>
    <option value="@watsapp">@watsapp</option>
    <option value="others">others</option>
  </select></td>
  </tr>
  <tr>
    <td>DOB : <input type="text" name="y" Placeholder="yyyy" size="4"/>/<input type="text" name="m" size="2" Placeholder="mm" />/<input type="text" name="d" Placeholder="dd" size="2" />
     </td>
  </tr>
  <tr>
    <td><input type="text" name="adres" value="" size="45" placeholder="Address" /></td>
  </tr>
  <tr>
    <td><input type="text" name="city" value="" size="45" placeholder="City" /></td>
  </tr>
  <tr>
    <td><input type="text" name="contry" value="" size="45" placeholder="Country" /></td>
  </tr>
  <tr>
    <td><input type="text" name="code" value="" size="45" placeholder="Postal/zip code" /></td>
  </tr>
  <tr>
    <td><input type="text" name="psch" value="" size="45" placeholder="Primary School" /></td>
  </tr>
  <tr>
    <td><input type="text" name="hsch" value="" size="45" placeholder="High School" /></td>
  </tr>
  <tr>
    <td><input type="text" name="pcoll" value="" size="45" placeholder="Pre Collage" /></td>
  </tr>
  <tr>
    <td><input type="text" name="bgrad" value="" size="45" placeholder="Batchular Graduation" /></td>
  </tr>
  <tr>
    <td><input type="text" name="mgrad" value="" size="45" placeholder="Master Graduation" /></td>
  </tr>
  <tr>
    <td><input type="text" name="phd" value="" size="45" placeholder="Higher edutcation" /></td>
  </tr>
  <tr>
    <td><input type="text" name="rela" value="" size="45" placeholder="Relation-Ship status" /></td>
  </tr>
  <tr>
    <td><input type="text" name="con1" value="" size="45" placeholder="1st contact" /></td>
  </tr>
  <tr>
    <td><input type="text" name="con2" value="" size="45" placeholder="2nd contact" /></td>
  </tr>
  <tr>
    <td><input type="text" name="con3" value="" size="45" placeholder="3rd contact" /></td>
  </tr>
  <tr>
    <td><input type="text" name="wrk" value="" size="45" placeholder="Wrking @" /></td>
  </tr>
</table>
            <input type="submit" value="Update Resume" />
        </form>
</body>
</html>
