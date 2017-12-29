<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 class="my-4">Shop Name</h1>
<div class="list-group">
	<c:forEach items="${categories}" var="categoryItem">
		<a href="${contextRoot}/show/category/${categoryItem.id}/products" class="list-group-item ${(not empty category && category.id eq categoryItem.id) ? 'active' : '' }">${categoryItem.name}</a> 
	</c:forEach>
</div>