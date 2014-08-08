taotaoApp.controller('indexController', function ($scope,$http) {

   $http.get("/taotao/1/products",{
        params:{

        }
    }).success(function(data){

        $scope.products = data['data'];
    });

});


taotaoApp.controller('productController', function ($scope,$http,$routeParams) {
    var id = $routeParams.id;
    $http.get("/taotao/1/product/detail/"+id,{
        params:{

        }
    }).success(function(data){

        $scope.product = data['data'];
    });

});