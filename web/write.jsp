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
                        <h4 class="modal-title">Write Description ${idpr}</h4>

                    </div>
                <form action="lastwrite" method="get">
                            <input name="id" type="hidden" value="${idpr}">
                    <div class="modal-body">

                        <div class="form-group">  
                            <textarea id="w3review" name="detail" rows="4" cols="50"></textarea>
                        </div>					
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-primary" href="manager" role="button">Cancel</a>
                        <input type="submit" class="btn btn-default btn-primary" data-dismiss="modal" value="write">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
