package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProductDAO;
import java.util.List;
import model.Product;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
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
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/webmaincss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"jsfile/jswebmain.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("  <nav class=\"navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar bg-secondary\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("      \n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("         <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("          </li>   \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link waves-effect\" href=\"show\">\n");
      out.write("              <span class=\"badge red z-depth-1 mr-1\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("              <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("              <span class=\"clearfix d-none d-sm-inline-block\"> Cart </span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"carousel-example-1z\" class=\"carousel slide carousel-fade pt-4\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/8-col/img%282%29.jpg'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Shopping is happy</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <p>\n");
      out.write("                <strong>Shopping shopping and shopping</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <p class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>The most comprehensive tutorial for the Bootstrap 4. Loved by over 500 000 users. Video and written versions\n");
      out.write("                  available. Create your own, stunning website.</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"https://mdbootstrap.com/education/bootstrap/\" class=\"btn btn-outline-white btn-lg\">Start free tutorial\n");
      out.write("                <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/8-col/img%283%29.jpg'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Learn Bootstrap 4 with MDB</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <p>\n");
      out.write("                <strong>Best & free guide of responsive web design</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <p class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>The most comprehensive tutorial for the Bootstrap 4. Loved by over 500 000 users. Video and written versions\n");
      out.write("                  available. Create your own, stunning website.</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"https://mdbootstrap.com/education/bootstrap/\" class=\"btn btn-outline-white btn-lg\">Start free tutorial\n");
      out.write("                <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/8-col/img%285%29.jpg'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("            \n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Learn Bootstrap 4 with MDB</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <p>\n");
      out.write("                <strong>Best & free guide of responsive web design</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <p class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>The most comprehensive tutorial for the Bootstrap 4. Loved by over 500 000 users. Video and written versions\n");
      out.write("                  available. Create your own, stunning website.</strong>\n");
      out.write("              </p>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"https://mdbootstrap.com/education/bootstrap/\" class=\"btn btn-outline-white btn-lg\">Start free tutorial\n");
      out.write("                <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("  <main>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5\">\n");
      out.write("        <span class=\"navbar-brand\">Categories:</span>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#basicExampleNav\" aria-controls=\"basicExampleNav\"\n");
      out.write("          aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"basicExampleNav\">\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link text-secondary\" href=\"home\">All\n");
      out.write("                <span class=\"sr-only\">(current)</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link text-secondary\" href=\"class?loai=headphone\">Headphone</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link text-secondary\" href=\"class?loai=smartphone\">Smartphone</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link text-secondary\" href=\"class?loai=phonecharger\">Phone Charger</a>\n");
      out.write("            </li>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            \n");
      out.write("            <li>\n");
      out.write("                <form>\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                    <a type=\"button\" href=\"home\" class=\"btn btn-primary text-white bg-secondary\">Filter</a>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger dropdown-toggle dropdown-toggle-split bg-secondary\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\">\n");
      out.write("                        <span class=\"text-secondary\">Type:</span>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"typefilter\" type=\"radio\" value=\"\"  id=\"flexCheckDefault\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckDefault\">\n");
      out.write("                          Smartphone\n");
      out.write("                        </label>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"typefilter\" type=\"radio\" value=\"\" id=\"flexCheckChecked\" >\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckChecked\">\n");
      out.write("                          Headphone\n");
      out.write("                        </label>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"typefilter\" type=\"radio\" value=\"\" id=\"flexCheckChecked\" >\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckChecked\">\n");
      out.write("                          Phonecharger\n");
      out.write("                        </label>\n");
      out.write("                      </div> \n");
      out.write("                         <span class=\"text-secondary\">Price:</span>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"pricefilter\" type=\"radio\" value=\"\"  id=\"flexCheckDefault\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckDefault\">\n");
      out.write("                          1-50$\n");
      out.write("                        </label>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"pricefilter\" type=\"radio\" value=\"\" id=\"flexCheckChecked\" >\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckChecked\">\n");
      out.write("                          50-200$\n");
      out.write("                        </label>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"pricefilter\" type=\"radio\" value=\"\" id=\"flexCheckChecked\" >\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckChecked\">\n");
      out.write("                          200-1000$\n");
      out.write("                        </label>\n");
      out.write("                      </div>  \n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                          <input class=\"form-check-input\" name=\"pricefilter\" type=\"radio\" value=\"\" id=\"flexCheckChecked\" >\n");
      out.write("                        <label class=\"form-check-label\" for=\"flexCheckChecked\">\n");
      out.write("                          >1000$\n");
      out.write("                        </label>\n");
      out.write("                      </div>    \n");
      out.write("                      <a class=\"dropdown-item bg-secondary\" href=\"#\">Filter</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <form action=\"search\" class=\"form-inline\">\n");
      out.write("            <div class=\"md-form my-0\">\n");
      out.write("              <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\" name=\"search\">\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("     <section class=\"text-center mb-4\">       \n");
      out.write("            <div class=\"row\">\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           </div>      \n");
      out.write("      </section>\n");
      out.write("      <nav class=\"d-flex justify-content-center wow fadeIn\">\n");
      out.write("        <ul class=\"pagination pg-blue\">\n");
      out.write("          <li class=\"page-item disabled\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("              <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("              <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item active\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">1\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">2</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">3</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">4</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">5</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("              <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("              <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("  <footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
      out.write("    <div class=\"pt-4\">\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\" role=\"button\">Download MDB\n");
      out.write("        <i class=\"fas fa-download ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\" role=\"button\">Start free tutorial\n");
      out.write("        <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <hr class=\"my-4\">\n");
      out.write("    <div class=\"pb-4\">\n");
      out.write("      <a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-facebook-f mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-twitter mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://www.youtube.com/watch?v=7MUISDJ5ZZ4\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-youtube mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://plus.google.com/u/0/b/107863090883699620484\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-google-plus-g mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-dribbble mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://pinterest.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-pinterest mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-github mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"http://codepen.io/mdbootstrap/\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-codepen mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer-copyright py-3\">\n");
      out.write("      © 2018 Copyright:\n");
      out.write("      <a href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\"> MDBootstrap.com </a>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("    \n");
      out.write("     <!-- search for type Modal HTML -->\n");
      out.write("        <div id=\"searchEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"add\" method=\"get\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Add Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input name=\"name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Type</label>\n");
      out.write("                                <input name=\"type\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input name=\"price\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label>\n");
      out.write("                                <input name=\"image\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Sumquantity</label>\n");
      out.write("                                <input name=\"quantity\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"hidden\" name=\"idseller\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                            \n");
      out.write("        <div class=\"fixed-bottom \" style=\"padding-left: 92%\"><a   href=\"#\"><img style=\"width:100px\" src=\"https://cdn-icons.flaticon.com/png/512/536/premium/536449.png?token=exp=1651982672~hmac=450a382638de5cc802a94ac204814db7\"></a></div> \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.type==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a class=\"navbar-brand waves-effect\" href=\"manager\" target=\"_blank\">\n");
        out.write("         <strong class=\"blue-text\">Sell Manager</strong>\n");
        out.write("            </a> \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.type!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <a class=\"nav-link waves-effect\" href=\"#\" target=\"_blank\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" !!! </a>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                  <a class=\"nav-link waves-effect\" href=\"#\" target=\"_blank\">Amout:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.amout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("$</a>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                  <a class=\"nav-link waves-effect\" href=\"history\" target=\"_blank\">Order history</a>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("              <a class=\"nav-link waves-effect\" href=\"login.html\">\n");
        out.write("              <i class=\"fas fa-sign-in\" ></i>\n");
        out.write("               \n");
        out.write("              <span class=\"clearfix d-none d-sm-inline-block\"> Login </span>\n");
        out.write("              \n");
        out.write("            </a>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("              <a class=\"nav-link waves-effect\" href=\"logout\">\n");
        out.write("              <i class=\"fas fa-sign-out\" ></i>\n");
        out.write("              <span class=\"clearfix d-none d-sm-inline-block\"> Logout </span>\n");
        out.write("            </a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.hire==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <div class=\"col-lg-3 col-md-6 mb-4\"> \n");
        out.write("              <div class=\"card\">    \n");
        out.write("              <div class=\"view overlay\">\n");
        out.write("                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.anhsp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"card-img-top\" alt=\"\">\n");
        out.write("                <a>\n");
        out.write("                  <div class=\"mask rgba-white-slight\"></div>\n");
        out.write("                </a>\n");
        out.write("              </div>             \n");
        out.write("              <div class=\"card-body text-center\">               \n");
        out.write("                <a href=\"\" class=\"grey-text\">\n");
        out.write("                  <h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.loaisp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>\n");
        out.write("                </a>\n");
        out.write("                <h5>\n");
        out.write("                  <strong>\n");
        out.write("                    <a href=\"\" class=\"dark-grey-text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.tensp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                  </strong>\n");
        out.write("                </h5>\n");
        out.write("                <h4 class=\"font-weight-bold blue-text\">\n");
        out.write("                    <strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.giasp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("$</strong> <span class=\"namvutru\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.sumquanlity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                </h4>           \n");
        out.write("              </div>\n");
        out.write("              </div>\n");
        out.write("                    <a class=\"btn btn-primary\" style=\"width: 280px\" href=\"buy?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.masp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&num=1\" role=\"button\">Add to Cart</a>      \n");
        out.write("              </div> \n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }
}
