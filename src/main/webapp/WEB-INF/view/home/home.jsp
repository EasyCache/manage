<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>===</title>
</head>
<frameset rows="69,*,2" frameborder="no" border="0" framespacing="0">
    <frame src="<%=basePath %>index.do?m=top" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" />
    <frame src="<%=basePath %>index.do?m=middle" name="mainFrame" id="mainFrame" />
    <frame src="<%=basePath %>index.do?m=left" name="mainFrame" id="mainFrame" />
</frameset>
<noframes>
    <body>
    </body>
</noframes>
</html>