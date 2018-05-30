<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table border="1">
		<tr>
		        <th>Product Image</th>
				<th>Product Name</th>
				<th>Unit Price</th>
				<th>Product description</th>
				<th>Product unitsInStock</th>
				<th>category.name</th>
			<!-- 	<th>category.description</th> -->
			</tr>
		<c:forEach  var="product">
			<tr>
			<td><img src="/pictures/${product.name}-${product.id}" height="100" width="100"/></td>
		    <td>${product.name}</td>
		    <td pattern="#.00">${product.unitPrice}</td>
		    <td>${product.description}</td>
		    <td>${product.unitsInStock}</td>
		    <td>${product.category.name}</td>
		  <%--   <td>${product.category.description}</td> --%>
		    <td><a href="/addShoppingCart/${product.id }">Add To Cart</a></td>
			</tr>
			</c:forEach>
		</table>

		<td><a href="/guest/list/product">Go To Product List</a></td>    
</body>
</html>