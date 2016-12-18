package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class showMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" <br>\n");
      out.write("\t <table width=\"90%\"  border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#CCCCCC\">\n");
      out.write("\t");

	Map<String,String> map=(Map)request.getAttribute("peso");
	
      out.write("\n");
      out.write("         \t\t <tr>\n");
      out.write("\t\t\t <th align=\"right\">会员姓名</th>\n");
      out.write("\t\t\t <th align=\"right\">会员密码 </th>\n");
      out.write("\t\t </tr>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t <tr>\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("username"));
      out.write("</td>\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("password"));
      out.write("</td>\t\n");
      out.write("    </tr>  \n");
      out.write("          </table>\n");
      out.write("      <a href=\"Main.jsp\">返回首页</a>\n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\t\t\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
