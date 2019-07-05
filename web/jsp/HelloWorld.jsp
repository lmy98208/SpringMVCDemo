<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 2019/7/5
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"
            +request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>HelloWorld（JSP）</title>
</head>
<body>
    id:${id}<br>
    name:${name}<br>
    date:<fmt:formatDate value="${date}" pattern="yyyy年MM月dd日 HH:mm:ss"/><br>
</body>
</html>
