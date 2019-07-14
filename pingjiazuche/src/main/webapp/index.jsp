<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 表单的类型必须是multipart/form-data    上传的格式必须是post--%>
    <form action="${pageContext.request.contextPath}/comments/findAll" method="post" enctype="multipart/form-data">
        ${pageContext.request.contextPath}
        用户名：<input type="text" name="username"><br>
        <input type="file" name="upload"><br>
        <input type="submit"  value="传文件">
    </form>
<%--表单的类型必须是multipart/form-data 上传的格式必须是post--%>
<%--<form action="${pageContext.request.contextPath}/user/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"><br>
    <input type="submit" value="提交">
</form>--%>
</body>
</html>
