<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en"><head>
    <meta charset="utf-8">
    <title>管理员管理</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>

    

    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">

</head>
<body class=" theme-blue">

    <!-- Demo page code -->

    <script type="text/javascript">
        $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });
    </script>
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
            color: #fff;
        }
    </style>

    <script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
   
  <!--<![endif]-->
  <jsp:include page="header.jsp"></jsp:include>
    <div class="content">
        <div class="header">
            
            <h1 class="page-title">管理员管理</h1>
                    <ul class="breadcrumb">
            <li><a href="index.html">信息管理</a> </li>
            <li class="active">管理员管理</li>
        </ul>

        </div>
        <div class="main-content">
            
<div class="btn-toolbar list-toolbar">
    <a href="#AddManager" role="button" data-toggle="modal" style="color: #fff;"><button class="btn btn-primary"><i class="fa fa-plus"></i> 添加新管理员</button></a>
    <button class="btn btn-default">导入</button>
    <button class="btn btn-default">导出</button>
  <div class="btn-group">
  </div>
</div>
<table class="table">
  <thead>
    <tr>
      <th></th>
      <th>用户名</th>
      <th>密码</th>
      <th>描述</th>
      <th style="width: 3.5em;"></th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${list}"  var="user">
    <tr>
      <td>${user.cAdminId}</td>
      <td>${user.cAdminName}</td>
      	<td>${user.cAdminPassword}</td>
      <td><span class="label label-danger">${user.cAdminDesc} </span></td>
  		</tr>
     </c:forEach> 
  </tbody>
</table>

<ul class="pagination" style="margin-left: 300px; margin-top: 30px;">
  <li><a href="#">&laquo;上一页</a></li>
  <li id="active"><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">下一页&raquo;</a></li>
</ul>


            
        </div>
       
      </div>
    </div>
</div>

<div class="modal small fade" id="AddManager" tabindex="-3" role="dialog" aria-labelledby="AddManager" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">添加新管理员</h3>
        </div>
        <div class="modal-body">
            <div class="panel-body">
            <form>
                <div class="form-group">
                    <label>用户名</label>
                    <input type="text" class="form-control span12">
                </div>
              
                 <div class="form-group">
                    <label>密码</label>
                    <input type="password" class="form-control span12">
                </div>
                 <div class="form-group">
                    <label>描述</label>
                   <input type="password" class="form-control span12">
                </div>

                    <div class="clearfix"></div>
            </form>
        </div>
            
        </div>
        <div class="modal-footer">
            <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button>
            <button class="btn btn-danger" data-dismiss="modal">保存</button>
        </div>
      </div>
    </div>
</div>

        </div>
    </div>


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  
</body></html>
