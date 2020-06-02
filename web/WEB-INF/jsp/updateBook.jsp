<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>编辑书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--出现了问题：提交了修改SQL的请求，但是修改失败，使用隐藏域--%>
        <input type="hidden" name="id" value="${bookPojo.id}">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="form-control" name="bookName" id="bookName" value="${bookPojo.bookName}" placeholder="请输入书籍名称" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量</label>
            <input type="text" class="form-control" name="bookCount" id="bookCount" value="${bookPojo.bookCount}" placeholder="请输入书籍数量" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="form-control" name="detail" id="detail" value="${bookPojo.detail}" placeholder="请输入书籍描述" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="保存">
        </div>
    </form>
</div>

</body>
</html>
