function catalogController($scope, $http) {

    $scope.catalogs = function () {
        $http.get('/taotao/1/catalogs', {
            params: {

            }
        }).success(function (data) {
            $scope.catalogs = data['data'];
        });
    }
}