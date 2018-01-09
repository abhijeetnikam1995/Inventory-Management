<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="regi">
<s:textfield name="name" label="Name"></s:textfield>
<s:textfield name="email" label="Email"></s:textfield>
<s:password name="pwd" label="Password"></s:password>
<s:radio list="{'male','female','other'}" name="gender" label="Gender"></s:radio>
<s:textfield name="country" label="Country"></s:textfield>

<s:submit></s:submit>
</s:form>
