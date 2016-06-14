(function () {
    var app = angular.module('productsApp', []);

    app.controller('ProductListController', [ '$http', function ($http) {
        var productList = this;
        productList.isFormVisible = false;

        productList.getAllProducts = function () {
            return productList.products;
        };

        productList.getCurrentProduct = function () {
            return productList.currentProduct;
        };

        productList.getMaxId = function () {
            //http://stackoverflow.com/questions/4020796/finding-the-max-value-of-an-attribute-in-an-array-of-objects
            return Math.max.apply(Math,productList.products.map(function(o){return o.product_id;}))
        };

        productList.addNewProduct = function(product) {
            product.product_id=productList.getMaxId()+1;
            productList.products.push(product);
        };

        productList.deleteProduct = function (id) {
            var index = productList.products.indexOf(productList.currentProduct);
            if (index === id) {
                productList.closeForm();
            }
            productList.products.splice(id, 1);
        };

        productList.editProduct = function (id) {
            productList.isFormVisible = true;
            productList.currentProduct = productList.products[id];
        };

        productList.openEmptyForm = function () {
            productList.isFormVisible = true;
            productList.currentProduct = {};
        };

        productList.closeForm = function () {
            productList.isFormVisible = false;
        };

        productList.submitForm = function (product) {
            if(!product.product_id) {
                productList.addNewProduct(product);
            }
            productList.currentProduct = {};
            productList.isFormVisible = false;
        };

        productList.products = [];
		
		$http.get('http://localhost:8080/products').success(function(data){
			productList.products = data;
		});
    }]);
})();