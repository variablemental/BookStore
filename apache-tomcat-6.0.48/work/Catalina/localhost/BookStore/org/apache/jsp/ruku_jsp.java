package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ruku_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>图书入库</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        html,body {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            min-height: 600px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body * {\r\n");
      out.write("            font-family: Arial, Geneva, SunSans-Regular, sans-serif;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            line-height: 22px;\r\n");
      out.write("        }\r\n");
      out.write("        #tabs>div {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 800px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #tabs h3 {\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            margin: 60px 0 20px 0;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute; width:100%; height:100%; z-index:-1\">\r\n");
      out.write("    <img src=\"images/11.jpg\" height=\"100%\" width=\"100%\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"tabs\">\r\n");
      out.write("    <div id=\"pink\" align=\"center\">\r\n");
      out.write("        <h3>\r\n");
      out.write("            图书入库\r\n");
      out.write("        </h3><br/><br/>\r\n");
      out.write("        <form name=\"form\" method=\"post\" action=\"bookmanagementaction.do?action=20\">\r\n");
      out.write("            书籍编号：\r\n");
      out.write("             <input type=\"text\" name=\"bookid\" />   <br/><br/>\r\n");
      out.write("             书名：\r\n");
      out.write("             <input type=\"text\" name=\"bookname\" />   <br/><br/>\r\n");
      out.write("            作者：\r\n");
      out.write("             <input type=\"text\" name=\"bookauthor\" />   <br/><br/>\r\n");
      out.write("            出版社：\r\n");
      out.write("             <input type=\"text\" name=\"bookpress\" />   <br/><br/>\r\n");
      out.write("             价格：\r\n");
      out.write("             <input type=\"text\" name=\"bookprice\" />   <br/><br/>\r\n");
      out.write("            入库数量：\r\n");
      out.write("            <input type=\"text\" name=\"rc\" />   <br/><br/>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <div class=\"buttons\">\r\n");
      out.write("            <input type=\"submit\" value=\"继续添加\" /> &nbsp;&nbsp;&nbsp;&nbsp; <input type=\"submit\" value=\"提交\" />\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("           <a href=\"Main.jsp\">返回首页</a>\r\n");
      out.write("         </form>   \r\n");
      out.write("        </div><br/>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
