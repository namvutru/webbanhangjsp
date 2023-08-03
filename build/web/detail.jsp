<%-- 
    Document   : cart
    Created on : 02-05-2022, 14:55:34
    Author     : luuti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Your Cart</title> 
    <link rel="stylesheet" href="css/cartcss.css">
    <script src="jsfile/jscart.js"></script>
</head>

<body>
  <main>
    <div class="basket">
      <div class="basket-module">
        
      </div>
      <div class="basket-labels">
        <ul>
          <li class="item item-heading">Item</li>
          <li class="price">Price</li>
          <li class="quantity">Quantity</li>   
          <li class="subtotal">Subtotal</li>
        </ul>
      </div>
      
      <c:forEach items="${listdeor}" var="i">
      <div class="basket-product">
        <div class="item">
          <div class="product-image">
            <img src="${i.pr.anhsp}" alt="" class="product-frame">
          </div>
          <div class="product-details">
            <h1><strong><span class="item-quantity">${i.pr.tensp}</h1>
            <p><strong>${i.pr.loaisp}</strong></p>
            <p>${i.pr.masp}</p>
          </div>
        </div>
        <div class="price">${i.sellprice}</div>
        
        <div class="quantity">
              <div class="number">${i.quanlity}</div> 
        </div>
        
        <div class="subtotal">${i.sellprice*i.quanlity}</div>
        
      </div>
          </c:forEach>
        
        <a href="history" class="ctshop">Return history</a>

      </div>
  
  </main>
   
</body>

</html>
