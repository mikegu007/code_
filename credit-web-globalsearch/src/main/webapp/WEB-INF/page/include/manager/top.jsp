<%@ page import="com.mika.globalsearch.core.model.Manager" %>
<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!-- header section start-->
<div class="header-section">

    <!--toggle button start-->
    <a class="toggle-btn"><i class="fa fa-bars"></i></a>
    <!--toggle button end-->

    <!--search start-->

    <!--search end-->

    <!--notification menu start -->
    <%--<form class="searchform" action="index.html" method="post">--%>
        <%--<input type="text" class="form-control" name="keyword" placeholder="Search here...">--%>
    <%--</form>--%>
    <div class="menu-right">
    <ul class="notification-menu">
        <li>
            <a href="<%=basePath%>index.do" class="btn btn-default dropdown-toggle info-number"><i class="fa fa-eye"></i>前台</a>
        </li>
        <%--<li>--%>
            <%--<a href="#" class="btn btn-default dropdown-toggle info-number" data-toggle="dropdown">--%>
                <%--<i class="fa fa-tasks"></i>--%>
                <%--<span class="badge">8</span>--%>
            <%--</a>--%>
            <%--<div class="dropdown-menu dropdown-menu-head pull-right">--%>
                <%--<h5 class="title">您有8条待办事项</h5>--%>
                <%--<ul class="dropdown-list user-list">--%>
                    <%--<li class="new">--%>
                        <%--<a href="#">--%>
                            <%--<div class="task-info">--%>
                                <%--<div>Database update</div>--%>
                            <%--</div>--%>
                            <%--<div class="progress progress-striped">--%>
                                <%--<div style="width: 40%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-warning">--%>
                                    <%--<span class="">40%</span>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new">--%>
                        <%--<a href="#">--%>
                            <%--<div class="task-info">--%>
                                <%--<div>Dashboard done</div>--%>
                            <%--</div>--%>
                            <%--<div class="progress progress-striped">--%>
                                <%--<div style="width: 90%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="90" role="progressbar" class="progress-bar progress-bar-success">--%>
                                    <%--<span class="">90%</span>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">--%>
                            <%--<div class="task-info">--%>
                                <%--<div>Web Development</div>--%>
                            <%--</div>--%>
                            <%--<div class="progress progress-striped">--%>
                                <%--<div style="width: 66%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="66" role="progressbar" class="progress-bar progress-bar-info">--%>
                                    <%--<span class="">66% </span>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">--%>
                            <%--<div class="task-info">--%>
                                <%--<div>Mobile App</div>--%>
                            <%--</div>--%>
                            <%--<div class="progress progress-striped">--%>
                                <%--<div style="width: 33%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="33" role="progressbar" class="progress-bar progress-bar-danger">--%>
                                    <%--<span class="">33% </span>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">--%>
                            <%--<div class="task-info">--%>
                                <%--<div>Issues fixed</div>--%>
                            <%--</div>--%>
                            <%--<div class="progress progress-striped">--%>
                                <%--<div style="width: 80%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="80" role="progressbar" class="progress-bar">--%>
                                    <%--<span class="">80% </span>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new"><a href="">查看所有待办事项</a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>
        <%--</li>--%>
        <%--<li>--%>
            <%--<a href="#" class="btn btn-default dropdown-toggle info-number" data-toggle="dropdown">--%>
                <%--<i class="fa fa-envelope-o"></i>--%>
                <%--<span class="badge">5</span>--%>
            <%--</a>--%>
            <%--<div class="dropdown-menu dropdown-menu-head pull-right">--%>
                <%--<h5 class="title">您有5条新消息 </h5>--%>
                <%--<ul class="dropdown-list normal-list">--%>
                    <%--<li class="new">--%>
                        <%--<a href="">--%>
                            <%--<span class="thumb"><img src="images/photos/user1.png" alt=""></span>--%>
                            <%--<span class="desc">--%>
                                          <%--<span class="name">John Doe <span class="badge badge-success">new</span></span>--%>
                                          <%--<span class="msg">Lorem ipsum dolor sit amet...</span>--%>
                                        <%--</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="">--%>
                            <%--<span class="thumb"><img src="images/photos/user2.png" alt=""></span>--%>
                            <%--<span class="desc">--%>
                                          <%--<span class="name">Jonathan Smith</span>--%>
                                          <%--<span class="msg">Lorem ipsum dolor sit amet...</span>--%>
                                        <%--</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="">--%>
                            <%--<span class="thumb"><img src="images/photos/user3.png" alt=""></span>--%>
                            <%--<span class="desc">--%>
                                          <%--<span class="name">Jane Doe</span>--%>
                                          <%--<span class="msg">Lorem ipsum dolor sit amet...</span>--%>
                                        <%--</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="">--%>
                            <%--<span class="thumb"><img src="images/photos/user4.png" alt=""></span>--%>
                            <%--<span class="desc">--%>
                                          <%--<span class="name">Mark Henry</span>--%>
                                          <%--<span class="msg">Lorem ipsum dolor sit amet...</span>--%>
                                        <%--</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="">--%>
                            <%--<span class="thumb"><img src="images/photos/user5.png" alt=""></span>--%>
                            <%--<span class="desc">--%>
                                          <%--<span class="name">Jim Doe</span>--%>
                                          <%--<span class="msg">Lorem ipsum dolor sit amet...</span>--%>
                                        <%--</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new"><a href="">Read All Mails</a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>
        <%--</li>--%>
        <%--<li>--%>
            <%--<a href="#" class="btn btn-default dropdown-toggle info-number" data-toggle="dropdown">--%>
                <%--<i class="fa fa-bell-o"></i>--%>
                <%--<span class="badge">4</span>--%>
            <%--</a>--%>
            <%--<div class="dropdown-menu dropdown-menu-head pull-right">--%>
                <%--<h5 class="title">通知</h5>--%>
                <%--<ul class="dropdown-list normal-list">--%>
                    <%--<li class="new">--%>
                        <%--<a href="">--%>
                            <%--<span class="label label-danger"><i class="fa fa-bolt"></i></span>--%>
                            <%--<span class="name">Server #1 overloaded.  </span>--%>
                            <%--<em class="small">34 mins</em>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new">--%>
                        <%--<a href="">--%>
                            <%--<span class="label label-danger"><i class="fa fa-bolt"></i></span>--%>
                            <%--<span class="name">Server #3 overloaded.  </span>--%>
                            <%--<em class="small">1 hrs</em>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new">--%>
                        <%--<a href="">--%>
                            <%--<span class="label label-danger"><i class="fa fa-bolt"></i></span>--%>
                            <%--<span class="name">Server #5 overloaded.  </span>--%>
                            <%--<em class="small">4 hrs</em>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new">--%>
                        <%--<a href="">--%>
                            <%--<span class="label label-danger"><i class="fa fa-bolt"></i></span>--%>
                            <%--<span class="name">Server #31 overloaded.  </span>--%>
                            <%--<em class="small">4 hrs</em>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li class="new"><a href="">See All Notifications</a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>
        <%--</li>--%>
        <li>
            <a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <img src="<%=basePath%>images/manager/user.png" alt="">
                <c:out value="${managerInfo.name}"/>
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                <li><a href="#"><i class="fa fa-user"></i>  我的主页</a></li>
                <li><a href="#"><i class="fa fa-cog"></i>  修改密码</a></li>
                <li><a href="#" class="logoutA"><i class="fa fa-sign-out"></i> 注销</a></li>
            </ul>
        </li>

    </ul>
</div>
    <!--notification menu end -->

</div>
<!-- header section end-->