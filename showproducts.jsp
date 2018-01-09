<%@page import="java.util.Iterator"%>
<%@page import="com.abhi.ProductPojo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<%
			Object l = session.getAttribute("mlist");
			List<ProductPojo> mlist = (List<ProductPojo>) l;

			Iterator<ProductPojo> i = mlist.iterator();
		%>
		<tr>
			<td>Product ID</td>
			<td>Comp Name</td>
			<td>Model No</td>
			<td>Price</td>
			<td>Colour</td>
		</tr>

		<%
			while (i.hasNext()) {
				ProductPojo m = i.next();
		%>

		<tr>
			<td><%=m.getProduct_id()%></td>
			<td><%=m.getCompname() %></td>
			<td><a href="productdetails.jsp?value=<%=m.getModelno()%>"><%=m.getModelno() %></a></td>
			<td><%=m.getPrice() %></td>
			<td><%=m.getColor() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
