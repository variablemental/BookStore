package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>注册</title>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        \r\n");
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
      out.write("\r\n");
      out.write("        #wrapper {\r\n");
      out.write("            background-color: #F4F0EE;\r\n");
      out.write("            border-top: 1px solid #ccc;\r\n");
      out.write("            border-bottom: 1px solid #ccc;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            padding-top: 25px;\r\n");
      out.write("            margin: -170px 0 0 0;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            top: 40%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #tabs>div {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 400px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #tabs h3 {\r\n");
      out.write("            font-size: 40px;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            margin: 60px 0 20px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #wel h2 {\r\n");
      out.write("            font-size: 45px;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            color: #ABCDEF;\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #wel h2 span {\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            line-height: 10px;\r\n");
      out.write("            color: #ABCDEF;\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #pager {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin: -76px auto 25px auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table td {\r\n");
      out.write("            width: 130px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function uNotNULL(){\r\n");
      out.write("            var username=document.getElementById(\"name\").value.trim();\r\n");
      out.write("            var ualert=document.getElementById(\"uAlert\");\r\n");
      out.write("            if(username.length==0){\r\n");
      out.write("                ualert.innerHTML=\"<font size='15' color='red'>用户名不能为空</font>\";\r\n");
      out.write("            }else{\r\n");
      out.write("                ualert.innerHTML=\"\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function pNotNULL(){\r\n");
      out.write("            var password=document.getElementById(\"password\").value.trim();\r\n");
      out.write("            var palert=document.getElementById(\"pAlert\");\r\n");
      out.write("            if(password.length==0){\r\n");
      out.write("                palert.innerHTML=\"<font size='15' color='red'>密码不能为空</font>\";\r\n");
      out.write("            }else{\r\n");
      out.write("                palert.innerHTML=\"\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function validate(){\r\n");
      out.write("            var password=document.getElementById(\"password\").value.trim();\r\n");
      out.write("            var username=document.getElementById(\"name\").value.trim();\r\n");
      out.write("            if(username.length==0 || password.length==0){\r\n");
      out.write("                return false;\r\n");
      out.write("            }else{\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("    <div align=\"center\"> \r\n");
      out.write("        <img src=\"../images/4.jpg\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"pager\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"tabs\">\r\n");
      out.write("            <div id=\"pink\" align=\"center\">\r\n");
      out.write("                <h3>\r\n");
      out.write("                    <img src=\"../images/1.png\" />\r\n");
      out.write("                    书店管理系统\r\n");
      out.write("                </h3>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <s:actionerror/>\r\n");
      out.write("\r\n");
      out.write("                <form name=\"form\" method=\"post\" action=\"memberaction.do?action=3\">\r\n");
      out.write("                    <table width=\"400px\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td align=\"right\">\r\n");
      out.write("                                <label for=\"name\">\r\n");
      out.write("                                    用户名：\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name=\"name\" id=\"name\" onblur=\"uNotNULL()\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id=\"uAlert\"></div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td align=\"right\">\r\n");
      out.write("                                <label for=\"password\">\r\n");
      out.write("                                    密码 ：\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" onblur=\"pNotNULL()\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id=\"pAlert\"></div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        性别：\r\n");
      out.write("                        <input type=\"radio\" checked=\"checked\" name=\"level\" value=\"male\"/>男&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"radio\" name=\"level\" value=\"female\" />女&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <div class=\"buttons\">\r\n");
      out.write("                        <input type=\"submit\" value=\"注册\" /> <!--formaction=\"origin.jsp\"-->\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp; <input type=\"reset\" value=\"重置\" />\r\n");
      out.write("                    </div><br/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </table><br/>  \r\n");
      out.write("                        \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
