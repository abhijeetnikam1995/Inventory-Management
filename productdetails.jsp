<%@page import="com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget"%>
<%@page import="com.abhi.ProductPojo"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Query"%>
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
			String model = request.getParameter("value");

			String hql = "from ProductPojo where modelno=:v1";

			Session hibsession = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
			Transaction transaction = hibsession.beginTransaction();
			Query query = hibsession.createQuery(hql);
			query.setParameter("v1",model);
			Iterator<ProductPojo> i = query.iterate();
		%>

		<tr>
			<td>Product ID</td>
			<td>Company Name</td>
			<td>Model No</td>
			<td>Price</td>
			<td>Color</td>
		</tr>

		<%
			while (i.hasNext()) {
				ProductPojo m = i.next();
		%>

		<tr>
			<td><%=m.getProduct_id()%></td>
			<td><%=m.getCompname()%></td>
			<td><%=m.getModelno()%></td>
			<td><%=m.getPrice()%></td>
			<td><%=m.getColor()%></td>
		</tr>
		<%
			}
		%>
		<tr>
			<td>Quantity</td>
			<td><input type="text" name="qty"></td>
		</tr>
		<tr>
			<td><input type="submit" value="purchase"></td>
		</tr>
	</table>
</body>
</html>