<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html>

<head>
    <title>ALL Employees</title>
</head>


<body>
<div align="center">

    <h2>
        ALL Employees
    </h2>
    <br>

    <table border="1" cellpadding="5">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>

        <c:forEach var="emp" items="${allEmps}">

            <c:url var="updateButton" value="/updateInfo">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>

            <c:url var="deleteButton" value="/deleteEmployee">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>

            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href = '${updateButton}'">

                    <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">
                </td>
            </tr>

        </c:forEach>
    </table>

    <br>

    <input type="button" value="Add"
           onclick="window.location.href = 'addNewEmployee'"/>

</div>

</body>


</html>
