<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<center>
<s:form action="login">

<s:textfield name="uname" label="User Name"></s:textfield><br>
<s:password name="pwd" label="Password"></s:password><br>
<h2><s:a href="regi.jsp">New User???Register Here!!</s:a></h2>
<s:submit></s:submit>
</s:form>



</body>
</center>
</html>
