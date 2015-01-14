<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
  <head>
    <title>Store</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href=<c:url value="webjars/bootstrap/3.3.1/css/bootstrap.min.css"/> rel="stylesheet"/>
    <link href=<c:url value="/resources/css/style.css"/> rel="stylesheet"/>
  </head>
  <body>
  <div class="container">
    <h3>Categories</h3>
      <ul class="category">
        <c:forEach var="category" items="${categories}">
          <li>
          <c:out value="${category.name}"/>
          </li>
        </c:forEach>
      </ul>
    Categories : ${categories.size()}
  <h3>Goods</h3>
    <ul class="category">
      <c:forEach var="item" items="${goods}">
        <li><c:out value="${item.name}"></c:out></li>
      </c:forEach>
    </ul>
    <button type="button" class="btn btn-primary"</button>
    Goods : ${goods.size()}
  </div>

  </body>
</html>
