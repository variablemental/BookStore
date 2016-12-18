package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>操作失败</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        p.title{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("            font-size:3em;\r\n");
      out.write("            color:black;\r\n");
      out.write("            line-height:20px;\r\n");
      out.write("            font-weight:bold;\r\n");
      out.write("        }\r\n");
      out.write("        font{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        onload=function(){\r\n");
      out.write("            setInterval(go, 1000);\r\n");
      out.write("        };\r\n");
      out.write("        var x=3; //利用了全局变量来执行\r\n");
      out.write("        function go(){\r\n");
      out.write("            x--;\r\n");
      out.write("            if(x>0){\r\n");
      out.write("                document.getElementById(\"sp\").innerHTML=x+\"自动跳转到首页\"; //每次设置的x的值都不一样了。\r\n");
      out.write("            }else{\r\n");
      out.write("                location.href='Main.jsp';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"position:absolute; width:100%; height:100%; z-index:-1\">\r\n");
      out.write("    <img src=\"../images/11.jpg\" height=\"100%\" width=\"100%\">\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    <p class=\"title\">很抱歉，操作失败。。</p><br/>\r\n");
      out.write("    <font class=\"font\" color=\"red\" size=\"3\"> <br/> <br/>\r\n");
      out.write("        三秒后将跳转到首页面 <br> <br> 如果没有跳转,请按 <a href=\"Main.jsp\">这里</a>!!!\r\n");
      out.write("        <br/> </font>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
