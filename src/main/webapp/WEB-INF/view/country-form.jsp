<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Save Country</title>

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
		<h3>Save Country</h3>

		<form:form action="saveCountry" modelAttribute="country" method="POST">

			<!-- need to associate this data with country id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>Country Name</label></td>
						<td><form:input path="country" />
						<form:errors path="country" cssClass="error"/>
						</td>
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










