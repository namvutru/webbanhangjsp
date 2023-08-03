<%-- 
    Document   : edit
    Created on : 10-05-2022, 12:14:56
    Author     : luuti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Edit</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    </head>
    <body>
        <div class="modal-dialog">
            <div class="modal-content">
                    <div class="modal-header">						
                        <h4 class="modal-title">Edit ${product.masp}</h4>

                    </div>
                        <form action="editdisplay" method="get">
                            <input name="id" type="hidden" value="${product.masp}">
                    <div class="modal-body">

                        <div class="form-group">
                            <label>Name</label>
                            <input name="name" type="text" value="${product.tensp}" class="form-control" required>
                        </div>

                        <div class="form-group">
                            <label>Type</label>
                            <select name="type" >
                                <option selected="selected" value="${product.loaisp}">
                                ${product.loaisp}
                                </option>
                                <option value="headphone">Headphone</option>
                                <option value="smartphone">Smartphone</option>
                                <option value="phonecharger">Phonecharger</option>
                                <option value="other">Other</option>
                             </select>
                        </div>
                        <div class="form-group">
                            <label>Image</label>
                            <input name="image" type="text" value="${product.anhsp}" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Price</label>
                            <input name="price" type="text" value="${product.giasp}" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Sumquantity</label>
                            <input name="quantity" type="text" value="${product.sumquanlity}" class="form-control" required>
                        </div>					
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-primary" href="manager" role="button">Cancel</a>
                        <input type="submit" class="btn btn-default btn-primary" data-dismiss="modal" value="Save">

                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
