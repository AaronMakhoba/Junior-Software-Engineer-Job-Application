<!DOCTYPE html>
<!-- code by webdevtrick (webdevtrick.com) -->
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form | webdevtrick.com</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="style.css">


</head>

<body>

	<div class="row">
		<section class="section">
			<header>
				<h3>Create a simple Web page</h3>

			</header>
			<main>
				<form>
					<div class="form-item box-item">
						<input type="text" name="name" class="tx1" placeholder="Name"
							data-required> <small class="errorReq"><i
							class="fa fa-asterisk" aria-hidden="true"></i> required field</small>
					</div>

					<div class="form-item box-item">
						<input type="text" name="surname" class="tx1"
							placeholder="Surname" data-required> <small
							class="errorReq"><i class="fa fa-asterisk"
							aria-hidden="true"></i> required field</small>
					</div>


					<div class="form-item box-item">
						<input type="email" name="email" class="tx1" placeholder="Email"
							data-email data-required> <small class="errorReq"><i
							class="fa fa-asterisk" aria-hidden="true"></i> required field</small> <small
							class="errorEmail"><i class="fa fa-asterisk"
							aria-hidden="true"></i> email is not valid</small>
					</div>

					<div class="form-item box-item">
						<input type="text" name="phone" placeholder="Phone" data-required
							data-number data-count="10"> <small class="errorReq"><i
							class="fa fa-asterisk" aria-hidden="true"></i> required field</small> <small
							class="errorNum"><i class="fa fa-asterisk"
							aria-hidden="true"></i> must be a number</small> <small class="errorChar"><i
							class="fa fa-asterisk" aria-hidden="true"></i> must be 10 digits</small>
					</div>
					<div class="form-item">
						<span id="submit" class="submit">Submit</span>
					</div>
				</form>
			</main>
			
			<i class="wave"></i>
		</section>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



	<script src="function.js"></script>




</body>

</html>