package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.db_interactor;

public final class biodate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 db_interactor tm=new db_interactor(); 
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-family: \"Comic Sans MS\", cursive;\n");
      out.write("\tbackground-color: #C3C3C3;\n");
      out.write("}\n");
      out.write("textarea { font-size: 20px }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("<body bgcolor=\"#C0DCC0\" align=\"centre\">\n");
      out.write("     ");
  if(!(request.getParameter("y").equals(null)))
    {
        String doj=(request.getParameter("y")+request.getParameter("m")+request.getParameter("d"));
    }

        
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"1220\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1216\" height=\"80\"><table width=\"1218\" height=\"75\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <tr>\n");
      out.write("          <td width=\"229\" height=\"54\">!&O</td>\n");
      out.write("        <td width=\"770\">headr</td>\n");
      out.write("        <td width=\"211\"><h2 align=\"right\">\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.print( tm.time("h").substring(0,10)  );
      out.write("\n");
      out.write("\n");
      out.write("   <p></p>\n");
      out.write("     ");
      out.print( tm.time("h").substring(10,tm.time("h").length()-3)  );
      out.write("\n");
      out.write(" </h2></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"430\" align=\"right\"><table width=\"1235\" height=\"437\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("       <tr>\n");
      out.write("        <td width=\"176\">&nbsp;</td>\n");
      out.write("        <td width=\"822\">&nbsp;</td>\n");
      out.write("        <td width=\"229\"><a href=\"resume.jsp\">Resume</a></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td><a href=\"bio.jsp\">Biography</a></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td><a href=\"mail.jsp\">Mail</a></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr align=\"center\">\n");
      out.write("    <td  align=\"centre\" height=\"150\">&nbsp;\n");
      out.write("        <form action=\"bioupdate.jsp\">\n");
      out.write("      <textarea placeholder=\"Quote on wats happening wit u\" name=\"bioip\" cols=\"100\" rows=\"1\"></textarea>\n");
      out.write("      <textarea placeholder=\"Wats happening wit u\" name=\"bioip\" cols=\"100\" rows=\"6\"></textarea>\n");
      out.write("      <input type=\"image\" name=\"submit\" value=\"biobut\" src=\"nao/etc/update bio.jpg\" />\n");
      out.write("\n");
      out.write("      <form action=\"biodate.jsp\">\n");
      out.write("          <input type=\"text\" name=\"y\" Placeholder=\"yyyy\" size=\"4\"/>/<input type=\"text\" name=\"m\" size=\"2\" Placeholder=\"mm\" />/<input type=\"text\" name=\"d\" Placeholder=\"dd\" size=\"2\" />\n");
      out.write("          <input type=\"submit\" value=\"Jump to\" />\n");
      out.write("        </form></form></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
