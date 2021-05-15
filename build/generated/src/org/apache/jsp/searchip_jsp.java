package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
