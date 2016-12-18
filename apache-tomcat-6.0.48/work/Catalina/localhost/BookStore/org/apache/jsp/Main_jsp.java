package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <title>系统主页面</title>\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("        .center{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("        .center ul{\r\n");
      out.write("            list-style-type:none;\r\n");
      out.write("            margin:0;\r\n");
      out.write("            padding:0;\r\n");
      out.write("            overflow:hidden;\r\n");
      out.write("            display:inline-block;\r\n");
      out.write("        }\r\n");
      out.write("        .center li{\r\n");
      out.write("            float:left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        p.title{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("            font-size:3em;\r\n");
      out.write("            color:white;\r\n");
      out.write("            line-height:20px;\r\n");
      out.write("            font-weight:bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*设置主体类型样式*/\r\n");
      out.write("        .content{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            left:33%;\r\n");
      out.write("            top:35%;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            height: 60%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content #picture{\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("        }\r\n");
      out.write("        #sddm\r\n");
      out.write("        {   margin: 0 auto;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            z-index: 30;\r\n");
      out.write("            background-color:#F4F4F4;\r\n");
      out.write("            width: 325px;\r\n");
      out.write("            height:24px;}\r\n");
      out.write("        #sddm li\r\n");
      out.write("        {   margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            float: left;\r\n");
      out.write("            font: bold 14px arial}\r\n");
      out.write("        #sddm li a\r\n");
      out.write("        {   display: block;\r\n");
      out.write("            margin: 0 1px 0 0;\r\n");
      out.write("            padding: 4px 10px;\r\n");
      out.write("            width: 60px;\r\n");
      out.write("            background: #5970B2;\r\n");
      out.write("            color: #FFF;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none}\r\n");
      out.write("        #sddm li a:hover\r\n");
      out.write("        {   background: #49A3FF}\r\n");
      out.write("        #sddm div\r\n");
      out.write("        {   position: absolute;\r\n");
      out.write("            visibility: hidden;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background: #EAEBD8;\r\n");
      out.write("            border: 1px solid #5970B2}\r\n");
      out.write("        #sddm div a\r\n");
      out.write("        {   position: relative;\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 5px 10px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background: #EAEBD8;\r\n");
      out.write("            color: #2875DE;\r\n");
      out.write("            font: 18px arial}\r\n");
      out.write("        #sddm div a:hover\r\n");
      out.write("        {   background: #49A3FF;\r\n");
      out.write("            color: #FFF}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        <!--\r\n");
      out.write("        var timeout = 100;\r\n");
      out.write("        var closetimer = 10;\r\n");
      out.write("        var ddmenuitem = 0;\r\n");
      out.write("        // open hidden layer\r\n");
      out.write("        function mopen(id)\r\n");
      out.write("        {\r\n");
      out.write("            // cancel close timer\r\n");
      out.write("            mcancelclosetime();\r\n");
      out.write("            // close old layer\r\n");
      out.write("            if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';\r\n");
      out.write("            // get new layer and show it\r\n");
      out.write("            ddmenuitem = document.getElementById(id);\r\n");
      out.write("            ddmenuitem.style.visibility = 'visible';\r\n");
      out.write("        }\r\n");
      out.write("        // close showed layer\r\n");
      out.write("        function mclose()\r\n");
      out.write("        {\r\n");
      out.write("            if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';\r\n");
      out.write("        }\r\n");
      out.write("        // go close timer\r\n");
      out.write("        function mclosetime()\r\n");
      out.write("        {\r\n");
      out.write("            closetimer = window.setTimeout(mclose, timeout);\r\n");
      out.write("        }\r\n");
      out.write("        // cancel close timer\r\n");
      out.write("        function mcancelclosetime()\r\n");
      out.write("        {\r\n");
      out.write("            if(closetimer)\r\n");
      out.write("            {\r\n");
      out.write("                window.clearTimeout(closetimer);\r\n");
      out.write("                closetimer = null;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        // close layer when click-out\r\n");
      out.write("        document.onclick = mclose;\r\n");
      out.write("        // -->\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute; width:100%; height:100%; z-index:-1\">\r\n");
      out.write("    <img src=\"images/about.gif\" height=\"100%\" width=\"100%\">\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<br/><br/>\r\n");
      out.write("    <p class=\"title\">欢迎使用书店管理系统</p><br/>\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("        <img src=\"images/1.gif\">\r\n");
      out.write("        <ul id=\"sddm\">\r\n");
      out.write("            <li><a href=\"Main.jsp\" target=\"_top\" class=\"chosen\">首页</a></li>\r\n");
      out.write("            <li><a href=\"#\" onmouseover=\"mopen('m1')\" onmouseout=\"mclosetime()\" target=\"_top\">前台销售</a>\r\n");
      out.write("                <div id=\"m1\" onmouseover=\"mcancelclosetime()\" onmouseout=\"mclosetime()\">\r\n");
      out.write("                    <a href=\"sell.jsp\">图书销售</a>\r\n");
      out.write("                    <a href=\"search.jsp\">图书查询</a>\r\n");
      out.write("                    <a href=\"search-nf.jsp\">查询不足</a>\r\n");
      out.write("                    <a href=\"search-dingdan.jsp\">订单查询</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\" target=\"_top\" onmouseover=\"mopen('m2')\" onmouseout=\"mclosetime()\">后台管理</a>\r\n");
      out.write("                <div id=\"m2\" onmouseover=\"mcancelclosetime()\" onmouseout=\"mclosetime()\">\r\n");
      out.write("                    <a href=\"ruku.jsp\">图书入库</a>\r\n");
      out.write("                    <a href=\"ruku-jilu.jsp\">入库记录</a>\r\n");
      out.write("                    <a href=\"return-manage.jsp\">退书管理</a>\r\n");
      out.write("                    <a href=\"return-search.jsp\">退书查询</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\" target=\"_top\" onmouseover=\"mopen('m3')\" onmouseout=\"mclosetime()\">高级管理</a>\r\n");
      out.write("                <div id=\"m3\" onmouseover=\"mcancelclosetime()\" onmouseout=\"mclosetime()\">\r\n");
      out.write("                \r\n");
      out.write("                    <a href=\"vip.jsp\">会员管理</a>\r\n");
      out.write("                    <a href=\"manager.jsp\">管理员管理</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
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
