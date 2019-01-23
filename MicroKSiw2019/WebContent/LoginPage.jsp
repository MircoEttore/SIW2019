<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="js/jquery-3.2.1.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>


	<table>
		<tr>
			<td style="width: 50%;">
				<form method="POST" class="form-horizontal"
					action="inviaCredenziali">
					<div class="form-group">
						<label class="control-label col-sm-2" for="username">Username</label>
						<div class="col-sm-5">
							<input class="form-control" name="username" type="text" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="password">Password</label>
						<div class="col-sm-5">
							<input class="form-control" name="password" type="password" />
						</div>
					</div>
					<div class="form-group">
						<input class="control-label col-sm-2 btn btn-success"
							type="submit" />
					</div>

				</form>
			</td>
			
		</tr>
	</table>


</body>
</html>