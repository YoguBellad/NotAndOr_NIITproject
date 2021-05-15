package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("textarea { font-size: 13px }\n");
      out.write("\n");
      out.write("body,td,th {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-family: \"Comic Sans MS\", cursive;\n");
      out.write("\tbackground-color: #C3C3C3;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<h1 align=\"center\"> !&O Search</h1>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<form  action=\"searchip.jsp\">\n");
      out.write("<div align=\"center\">\n");
      out.write("<textarea name=\"Search web\" cols=\"50\" rows=\"2\"></textarea>\n");
      out.write("<select name=\"eng\">\n");
      out.write("    <option>Wikipedia</option>\n");
      out.write("    <option>Bing</option>\n");
      out.write("    <option>Maps</option>\n");
      out.write("    <option>Google Search</option>\n");
      out.write("    <option>Google Images</option>\n");
      out.write("    <option>You Tube</option>\n");
      out.write("    <option>Yahoo</option>\n");
      out.write("    <option>Dictionary</option>\n");
      out.write("    <option>IMDB</option>\n");
      out.write("    <option>BBC</option>\n");
      out.write("    <option>Flipkart</option>\n");
      out.write("</select>\n");
      out.write("<input type=\"submit\" value=\"Browse\" />\n");
      out.write("<p>\n");
      out.write("<div align=\"centre\" >\n");
      out.write("    <img src=\"sea/imageslogo.jpg\" width=\"131\" height=\"131\" alt=\"imageslogo\"/>\n");
      out.write("    <img src=\"sea/moplogo.jpg\" width=\"131\" height=\"131\" alt=\"moplogo\"/>\n");
      out.write("    <img src=\"sea/yahoo logo.jpg\" width=\"150\" height=\"90\" alt=\"yahoo logo\"/>\n");
      out.write("    <img src=\"sea/bbclogo.jpg\" width=\"120\" height=\"50\" alt=\"bbclogo\"/>\n");
      out.write("    <img src=\"sea/images.jpg\" width=\"94\" height=\"37\" alt=\"images\"/>\n");
      out.write("    <img src=\"sea/binglogo.jpg\" width=\"92\" height=\"47\" alt=\"binglogo\"/>\n");
      out.write("    <img src=\"sea/diclogo.jpg\" width=\"117\" height=\"78\" alt=\"diclogo\"/>\n");
      out.write("    <img src=\"sea/googleSearchlogo.jpg\" width=\"104\" height=\"104\" alt=\"googleSearchlogo\"/>\n");
      out.write("    <img src=\"sea/imdb logo.jpg\" width=\"150\" height=\"72\" alt=\"imdb logo\"/>\n");
      out.write("    <img src=\"sea/utubelogo.jpg\" width=\"123\" height=\"53\" alt=\"utubelogo\"/>\n");
      out.write("    <img src=\"sea/wikilogo.jpg\" width=\"86\" height=\"90\" alt=\"wikilogo\"/>\n");
      out.write("    <img src=\"sea/yahoo logo.jpg\" width=\"150\" height=\"90\" alt=\"yahoo logo\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("    <!--<input    type=\"image\" name=\"submit\" value='gi' src=\"googlimages\" />\n");
      out.write("    <input    type=\"image\" name=\"submit\"  value='wiki' src=\"wiki\" />-->\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
