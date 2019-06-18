<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Save Player</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-country-style.css">

<style>
.error {
	color: red
}
</style>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>ICC - International Cricket Council</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Player</h3>

		<form:form action="savePlayer" modelAttribute="player" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>name:</label></td>
						<td><form:input path="name" /> <form:errors path="name"
								cssClass="error" /></td>
					</tr>
					
					

					<tr>
						<td><label>Country:</label></td>
						<td><select id="country" name="country">
								<option value="top">Select your Country</option>
								<c:forEach items="${countries}" var="tempCountry">
									<option value="">${tempCountry.country}</option>
								</c:forEach>

						</select> <form:errors path="country" cssClass="error" /></td>


					</tr>



					<tr>
						<td><label>role:</label></td>
						<td><form:input path="role" /> <form:errors path="role"
								cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Date Of Birth:</label></td>
						<td><form:input path="dateOfBirth" /> <form:errors
								path="dateOfBirth" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>


				</tbody>
			</table>


		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/country/list">Back to
				List</a>
		</p>

	</div>

</body>

</html>










