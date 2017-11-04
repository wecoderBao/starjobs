<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en"><head>
    <meta charset="utf-8">
    <title>招聘信息管理</title>
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
        //导出文件
        function exportFile(){
        	
        }
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
            
            <h1 class="page-title">招聘信息管理</h1>
                    <ul class="breadcrumb">
            <li><a href="index.html">信息管理</a> </li>
            <li class="active">招聘信息管理</li>
        </ul>

        </div>
        <div class="main-content">
            
            <div class="btn-toolbar list-toolbar">
                <button onclick="importFile()" class="btn btn-default">导出数据</button>
            <div class="btn-group">
            </div>
            </div>
            <table class="table">
            <thead>
                <tr>
                <th>序号</th>
                <th>区域</th>
                <th>公司名称</th>
                <th>联系电话</th>
                <th>详细地址</th>
                <th>刷新次数</th>
                <th>消费金额</th>
                <th style="width: 3.5em;">操作</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                <td>1</td>
                <td>洪山区</td>
                <td>艾尔眼科医院</td>
                <td>18823481234</td>
                <td>洪山区建设路</td>
                <td>5</td>
                <td>50</td>
                <td>
                    <a href="#" role="button" data-toggle="modal"><i class="fa fa-pencil"></i></a>
                    <a href="#" role="button" data-toggle="modal"><i class="fa fa-trash-o"></i></a>
                </td>
                </tr>
                <tr>
                <td>2</td>
                <td>张玉珠</td>
                <td>女</td>
                <td><span class="label label-default">华中科技大学</span>&nbsp;&nbsp;&nbsp;<span class="label label-success">硕士</span></td>
                <td>
                    <a href="#editTeacher" role="button" data-toggle="modal"><i class="fa fa-pencil"></i></a>
                    <a href="#myModal" role="button" data-toggle="modal"><i class="fa fa-trash-o"></i></a>
                </td>
                </tr>     
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

            <div class="modal small fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h3 id="myModalLabel">删除提示</h3>
                    </div>
                    <div class="modal-body">
                        <p class="error-text"><i class="fa fa-warning modal-icon"></i><h3>确定要删除该教师吗?</h3></p>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button>
                        <button class="btn btn-danger" data-dismiss="modal">删除</button>
                    </div>
                </div>
                </div>
            </div>

            <div class="modal small fade" id="editTeacher" tabindex="-2" role="dialog" aria-labelledby="editTeacher" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h3 id="myModalLabel">修改教师信息</h3>
                    </div>
                    <div class="modal-body">
                        <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label>姓名</label>
                                <input type="text" class="form-control span12">
                            </div>
                            <div class="form-group">
                                <label>邮箱</label>
                                <input type="email" class="form-control span12">
                            </div>
                            <div class="form-group">
                                <label>教育背景</label>
                                <input type="text" class="form-control span12">
                            </div>
                            <div class="form-group">
                                <label>简介</label>
                                <textarea rows="10" cols="60" class="form-control" placeholder="此处填写教师精彩的简介"></textarea> 
                            </div>
                            <!--<div class="form-group">
                                <label>简介</label>
                                <textarea class="form-control span12">
                            </div>   -->
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

            <div class="modal middle fade" id="AddTeacher" tabindex="-3" role="dialog" aria-labelledby="AddTeacher" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h3 id="myModalLabel">添加新教师</h3>
                    </div>
                    <div class="modal-body">
                        <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label>姓名</label>
                                <input type="text" class="form-control span12">
                            </div>

                            <div class="form-group">
                                <label>密码</label>
                                <input type="password" class="form-control span12">
                            </div>
                            
                            <div class="form-group">
                                <label>邮箱</label>
                                <input type="email" class="form-control span12">
                            </div>
                            <div class="form-group">
                                <label>性别</label>&nbsp;&nbsp;&nbsp;
                                <input type="radio"  name="sex" value="男">男&nbsp;&nbsp;&nbsp;
                                <input type="radio" name="sex" value="女">女
                            </div>
                            <div class="form-group">
                                <label>教育背景</label>
                                <input type="email" class="form-control span12">
                            </div>

                            <div class="form-group">
                                <label>生日</label>
                                <input type="date" class="form-control span12">
                            </div>
                            <div class="form-group">
                                <label>简介</label>
                                <textarea rows="10" cols="60" class="form-control" placeholder="此处填写教师精彩的简介"></textarea> 
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
