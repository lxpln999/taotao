function productController($scope,$http){

    $scope.products=function(){
        $http.get("/taotao/1/products",{
            params:{

            }
        }).success(function(data){
            $scope.products = data['data'];
        })
    }
}
