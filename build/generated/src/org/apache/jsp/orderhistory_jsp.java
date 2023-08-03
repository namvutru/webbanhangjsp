package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/orderhistory.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script> \n");
      out.write("     <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.js\"></script>\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\" rel=\"stylesheet\"/>\n");
      out.write("    \n");
      out.write("     <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\n");
      out.write("<div class=\"container bootdey\">\n");
      out.write("    <div class=\"panel panel-default panel-order\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <strong>Order history</strong>\n");
      out.write("            <div class=\"btn-group pull-right\">\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default btn-xs dropdown-toggle\" data-toggle=\"dropdown\">Filter history <i class=\"fa fa-filter\"></i></button>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        <li><a href=\"#\">Approved orders</a></li>\n");
      out.write("                        <li><a href=\"#\">Pending orders</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"><img src=\"https://bootdey.com/img/Content/user_3.jpg\" class=\"media-object img-thumbnail\" /></div>\n");
      out.write("                <div class=\"col-md-11\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"pull-right\"><label class=\"label label-danger\">rejected</label></div>\n");
      out.write("                            <span><strong>Order name</strong></span> <span class=\"label label-info\">group name</span><br />\n");
      out.write("                            Quantity : 2, cost: $323.13 <br />\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-success btn-xs glyphicon glyphicon-ok\" href=\"#\" title=\"View\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-danger btn-xs glyphicon glyphicon-trash\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-info btn-xs glyphicon glyphicon-usd\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">order made on: 05/31/2014 by <a href=\"#\">Jane Doe </a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"><img src=\"https://bootdey.com/img/Content/user_1.jpg\" class=\"media-object img-thumbnail\" /></div>\n");
      out.write("                <div class=\"col-md-11\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"pull-right\"><label class=\"label label-info\">pending</label></div>\n");
      out.write("                            <span><strong>Order name</strong></span> <span class=\"label label-info\">group name</span><br />\n");
      out.write("                            Quantity : 12, cost: $12623.13<br />\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-success btn-xs glyphicon glyphicon-ok\" href=\"#\" title=\"View\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-danger btn-xs glyphicon glyphicon-trash\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-info btn-xs glyphicon glyphicon-usd\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">order made on: 06/12/2014 by <a href=\"#\">Jane Doe </a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"><img src=\"https://bootdey.com/img/Content/user_3.jpg\" class=\"media-object img-thumbnail\" /></div>\n");
      out.write("                <div class=\"col-md-11\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"pull-right\"><label class=\"label label-success\">Approved</label></div>\n");
      out.write("                            <span><strong>Order name</strong></span> <span class=\"label label-info\">group name</span><br />\n");
      out.write("                            Quantity : 4, cost: $523.13<br />\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-success btn-xs glyphicon glyphicon-ok\" href=\"#\" title=\"View\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-danger btn-xs glyphicon glyphicon-trash\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-info btn-xs glyphicon glyphicon-usd\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">order made on: 06/20/2014 by <a href=\"#\">Jane Doe</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"><img src=\"https://bootdey.com/img/Content/user_2.jpg\" class=\"media-object img-thumbnail\" /></div>\n");
      out.write("                <div class=\"col-md-11\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"pull-right\"><label class=\"label label-info\">pending</label></div>\n");
      out.write("                            <span><strong>Order name</strong></span> <span class=\"label label-info\">group name</span><br />\n");
      out.write("                            Quantity : 4, cost: $523.13<br />\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-success btn-xs glyphicon glyphicon-ok\" href=\"#\" title=\"View\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-danger btn-xs glyphicon glyphicon-trash\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                            <a data-placement=\"top\" class=\"btn btn-info btn-xs glyphicon glyphicon-usd\" href=\"#\" title=\"Danger\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">order made on: 06/20/2014 by <a href=\"#\">Jane Doe</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">Put here some note for example: bootdey si a gallery of free bootstrap snippets bootdeys</div>\n");
      out.write("    </div>\n");
      out.write("</div>>\n");
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
