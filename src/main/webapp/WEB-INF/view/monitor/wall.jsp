<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>视频快照墙</title>
</head>

<body>
<%
    //页面每隔5秒自动刷新一遍
    response.setHeader("refresh" , "5" );
%>
<table width="100%"  border="3">
    <c:forEach items="${list}" var="m" varStatus="status">
        <c:if test="${(status.index+1) % 5 == 1}">
            <tr>
        </c:if>
        <td width="300px" height="300px;" >
            <img height="250px" src="${m.liveScreenShot}">
            <div>
                昵称 : <label>${m.liveNickname}</label>
            </div>
            <div>
                用户ID : <label>${m.liveUserId}</label>
            </div>
        </td>
        <c:if test="${(stat.index+1) % 5 == 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>


</body>
</html>
