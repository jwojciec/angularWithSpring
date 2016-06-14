<!doctype html>
<html ng-app="productsApp">
<head>
    <meta charset="utf-8">
    <title>Products Gallery</title>
    <link rel="stylesheet" href="css/products.css">
    <link rel="stylesheet" href="css/form.css">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
    <script src="controller.js"></script>
</head>
<body ng-controller="ProductListController as productList">
<h1>Products list:</h1>

<div class="left">
    <table class="table-style">
        <thead>
        <tr>
            <th>Product Id</th>
            <th>Name</th>
            <th>Price</th>
            <th colspan=2>Action</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="product in productList.products">
            <td>{{product.product_id}}</td>
            <td>{{product.product_name}}</td>
            <td>{{product.product_price | currency}}</td>
            <td>
                <button ng-click="productList.editProduct($index)">edit</button>
            </td>
            <td>
                <button ng-click="productList.deleteProduct($index)">delete</button>
            </td>
        </tr>
        </tbody>
    </table>
    <label>
        <br>
        <button ng-click="productList.openEmptyForm()">Add Product</button>
    </label>
</div>

<div class="right">
    <form class="form-style" name="productForm" ng-show="productList.isFormVisible" novalidate>
        <h2>Product form</h2>
        <label>
            <span>product id:</span>
            <input class="faded" type="text" name="id" ng-model="productList.getCurrentProduct().product_id" readonly>
        </label>
        <label>
            <span>product name:</span>
            <input type="text" name="product_name" ng-model="productList.getCurrentProduct().product_name" required>
        </label>
        <label>
            <span>product price:</span>
            <input type="text" name="product_price" pattern="[0-9]+[.[0-9]+]?"
                   ng-model="productList.getCurrentProduct().product_price" type="number" required>
        </label>
        <label>
            <span>category:</span>
            <input type="text" name="category" ng-model="productList.getCurrentProduct().category" required>
        </label>
        <label>
            <span>expiration date: </span>
            <input type="text" name="expiration_date" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="dd/mm/yyyy"
                   ng-model="productList.getCurrentProduct().expiration_date" required>
        </label>
        <label>
            <span>description:</span>
            <textarea name="description" ng-model="productList.getCurrentProduct().description"></textarea>
        </label>
        <label>
            <span>&nbsp;</span>
            <button type="submit" ng-disabled="!productForm.$valid"
                    ng-click="productForm.$valid && productList.submitForm(productList.getCurrentProduct())">
                Submit
            </button>
            <button type="reset" ng-click="productList.closeForm()">Close Form</button>
        </label>
    </form>
</div>

</body>
</html>

