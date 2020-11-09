<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form action="456.ctrl">
  <div class="form-row">
    <div class="form-group">
      <label for="inputEmail4">ID</label>
      <input type="text" class="form-control" id="inputID" name="inputID">
    </div>
    <div class="form-group">
      <label for="inputPassword4">Title</label>
      <input type="text" class="form-control" id="inputTitle" name="inputTitle">
    </div>
    <div class="form-group">
      <label for="inputAddress">Price</label>
      <input type="text" class="form-control" id="inputPrice" name="inputPrice">
    </div>
  </div>
 
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>