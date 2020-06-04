<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <style>
    a{
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3{
      width: 180px;
      height: 30px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background-color: deepskyblue;
      border-radius: 5px;
    }
  </style>
</head>
<body>
<h3>
  <a href="${pageContext.request.contextPath}/book/bookList" target="_self">进入书籍页面</a>
</h3>

用户名:<input type="text" id="bookName" onblur="move()">
</body>
<script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
<script>
function move(){
    $.post({
        url:"${pageContext.request.contextPath}/book/ajax",
        data:{"bookName":$("#bookName").val()},
        success: function (data) {
          alert(data);
        },
        error:function () {
            
        }
    })
}

</script>
</html>
