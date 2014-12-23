<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!--
            ===
            This comment should NOT be removed.
    
            Charisma v2.0.0
    
            Copyright 2012-2014 Muhammad Usman
            Licensed under the Apache License v2.0
            http://www.apache.org/licenses/LICENSE-2.0
    
            http://usman.it
            http://twitter.com/halalit_usman
            ===
        -->
        <jsp:include page="../../common/meta.jsp"/>
        <title>Free HTML5 Bootstrap Admin Template</title>
        <jsp:include page="../../common/css.jsp"/>

        <!-- jQuery -->
        <script src="../../bower_components/jquery/jquery.min.js"></script>

        <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- The fav icon -->
        <link rel="shortcut icon" href="../../img/favicon.ico">

    </head>

    <body>
        <!-- topbar starts -->
        <jsp:include page="../../common/header.jsp"/>
        <!-- topbar ends -->

        <div class="ch-container">
            <div class="row">

                <!-- left menu starts -->
                <jsp:include page="../../common/menu.jsp"/>
                <!-- left menu ends -->

                <jsp:include page="../../common/noscript.jsp"/>

                <div id="content" class="col-lg-10 col-sm-10">
                    <!-- content starts -->
                    <div>
                        <ul class="breadcrumb">
                            <li>
                                <a href="#">Home</a>
                            </li>
                            <li>
                                <a href="#">Dashboard</a>
                            </li>
                        </ul>
                    </div>
                    <!-- info block starts-->
                    <jsp:include page="../../common/infoblock.jsp"/>
                    <!-- info block ends -->

                    <div class="row">
                        <div class="box col-md-12">
                            <div class="box-inner">
                                <div class="box-header well">
                                    <h2><i class="glyphicon glyphicon-info-sign"></i> Introduction</h2>

                                    <div class="box-icon">
                                        <a href="#" class="btn btn-setting btn-round btn-default"><i
                                                class="glyphicon glyphicon-cog"></i></a>
                                        <a href="#" class="btn btn-minimize btn-round btn-default"><i
                                                class="glyphicon glyphicon-chevron-up"></i></a>
                                        <a href="#" class="btn btn-close btn-round btn-default"><i
                                                class="glyphicon glyphicon-remove"></i></a>
                                    </div>
                                </div>
                                <div class="box-content row">
                                    <div class="col-lg-7 col-md-12">
                                        <h1>Publisher List </h1>
                                        <table class="table table-striped table-bordered bootstrap-datatable datatable responsive">
                                            <thead>
                                                <tr>
                                                    <th>No</th>
                                                    <th>Id</th>
                                                    <th>Name</th>
                                                    <th>Status</th>
                                                    <th>Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                
                                                <c:forEach items="${requestScope.publisherList}" var="publisher" varStatus="counter">
                                                <tr>
                                                    <td>${counter.index + 1}</td>
                                                    <td class="center">${publisher.id}</td>
                                                    <td class="center">${publisher.name}</td>
                                                    <td class="center">${publisher.status} <span class="label-success label label-default">Active</span></td>
                                                    <td class="center">
                                                        <a class="btn btn-success" href="cs?action=viewPublisher&id=${publisher.id}">
                                                            <i class="glyphicon glyphicon-zoom-in icon-white"></i>
                                                            View
                                                        </a>
                                                        <a class="btn btn-info" href="cs?action=showPublisherForEdit&id=${publisher.id}">
                                                            <i class="glyphicon glyphicon-edit icon-white"></i>
                                                            Edit
                                                        </a>
                                                        <a class="btn btn-danger" href="cs?=action=showPublisherForDelete&id=${publisher.id}">
                                                            <i class="glyphicon glyphicon-trash icon-white"></i>
                                                            Delete
                                                        </a>
                                                    </td>
                                                </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- content ends -->
                </div><!--/#content.col-md-0-->
            </div><!--/fluid-row-->

            <!-- Ad, you can remove it -->
            <%--<jsp:include page="common/ad.jsp"/>--%>
            <!-- Ad ends -->

            <hr>

            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                 aria-hidden="true">

                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">Ã</button>
                            <h3>Settings</h3>
                        </div>
                        <div class="modal-body">
                            <p>Here settings can be configured...</p>
                        </div>
                        <div class="modal-footer">
                            <a href="#" class="btn btn-default" data-dismiss="modal">Close</a>
                            <a href="#" class="btn btn-primary" data-dismiss="modal">Save changes</a>
                        </div>
                    </div>
                </div>
            </div>

            <jsp:include page="../../common/footer.jsp"/>

        </div><!--/.fluid-container-->

        <jsp:include page="../../common/js.jsp"/>

    </body>
</html>
