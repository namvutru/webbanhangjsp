package org.apache.jsp.jsfile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"basket-labels\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"item item-heading\">Item</li>\n");
      out.write("          <li class=\"price\">Price</li>\n");
      out.write("          <li class=\"quantity\">Quantity</li>   \n");
      out.write("          <li class=\"subtotal\">Subtotal</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.items}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\">\n");
      out.write("      <div class=\"basket-product\">\n");
      out.write("          \n");
      out.write("        <div class=\"item\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.anhsp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"product-frame\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-details\">\n");
      out.write("            <h1><strong><span class=\"item-quantity\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.tensp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <p><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.loaisp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></p>\n");
      out.write("            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.masp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.sellprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <div class=\"quantity\"\n");
      out.write("            <button><a href=\"addminus?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.masp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&num=1\">(+)</a></button>   <div class=\"number\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quanlity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div><a href=\"addminus?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.masp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&num=-1\">(-)</a> \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"subtotal\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.sellprice*i.quanlity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <div class=\"remove\">\n");
      out.write("            <a href=\"remove?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.masp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >Remove</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("          </c:forEach>\n");
      out.write("        \n");
      out.write("        <a href=\"home\" class=\"ctshop\">Continute shopping</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
