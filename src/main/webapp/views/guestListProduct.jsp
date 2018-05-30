<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form modelAttribute="pname" method="get"
		action="/guest/list/product/search">
		<table>
			<tbody>
				<tr>
					<td width="90" align="right">
						<!-- Search for the product you want -->
					</td>
					<td><input type="text" name="pname" value="${pname}" /></td>
					<td width="85" align="right"><input type="submit"
						value="Search" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<br />
	<br />
	<c:if test="${empty requestScope.products }">
	No products!
</c:if>
	<c:if test="${!empty requestScope.products }">
		<table border="1">
			<tr>
				<th>Product Image</th>
				<th>Product Name</th>
				<th>Unit Price</th>
				<th>Description</th>
				<th>Units In Stock</th>
				<th>category.cName</th>
				<th>category.description</th>
			</tr>
			<c:forEach items="${requestScope.products }" var="product">
				<tr>
					<td><a href="/guest/product/detail/{productId}}"><img
							src="${product.imageURL}" height="100" width="100" /></td>
					</a>
					<td>${product.name}</td>
					<td>${product.unitPrice}</td>
					<td>${product.description}</td>
					<td>${product.unitsInStock}</td>
					<td>${product.category.name}</td>
					<td>${product.category.description}</td>

					<!--<sec:authorize access="hasRole('ROLE_ADMIN')">
						<td><a href="/deleteProduct/${product.id }">Delete</a></td>
						<td><a href="/updateProduct/${product.id }">Update</a></td>
					</sec:authorize> -->


					
					<%-- <sec:authorize access="permitAll()">
						<td><a href="">Add To Cart</a></td>
					</sec:authorize> --%>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<sec:authorize access="permitAll()">
		<h2>Found something you love? </h2><td><a href="/guest">Become a Registered user </a></td>
	</sec:authorize>
</body>
</html>