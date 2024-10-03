<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear employee, Pleace enter your name </h2>

<br>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary<form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department: <FORM:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resurses" label="HR"/>
    <form:option value="Sales" label="Sales"/>
</FORM:select>
    <br><br>
    Which car do you want?
    BMW<form:radiobutton path="carBrend" value="BWM"/>
    AUDI<form:radiobutton path="carBrend" value="AUDI"/>
    MB<form:radiobutton path="carBrend" value="Mercedec Benz"/>
    <br>
    <br>
    Foreing language (s)
    EN <form:checkbox path="lenguages" value="english"/>
    DE <form:checkbox path="lenguages" value="Doutch"/>
    FR <form:checkbox path="lenguages" value="French"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    <input type="submit" value="ok">

</form:form>
</body>
</html>