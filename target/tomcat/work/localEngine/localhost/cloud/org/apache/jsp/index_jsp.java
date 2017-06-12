package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write(" <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>ShiyanlouPhoto</title>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/libs/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xs-12 text-center\">\r\n");
      out.write("                <h2>ShiyanlouPhoto</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div id=\"alert1\"  class=\"alert alert-success fade in text-center col-xs-2 col-xs-offset-5 hide\">\r\n");
      out.write("                <strong>RegisterSuccess</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form id=\"form\" class=\"form-horizontal\" role=\"form\" style=\"margin-top: 73px;\">\r\n");
      out.write("          <div class=\"form-group\"  >\r\n");
      out.write("            <label for=\"username\" class=\"col-xs-2 control-label col-sm-offset-3\" >Username</label>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"username\" rel=\"tooltip\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"password\" class=\"col-xs-2 control-label col-sm-offset-3\">Password</label>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"password\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-5 col-xs-1\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-success\" id=\"login\">Login</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-1\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#myModal\">Register</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 注册对话框 begin -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("            <h4 class=\"modal-title\" id=\"myModalLabel\">UserRegister</h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("              <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("              <div class=\"form-group\"  >\r\n");
      out.write("                <label for=\"reg_username\" class=\"col-xs-2 control-label\" >Username</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"reg_username\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"reg_password\" class=\"col-xs-2 control-label\">Password</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"reg_password\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"reg_repassword\" class=\"col-xs-2 control-label\">Reinput</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"reg_repassword\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" id=\"register\">Register</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 注册对话框 end -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://labfile.oss.aliyuncs.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $('#login').click(function() {\r\n");
      out.write("                //提交登录表单\r\n");
      out.write("                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + '/UserAction?type=1',\r\n");
      out.write("                {\r\n");
      out.write("                    username: $('#username').val(),\r\n");
      out.write("                    password: $('#password').val()\r\n");
      out.write("                },\r\n");
      out.write("                function(data, status) {\r\n");
      out.write("                    if (data == '1') {\r\n");
      out.write("                        createPopOver('#username', 'right', 'Username can not be empty ', 'show');\r\n");
      out.write("                    } else if (data == '2') {\r\n");
      out.write("                        createPopOver('#password', 'right', ' password can not be empty', 'show');\r\n");
      out.write("                    } else if (data == '3') {\r\n");
      out.write("                        createPopOver('#username', 'right', ' Username does not exist', 'show');\r\n");
      out.write("                    } else if (data == '4') {\r\n");
      out.write("                        createPopOver('#password', 'right', ' wrong password', 'show');\r\n");
      out.write("                    } else if (data == 5) {\r\n");
      out.write("                        location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + '/home.jsp';\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //点击注册按钮\r\n");
      out.write("            $('#register').click(function() {\r\n");
      out.write("                //提交注册表单\r\n");
      out.write("                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + '/UserAction?type=2',\r\n");
      out.write("                {\r\n");
      out.write("                    username: $('#reg_username').val(),\r\n");
      out.write("                    password: $('#reg_password').val(),\r\n");
      out.write("                    repassword: $('#reg_repassword').val()\r\n");
      out.write("                },\r\n");
      out.write("                function(data, status) {\r\n");
      out.write("                    if (data == '1') {\r\n");
      out.write("                        createPopOver('#reg_username', 'right', 'not null', 'show');\r\n");
      out.write("                    } else if (data == '2') {\r\n");
      out.write("                        createPopOver('#reg_password', 'right', 'not null', 'show');\r\n");
      out.write("                    } else if (data == '3') {\r\n");
      out.write("                        createPopOver('#reg_repassword', 'right', 'not null', 'show');\r\n");
      out.write("                    } else if (data == '4') {\r\n");
      out.write("                        createPopOver('#reg_repassword', 'right', 'Passwords do not match', 'show');\r\n");
      out.write("                    } else if (data == '5') {\r\n");
      out.write("                        createPopOver('#reg_username', 'right', 'Username already exists', 'show');\r\n");
      out.write("                    } else if (data == '6') {\r\n");
      out.write("                        $('#reg_username').val('');\r\n");
      out.write("                        $('#reg_password').val('');\r\n");
      out.write("                        $('#reg_repassword').val('');\r\n");
      out.write("                        $('#myModal').modal('hide');\r\n");
      out.write("                        $('#alert1').removeClass('hide');\r\n");
      out.write("                        $('#form').css('margin-top', '0px');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }); \r\n");
      out.write("\r\n");
      out.write("            //显示弹出框\r\n");
      out.write("            function createPopOver(id, placement, content, action) {\r\n");
      out.write("                $(id).popover({\r\n");
      out.write("                    placement: placement,\r\n");
      out.write("                    content: content\r\n");
      out.write("                });\r\n");
      out.write("                $(id).popover(action);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            //点击输入框时销毁弹出框\r\n");
      out.write("            $('#username').click(function() {\r\n");
      out.write("                $('#username').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#password').click(function() {\r\n");
      out.write("                $('#password').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_username').click(function() {\r\n");
      out.write("                $('#reg_username').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_password').click(function() {\r\n");
      out.write("                $('#reg_password').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_repassword').click(function() {\r\n");
      out.write("                $('#reg_repassword').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
