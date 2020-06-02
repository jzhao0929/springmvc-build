<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <%--BootStrap 美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —————— 显示所有书籍</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBookPage">新增书籍</a>
            </div>
            <div class="col-md-4 column">
                <%--查询书籍--%>
                <form action="" method="">
                    <input type="text" placeholder="请输入要输入">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍描述</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <%--书籍从数据库中查询出来，从这个list中遍历出来:foreach--%>
                <tbody>
                    <c:forEach var="bookPojo" items="${list}">
                        <tr>
                            <td>${bookPojo.id}</td>
                            <td>${bookPojo.bookName}</td>
                            <td>${bookPojo.bookCount}</td>
                            <td>${bookPojo.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/updateBookPage?id=${bookPojo.id}">编辑</a>
                                &nbsp; | &nbsp;
                                <a href="${pageContext.request.contextPath}/book/deleteBook/${bookPojo.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
