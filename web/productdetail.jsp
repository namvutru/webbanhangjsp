<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Product Detail</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
    <link href="css/prdetail.css" rel="stylesheet">
  </head>

  <body>
	
	<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
					<!--String masp, String tensp, String loaisp, float giasp, String anhsp, int sumquanlity, String idseller,int hire	-->	
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="${product.anhsp}" /></div>
						</div>
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">Product detail</h3>
                                                <p><b>ID: </b>${product.masp}</p>
						<p><b>Name: </b>${product.tensp} </p> 
                                                <p><b>Type: </b>${product.loaisp} </p>
						<p class="product-description">${detail}</p>
						<p><b>Price: </b>${product.giasp}$</p>
						<div class="action">
                                                    <a class="btn btn-primary" href="home" role="button">Return home</a>
                                                    <a class="btn btn-primary" href="buy?id=${product.masp}&num=1" role="button">Add to cart</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>