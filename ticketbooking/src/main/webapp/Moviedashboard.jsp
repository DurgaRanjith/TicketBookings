

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Moviedashboard" method="post">

		<%-- <c:forEach var="moviearray" items="${Movies}">
		<c:out value=${moviearray}></c:out>  
			 <p>${moviearray}</p> 
		</c:forEach> --%>


		<div align="center">
			<table border="1" cellpadding="5">
				<caption>
					<h2>Movie Dashboard</h2>
				</caption>
				<thead>
					<tr>
						<th>Name</th>
						<th>Release Date</th>
						<th>Book Show</th>
						<th>Ratings</th>
						</tr>
				</thead>
				<tbody>

					<c:forEach var="moviearray" items="${Movies}">
						<tr>
							
                 <td><div>${moviearray.movie_name}</div></td>
			   <td><div>${moviearray.release_date}</div></td>
			   <td><div><input type="submit" name="submit" value="Book"/></div></td>
			   <td><div>*</div></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
		</div>
	</form>
</body>
</html>