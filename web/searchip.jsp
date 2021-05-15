<%--
    Document   : searchip
    Created on : Aug 4, 2013, 6:01:05 AM
    Author     : yogu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            String url="";
            String wd=request.getParameter("Search web");
            String eng=request.getParameter("eng");
            if(eng.equals("Google Images"))
            {
                url="https://www.google.com/search?q="+wd+"&ie=utf-8&oe=utf-8&aq=t&rls={moz:distributionID}:{moz:locale}:{moz:official}&biw=1280&bih=895&sei=CKX9UdaIHIWJrAeo2IBY&tbm=isch";
            }
            if(eng.equals("Wikipedia"))
            {
                url="http://en.wikipedia.org/wiki/"+wd;
            }
            if(eng.equals("Bing"))
            {
                url="http://www.bing.com/search?q="+wd+"&src=IE-SearchBox&FORM=IE8SRC";
            }
            if(eng.equals("Maps"))
            {
                url="http://www.geotruc.net/?q="+wd;
            }
            if(eng.equals("Google Search"))
            {
                url="http://www.google.co.in/search?q="+wd+"&sourceid=ie7&rls=com.microsoft:en-us:IE-SearchBox&ie=&oe=&gws_rd=cr&ei=OM73Uc2CIoyErAfvooCoCw";
            }
            if(eng.equals("You Tube"))
            {
                url="http://www.youtube.com/results?search_query="+wd;
            }
            if(eng.equals("Yahoo"))
            {
                url="http://search.yahoo.com/search?p="+wd+"&b=&fr=ie8";
            }
            if(eng.equals("Dictionary"))
            {
                url="http://dictionary.reference.com/browse/"+wd+"?s=t";
            }
            if(eng.equals("IMDB"))
            {
                url="http://www.imdb.com/find?q="+wd+"&s=all";
            }
            if(eng.equals("BBC"))
            {
                url="www.bbc.co.uk/search/news/?q="+wd;
            }
            if(eng.equals("Flipkart"))
            {
                url="http://www.flipkart.com/search?q="+wd+"&as=off&as-show=off&otracker=start";
            }
        response.sendRedirect(url);
        %>
    </body>
</html>
