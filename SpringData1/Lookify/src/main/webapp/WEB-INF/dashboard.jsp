<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

    <!DOCTYPE html>
    <html>

    <head>
        <%@ page isErrorPage="true" %>
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                    <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>

    <body>
        <c:if test="${m}">
            <a href="/dashboard">Dashboard</a>
        </c:if>

        <table>
            <div class="top">
                <a href="/music/new">Add New</a>
                <span>
                    <form action="/search" method="post">
                        <input type="text" name="creator">
                        <input type="submit" value="Search">
                    </form>
                </span>
            </div>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Creator</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${Music}" var="music">
                    <tr>
                        <td><a href="/music/${music.id}">${music.name}</a></td>
                        <td>${music.rating}</td>
                        <td>${music.creator}</td>
                        <td>
                            <div class="form">
                                <form action="/music/${music.id}" method="post"><input type="hidden" name="_method"
                                        value="delete"><input type="submit" value="Delete"></form>
                                <form action="/music/${music.id}/edit" method="get"><input type="submit" value="Edit">
                                </form>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>

    </html>