package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class showBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div style=\"position:absolute; width:100%; height:100%; z-index:-1\">\n");
      out.write("    <img src=\"images/11.jpg\" height=\"100%\" width=\"100%\">\n");
      out.write("</div>\n");
      out.write(" <br>\n");
      out.write("\t <table width=\"90%\"  border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#CCCCCC\">\n");
      out.write("\t");

	List list2=(List)request.getAttribute("peso");
	
      out.write("\n");
      out.write("         \t\t <tr>\n");
      out.write("\t\t\t <th align=\"left\">序号</th>\n");
      out.write("\t\t\t <th align=\"right\">书籍编号</th>\n");
      out.write("\t\t\t <th align=\"right\">书籍名称 </th>\n");
      out.write("\t\t\t <th align=\"right\">出版社</th>\n");
      out.write("\t\t\t <th align=\"right\">作者 </th>\n");
      out.write("\t\t\t <th align=\"right\">价格 </th>\n");
      out.write("             <th align=\"right\">库存数量 </th>\n");
      out.write("\n");
      out.write("\t\t </tr>\n");
      out.write("\t\n");
      out.write("\t ");

		Map<String,String> map;
	 	for(int i=0;i<list2.size();i++){
	 		map=(Map)list2.get(i);			
	 
      out.write("\n");
      out.write("\n");
      out.write("\t <tr>\n");
      out.write("\t \t<td align=\"left\">");
      out.print(map.get("id"));
      out.write("</td>\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("ISBN"));
      out.write("</td>\n");
      out.write("\t \t<td align=\"right\">");
      out.print(map.get("name"));
      out.write("</td>\t\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("press"));
      out.write("</td>\t\n");
      out.write("        <td align=\"right\">");
      out.print(map.get("Author"));
      out.write("</td>\t \n");
      out.write("        <td align=\"right\">");
      out.print(map.get("price"));
      out.write("</td>  \n");
      out.write("        <td align=\"right\">");
      out.print(map.get("num"));
      out.write("</td>  \n");
      out.write("        \n");
      out.write("\t");
}
      out.write("\n");
      out.write("      </table>\n");
      out.write("      <a href=\"Main.jsp\">返回首页</a>\n");
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
