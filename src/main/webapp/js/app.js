var taotaoApp = angular.module("taotaoApp", ['ngRoute']);

function taotaoRouteConfig($routeProvider) {

    $routeProvider.when("/", {
        controller: 'indexController',
        templateUrl: '/taotao/web/main.html'
    }).when("/product/detail/:id", {
        controller: 'productController',
        templateUrl: '/taotao/web/productDetail.html'
    }).otherwise({
        redirectTo: '/'
    });

}

taotaoApp.config(taotaoRouteConfig);