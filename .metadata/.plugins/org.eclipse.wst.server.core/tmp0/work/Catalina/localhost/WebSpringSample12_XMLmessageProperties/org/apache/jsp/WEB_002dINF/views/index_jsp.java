/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-10-20 07:16:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>JSR-303ErrorMessageCustmarizing</h1>\r\n");
      out.write("	<img src=\"image/bmwmodel_205.png\"/><br>\r\n");
      out.write("	\r\n");
      out.write("	<h2>Validation Check</h2>\r\n");
      out.write("	<a href=\"input_data\">input_data</a><br>\r\n");
      out.write("	<a href=\"input_data2\">input_data2</a><br>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!--  ErrorMessageCustermarizing\r\n");
      out.write(".JSR-303\r\n");
      out.write("---------------------\r\n");
      out.write(" - JSR-303\r\n");
      out.write(" 1) JSR-303 어노테이션은 빈 객체에 주입되는 값의 유효성 검사를 하기 위해 제공되는 어노테이션입니다.\r\n");
      out.write("    여기에서는 자주 사용하는 것만 골라서 보도록 하겠습니다.\r\n");
      out.write(" 2) https://beanvalidation.org/1.0/spec/\r\n");
      out.write("\r\n");
      out.write("	@AssertTrue : true가 아닌 값이 들어오면 오류\r\n");
      out.write("	@AssertFalse : false가 아닌 값이 들어오면 오류\r\n");
      out.write("	@Max(값) : 값보다 큰 값이 들어오면 오류\r\n");
      out.write("	@Min(값) : 값보다 작은 값이 들어오면 오류\r\n");
      out.write("\r\n");
      out.write(" 3) @DecimalMax(value=값, inclusive=true/false) : 값보다 작거나 같은 값이 들어와야 합니다. \r\n");
      out.write("    Inclusive가 false면 값은 포함하지 않기 때문에 작은 값이 들어와야 합니다. 생략하면 true\r\n");
      out.write("\r\n");
      out.write(" 4) @DecimalMin(value=값, inclusive=true/false) : 값보다 크거나 같은 값이 들어와야 합니다. \r\n");
      out.write("    Inclusive가 false면 값은 포함하지 않기 때문에 큰 값이 들어와야 합니다. 생략하면 true\r\n");
      out.write("\r\n");
      out.write(" 5) @Null : 값이 들어오면 오류가 발생.\r\n");
      out.write("    @NotNull : 값이 들어오지 않으면 오류가 발생.\r\n");
      out.write("    @Digits(integer=자릿수,fraction=자릿수) : 지정된 자릿수의 숫자가 아닐 경우 오류가 발생. \r\n");
      out.write("         Integer – 정수 자릿수, fraction – 실수 자릿수\r\n");
      out.write("    @Size(min=글자수,max=글자수) : 지정된 글자수 보다 짧거나 길면 오류가 발생\r\n");
      out.write("\r\n");
      out.write("  6) @Pattern(regexp=정규식) : 주어진 정규식에 위배되면 오류 발생\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("  \r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
