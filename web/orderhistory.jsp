<%-- 
    Document   : orderhistory
    Created on : 09-05-2022, 09:42:59
    Author     : luuti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/orderhistory.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
     <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
    
     <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.css" rel="stylesheet"/>
    </head>
    <body>
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<div class="container bootdey">
    <div class="panel panel-default panel-order">
        <div class="panel-heading">
            <h2>Order history of <b>${sessionScope.acc.name}</b></h2>
            <div class="btn-group pull-right">
                <div class="btn-group">
<!--                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">Filter history <i class="fa fa-filter"></i></button>-->
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li><a href="#">Approved orders</a></li>
                        <li><a href="#">Pending orders</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="panel-body">
            <c:forEach items="${listO}" var="o">
            <div class="row">
                <div class="col-md-1"><img src="https://bootdey.com/img/Content/user_3.jpg" class="media-object img-thumbnail" /></div>
                <div class="col-md-11">
                    <div class="row">
                        <div class="col-md-12">
                            <div>Id order: ${o.id}</div>
                            <div class="pull-right"><label class="label label-danger text-secondary">Totalmoney:</label><b class="label">${o.toltalmoney}$</b></div>
                            
                            <a data-placement="top" class="btn bg-secondary text-white" href="detail?id=${o.id}" title="View">View Detail</a>
                        </div>
                        <div class="col-md-12">order made on: ${o.date}</div>
                    </div>
                </div>
            </div>
             </div> 
              
            </c:forEach>
     

        
            <br><a class="btn bg-secondary text-white" href="home">Go to home</a>
    </div>
</div>
    </body>
</html>
