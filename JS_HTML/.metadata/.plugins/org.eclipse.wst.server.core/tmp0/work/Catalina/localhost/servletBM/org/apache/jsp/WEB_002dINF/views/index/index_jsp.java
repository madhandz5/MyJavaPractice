/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-04-22 11:37:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/user2/OneDrive/JS_HTML/servletBM/WebContent/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1586778235330L));
    _jspx_dependants.put("/WEB-INF/views/index/../include/floatDiv.jsp", Long.valueOf(1587555365994L));
    _jspx_dependants.put("/WEB-INF/views/index/../include/top.jsp", Long.valueOf(1587400821000L));
    _jspx_dependants.put("/WEB-INF/views/index/../include/header.jsp", Long.valueOf(1587382151918L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"KO\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!--viewport: 모바일브라우저에서 사용하는 가상의 window\r\n");
      out.write("  \t데스크탑의 사이트를 모바일에 표시하려고 하면 좁은 모바일 화면에 사이트를 표시하려다 보니\r\n");
      out.write("  \t요소들의 크기가 작아져 사용자가 사용하기 불편해진다. 확대해서 보든가 해야함...\r\n");
      out.write("  \t이때 viewport메타태그를 이용하면 너비나 배율을 조정할 수 있다.\r\n");
      out.write("  \twidth: 넓이\r\n");
      out.write("  \tinitial-scale : 배율\r\n");
      out.write("  \t웹환경에서는 무시되는 태그이다.\r\n");
      out.write("    -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=2.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/servletBM/resources/css/common.css\" />\r\n");
      out.write("<!-- \r\n");
      out.write("\t\torientation:portrait //단말기 세로방향\r\n");
      out.write("\t\torientation:landscape //단말기 가로방향\r\n");
      out.write("\r\n");
      out.write("\t\tmin-aspect-ratio : 최소 화면 비율\r\n");
      out.write("\t\tmax-aspect-ratio : 최대 화면 비율\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t브라우저화면상에서는 깨져서 나옴 ㅠㅠ 하지마셈\r\n");
      out.write("\t -->\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen and (min-aspect-ratio:4/3) \"\r\n");
      out.write("\thref=\"/servletBM/resources/css/Web.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen and (max-aspect-ratio:4/3)\"\r\n");
      out.write("\thref=\"/servletBM/resources/css/Mob.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/servletBM/resources/css/icon/all.css\" />\r\n");
      out.write("\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!--viewport: 모바일브라우저에서 사용하는 가상의 window\r\n");
      out.write("  \t데스크탑의 사이트를 모바일에 표시하려고 하면 좁은 모바일 화면에 사이트를 표시하려다 보니\r\n");
      out.write("  \t요소들의 크기가 작아져 사용자가 사용하기 불편해진다. 확대해서 보든가 해야함...\r\n");
      out.write("  \t이때 viewport메타태그를 이용하면 너비나 배율을 조정할 수 있다.\r\n");
      out.write("  \twidth: 넓이\r\n");
      out.write("  \tinitial-scale : 배율\r\n");
      out.write("  \t웹환경에서는 무시되는 태그이다.\r\n");
      out.write("    -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=2.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/servletBM/resources/css/common.css\" />\r\n");
      out.write("<!-- \r\n");
      out.write("\t\torientation:portrait //단말기 세로방향\r\n");
      out.write("\t\torientation:landscape //단말기 가로방향\r\n");
      out.write("\r\n");
      out.write("\t\tmin-aspect-ratio : 최소 화면 비율\r\n");
      out.write("\t\tmax-aspect-ratio : 최대 화면 비율\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t브라우저화면상에서는 깨져서 나옴 ㅠㅠ 하지마셈\r\n");
      out.write("\t -->\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen and (min-aspect-ratio:4/3) \"\r\n");
      out.write("\thref=\"/servletBM/resources/css/web.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen and (max-aspect-ratio:4/3)\"\r\n");
      out.write("\thref=\"/servletBM/resources/css/Mob.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/servletBM/resources/css/icon/all.css\" />");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header class=\"topWrapper\">\r\n");
      out.write("\t<div class=\"top\">\r\n");
      out.write("\t\t<div class=\"topLogo\">\r\n");
      out.write("\t\t\t<b>UCLASS <br>HTML\r\n");
      out.write("\t\t\t</b>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"topSearchBar\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/book/booksearch.do\">\r\n");
      out.write("\t\t\t\t<input Type=\"text\" name=\"searchBook\" placeholder=\"검색어를 입력하세요\">\r\n");
      out.write("\t\t\t\t<button value=\"\" class=\"\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-search\" style=\"color: black\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<aside class=\"floatdivWrapper\">\r\n");
      out.write("\t<div class=\"floatdiv\">\r\n");
      out.write("\t\t<!-- lnb -->\r\n");
      out.write("\t\t<h3 class=\"subject\">\r\n");
      out.write("\t\t\t<span> - 메뉴</span>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t\t<ul class=\"fdlist\">\r\n");
      out.write("\t\t\t<!-- d1 -->\r\n");
      out.write("\t\t\t<li class=\"d1\"><i class=\"far fa-clipboard\"></i> <a\r\n");
      out.write("\t\t\t\thref=\"/servletBM/notice/noticelist.do\"><span>공지사항</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"d1\"><i class=\"fas fa-search-plus\"></i> <a href=\"#!\"><span>도서검색</span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"d1\"><i class=\"far fa-question-circle\"></i> <a\r\n");
      out.write("\t\t\t\thref=\"#!\"><span>고객센터</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"d1\"><i class=\"fas fa-users\"></i> <a href=\"#!\"><span>About\r\n");
      out.write("\t\t\t\t\t\tus</span></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!-- // d1 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</aside>");
      out.write("\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<section class=\"middle\">\r\n");
      out.write("\t\t\t<div class=\"siteTitleWrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"siteTitle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sitetitle\">U CLASS 도서관</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/book/booksearch.do\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"searchButton\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>검색</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input Type=\"text\" name=\"searchBook\" placeholder=\"검색어를 입력하세요\">\r\n");
      out.write("\t\t\t\t\t\t\t<button value=\"\" class=\"searchIcon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-search\" style=\"color: black\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<nav class=\"planShop\">\r\n");
      out.write("\t\t\t<div class=\"planShopMenu\">\r\n");
      out.write("\t\t\t\t<div class=\"ps-1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/servletBM/notice/noticelist.do\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"far fa-clipboard\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>공지사항</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ps-2\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-search-plus\"></i>\r\n");
      out.write("\t\t\t\t\t<p>도서검색</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ps-3\">\r\n");
      out.write("\t\t\t\t\t<i class=\"far fa-question-circle\"></i>\r\n");
      out.write("\t\t\t\t\t<p>QnA</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ps-4\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t<p>AboutUs</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"product\">\r\n");
      out.write("\t\t\t<div class=\"productWrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"productBox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"issueTitle\">\r\n");
      out.write("\t\t\t\t\t\t<span>인기 도서</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"productLine\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"issueTitle\">스테디셀러</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"productLine\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"issueTitle\">최근 대출 도서</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"productLine\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"issueTitle\">최근 입고 도서</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"productLine\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"productItem\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/servletBM/resources/image/비행운.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t비행운<br>작가:김애란\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer class=\"bottom\"> bottom </footer>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/index/../include/top.jsp(28,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"topLogin\">\r\n");
          out.write("\t\t\t\t<a href=\"/servletBM/member/login.do\">로그인</a> / <a\r\n");
          out.write("\t\t\t\t\thref=\"/servletBM/member/join.do\">회원가입</a>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/index/../include/top.jsp(34,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"topLogin\">\r\n");
          out.write("\t\t\t\t<a href=\"/servletBM/mypage/mypage.do\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.m_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님\r\n");
          out.write("\t\t\t\t\t환영합니다. MyPage</a> / <a href=\"/servletBM/member/logoutimple.do\">Logout</a>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
