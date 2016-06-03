<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../resource.jsp"></jsp:include>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <li class="active">
                <a href="monitor.do"><i class="fa fa-fw fa-dashboard"></i> 监控墙</a>
            </li>
            <li>
                <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-edit"></i>初级菜单</a>
                <ul id="demo" class="collapse">
                    <li>
                        <a href="#">测试</a>
                    </li>
                    <li>
                        <a href="#">测试</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
