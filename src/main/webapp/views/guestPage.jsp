<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Guest</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/font-awesome.min.css" rel="stylesheet">
<link href="/css/linearicons.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet">
<link href="/css/responsive.css" rel="stylesheet">

<link rel="icon" type="image/x-icon" href="/images/icon.ico">
<body>
	<div class="header">
		<%@ include file="fragments/topheader.jsp"%>
		<%@ include file="fragments/middleheader.jsp" %>
		<%@ include file="fragments/bottomheader.jsp" %>
	</div>
	
	<div class="container" style="margin-top:80px;">
		<div class="grid-product">
				<div class="container">
					<div class="row">
						<div class="section-title col-md-offset-3 col-md-6 col-xs-12 text-center">
							<h2>Fashion Products</h2>
							<small>Check Out The Best Offer To Stay Trend</small>
                            <div class="section-border"><span class="dash"></span></div>
						</div>
					</div>	
					<div class="row">
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="single-grid">
								<div class="grid-img">
									<img class="img-resposive" src="images/p-14.png" alt="women">
									<div class="grid-overlay">

									</div>
								</div>	
								<h3>Bright Scalet-Shirt  <span>$65</span></h3>
								
							</div>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="single-grid">
								<div class="grid-img">
									<img class="img-resposive" src="images/p-2.jpg" alt="women">
                                    <strong>25%</strong>
                                    <strong class="new">New</strong>

								</div>	
								<h3>Bright Scalet-Shirt  <span>$65</span></h3>
								
							</div>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="single-grid">
								<div class="grid-img">
									<img class="img-resposive" src="images/p-11.jpg" alt="women">

								</div>	
								<h3>Bright Scalet-Shirt  <span>$65</span></h3>
								
							</div>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="single-grid">
								<div class="grid-img">
									<img class="img-resposive" src="images/p-12.jpg" alt="women">
                                    <strong>Hot</strong>

								</div>	
								<h3>Bright Scalet-Shirt  <span>$65</span></h3>
								
							</div>
						</div>
					</div>    
				</div> 
			</div>
		
	<br><br><br><br>
		<div>
			<span style="font-size:20px;font-weight:400;">Found something you love? Become a Registered User! Sign up as </span>  <a href="register" style="font-size:24px;">Customer</a>;
		
		</div>
		
	</div>
		
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<%@ include file="fragments/bottomfooter.jsp" %> 
</body>
</html>