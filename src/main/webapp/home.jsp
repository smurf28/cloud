<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${user.username}Photo</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="http://labfile.oss.aliyuncs.com/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://labfile.oss.aliyuncs.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <div class="container">

        <div class="row">
            <div class="col-xs-8 col-xs-offset-2">
                <h3 class="page-header">
                    ${user.username}&nbsp;&nbsp;&nbsp;<small>Totals:<span class="badge">${imageList.size()}</span></small>
                    <div class="btn-group pull-right">
                      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                          options<span class="caret"></span>
                      </button>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#" data-toggle="modal" data-target="#myModa2">Upload</a></li>
                        <li><a href="#" data-toggle="modal" data-target="#myModa3">Delete</a></li>
                        <li><a href="#" data-toggle="modal" data-target="#myModa4">Exit</a></li>
                      </ul>
                    </div>
                </h3>
            </div>
        </div>
        <!-- é¦é¨ end -->

        <!-- æ¾ç¤ºå¾çåè¡¨ -->
        <c:forEach items="${imageList}" varStatus="status" var="image">
            <c:choose>
                <c:when test="${status.first or status.index % 4 eq 0}">
                    <div class="row">
                        <div class="col-xs-2 col-xs-offset-2">
                          <a href="#" class="thumbnail text-center">
                            <img name="${image.name}" date="<fmt:formatDate value='${image.date}' pattern='yyyy-MM-dd HH:mm'/>" style="width: 140px; height: 130px;" src="http:///oayqj2sj0.bkt.clouddn.com/${image.url}"><!--è¿éè¯·å¡«åèªå·±çé¾æ¥å°åï¼è¯¦è§ä¸å¾-->
                            <input class="pull-left" type="checkbox" value="${image.id}" url="${image.url}"/>${image.name }
                          </a>
                        </div>
                </c:when>
                <c:when test="${status.index % 4 eq 3 and not status.last }">
                        <div class="col-xs-2">
                          <a href="#" class="thumbnail text-center">
                            <img name="${image.name}" date="<fmt:formatDate value='${image.date}' pattern='yyyy-MM-dd HH:mm'/>" style="width: 140px; height: 130px;" src="http://oayqj2sj0.bkt.clouddn.com/${image.url}"><!--è¿éè¯·å¡«åèªå·±çé¾æ¥å°åï¼è¯¦è§ä¸å¾-->
                            <input class="pull-left" type="checkbox" value="${image.id}" url="${image.url}" />${image.name }
                          </a>
                        </div>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="col-xs-2">
                      <a href="#" class="thumbnail text-center">
                        <img name="${image.name}" date="<fmt:formatDate value='${image.date}' pattern='yyyy-MM-dd HH:mm'/>" style="width: 140px; height: 130px;" src="http:///oayqj2sj0.bkt.clouddn.com/${image.url}"><!--è¿éè¯·å¡«åèªå·±çé¾æ¥å°åï¼è¯¦è§ä¸å¾-->
                        <input class="pull-left" type="checkbox" value="${image.id}" url="${image.url}"/>${image.name }
                      </a>
                    </div>
                </c:otherwise>
            </c:choose>
            <c:if test="${status.last}">
                </div>
            </c:if>
        </c:forEach>
        <!-- æ¾ç¤ºå¾çåè¡¨ end -->
    </div>

    <!-- æ¾ç¤ºå¾çå¯¹è¯æ¡ start -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title" id="myModalLabel"></h4>
          </div>
          <div class="modal-body" id="modal-content">
          </div>
        </div>
      </div>
    </div>
    <!-- æ¾ç¤ºå¾çå¯¹è¯æ¡ end -->

    <!-- ä¸ä¼ å¾çå¯¹è¯æ¡ start -->
    <div class="modal fade" id="myModa2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title" id="myModalLabe2">Image Upload</h4>
          </div>
          <div class="modal-body">
              <form class="form-horizontal" role="form" id="form">
                <div class="form-group"  >
                <label for="image_name" class="col-xs-2 control-label" >Title</label>
                <div class="col-xs-4">
                  <input type="text" class="form-control" id="image_name" name="image_name"/>
                </div>
              </div>
              <div class="form-group">
                <label for="image" class="col-xs-2 control-label">Image</label>
                <div class="col-xs-4">
                    <input type="file" id="image" name="image"/>
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
            <button type="button" class="btn btn-primary" id="upload">Upload</button>
          </div>
        </div>
      </div>
    </div>
    <!-- ä¸ä¼ å¾çå¯¹è¯æ¡ end -->

    <!-- å é¤å¾çå¯¹è¯æ¡ start -->
    <div class="modal fade" id="myModa3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title" id="myModalLabe3">confirm to delete?</h4>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
            <button type="button" class="btn btn-danger" id="delete">Confirm</button>
          </div>
        </div>
      </div>
    </div>
    <!-- å é¤å¾çå¯¹è¯æ¡ end -->

    <!-- éåºå¯¹è¯æ¡ start -->
    <div class="modal fade" id="myModa4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title" id="myModalLabe4">confirm to exit?</h4>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
            <button type="button" class="btn btn-danger" id="exit">Confirm</button>
          </div>
        </div>
      </div>
    </div>
    <!-- éåºå¯¹è¯æ¡ end -->

    <script src="http://labfile.oss.aliyuncs.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            //ç¹å»å¾ç
            $('img').click(function() {
                $('#myModalLabel').html($(this).attr('name') + '&nbsp;&nbsp;&nbsp;<small>' + $(this).attr('date') + '</small>');
                $('#modal-content').html('<img class=\'img-responsive\' src=\'' + $(this).attr('src') + '\'/>');
                $('#myModal').modal('show');
            });

            //ç¹å»ä¸ä¼ 
            $('#upload').click(function() {
                if ($('#image_name').val() == '' || $('#image').val() == '') {
                } else {
                    $('#form').attr('action', '${pageContext.request.contextPath}' + '/ImageAction?type=1');
                    $('#form').attr('enctype', 'multipart/form-data');
                    $('#form').attr('method', 'post');
                    $('#form').submit();
                }
            });

            //ç¹å»ç¡®å®éåº
            $('#exit').click(function() {
                $.get('${pageContext.request.contextPath}' + '/UserAction?type=3', function(data, status) {
                    location.href = '${pageContext.request.contextPath}' + '/index.jsp';
                });
            });

            //ç¹å»ç¡®å®å é¤å¾ç
            $('#delete').click(function() {
                var ids = "";
                var urls = "";
                $('input[type=checkbox]:checked').each(function() {
                    ids += $(this).val() + ',';
                    urls += $(this).attr('url') + ',';
                }); 
                $.post('${pageContext.request.contextPath}' + '/ImageAction?type=2', {
                    ids: ids,
                    urls: urls
                },function(data, status) {
                    $('#myModa3').modal('hide');
                    location.href = '${pageContext.request.contextPath}' + '/home.jsp';
                });
            });
        });
    </script>
  </body>
</html>