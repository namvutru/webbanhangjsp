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
        <label for="promo-code">Enter a promotional code</label>
        <input id="promo-code" type="text" name="promo-code" maxlength="5" class="promo-code-field">
        <button class="promo-code-cta">Apply</button>
      </div>
      <div class="basket-labels">
        <ul>
          <li class="item item-heading">Item</li>
          <li class="price">Price</li>
          <li class="quantity">Quantity</li>   
          <li class="subtotal">Subtotal</li>
        </ul>
      </div>
      
      <c:forEach items="${cart.items}" var="i">
      <div class="basket-product">
          
        <div class="item">
          <div class="product-image">
            <img src="${i.product.anhsp}" alt="" class="product-frame">
          </div>
          <div class="product-details">
            <h1><strong><span class="item-quantity">${i.product.tensp}</h1>
            <p><strong>${i.product.loaisp}</strong></p>
            <p>${i.product.masp}</p>
          </div>
        </div>
        <div class="price">${i.sellprice}</div>
        
        <div class="quantity">
            <button ><a style="color:#ffffff " href="addminus?id=${i.product.masp}&num=1">+</a></button> <br>  <div class="number">${i.quanlity}</div> <button ><a style="color:#ffffff" href="addminus?id=${i.product.masp}&num=-1">-</a></button> 
        </div>
        
        <div class="subtotal">${i.sellprice*i.quanlity}</div>
        <div class="remove">
            <a href="remove?id=${i.product.masp}" >Remove</a>
        </div>
      </div>
          </c:forEach>
        
        <a href="home" class="ctshop">Continute shopping</a>

      </div>
    </div>
    <aside>
      <div class="summary">
        <div class="summary-total-items"><span class="total-items"></span> Items in your Bag</div>
        <div class="summary-subtotal">
          <div class="subtotal-title">Subtotal</div>
          <div class="subtotal-value final-value" id="basket-subtotal">${total}</div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
        <div class="summary-delivery">
          <select name="delivery-collection" class="summary-delivery-selection">
              <option value="0" selected="selected">Select Collection or Delivery</option>
             <option value="collection">Collection</option>
             <option value="first-class">Royal Mail 1st Class</option>
             <option value="second-class">Royal Mail 2nd Class</option>
             <option value="signed-for">Royal Mail Special Delivery</option>
          </select>
        </div>
        <div class="summary-total">
          <div class="total-title">Total</div>
          <div class="total-value final-value" id="basket-total">${total}</div>
        </div>
        <div class="summary-checkout">
            <c:if test="${sessionScope.acc!=null}"><button class="checkout-cta "><a style="color: #ffffff" href="buyproduct">Buy Products in your card</a></button></c:if>
              <c:if test="${sessionScope.acc==null}"><button class="checkout-cta "><a style="color: #ffffff" href="login.html">Sign in to buy</a></button></c:if>
            
        </div>
      </div>
        
    </aside>
  </main>
   
</body>

</html>
