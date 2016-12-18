package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class showForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"position:absolute; width:100%; height:100%; z-index:-1\">\r\n");
      out.write("    <img src=\"images/11.jpg\" height=\"100%\" width=\"100%\">\r\n");
      out.write("</div>\r\n");
      out.write(" <br>\r\n");
      out.write("\t <table width=\"90%\"  border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#CCCFFF\" bgcolor=\"#CCCFFF\">\r\n");
      out.write("\t");

	List list2=(List)request.getAttribute("peso");
	
      out.write("\r\n");
      out.write("\t     \t\t <tr>\r\n");
      out.write("\t\t\t <th align=\"left\">订单编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">书籍编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">用户编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">管理员编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">数量</th>\r\n");
      out.write("\t\t\t <th align=\"right\">单价</th>\r\n");
      out.write("\t\t\t <th align=\"right\">总价</th>\r\n");
      out.write("\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t ");

		Map<String,String> map;
	 	for(int i=0;i<list2.size();i++){
	 		map=(Map)list2.get(i);			
	 
      out.write("\r\n");
      out.write("     \t<!--\t <tr>\r\n");
      out.write("\t\t\t <th align=\"left\">订单编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">书籍编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">用户编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">管理员编号</th>\r\n");
      out.write("\t\t\t <th align=\"right\">数量</th>\r\n");
      out.write("\t\t\t <th align=\"right\">单价</th>\r\n");
      out.write("\t\t\t <th align=\"right\">总价</th>\r\n");
      out.write("\r\n");
      out.write("\t\t    </tr>    -->\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t \t<td align=\"left\">");
      out.print(map.get("O_id"));
      out.write("</td>\r\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("B_id"));
      out.write("</td>\r\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("U_id"));
      out.write("</td>\t\r\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("A_id") );
      out.write("</td>\t\r\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("O_num"));
      out.write("</td>\t \r\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("B_up"));
      out.write("</td>\r\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("B_tp"));
      out.write("</td>        \r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("      <a href=\"Main.jsp\">返回</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t");
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
