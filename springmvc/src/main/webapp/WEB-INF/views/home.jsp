<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
        
        <div>
			<form:form method="POST" action="/Organization/DetailsForm" modelAttribute="Details">
				<table>
        			<tr>
        				<td>Id</td>
        				<td><form:input type="text" path="id"></form:input></td>
        			</tr>
        			<tr>
        				<td>Name</td>
        				<td><form:input type="text" path="name"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Age</td>
        				<td><form:input type="text" path="age"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Company</td>
        				<td><form:input type="text" path="company"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
		</div>
    </body>
    
</html>
