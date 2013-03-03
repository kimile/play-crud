'use strict';

/* Controllers */

function StoresListCtrl($scope, $http) {
  $http.get('/stores').success(function(response) {
    $scope.phones = response.data;
  });

  $scope.orderProp = 'name';
}

//PhoneListCtrl.$inject = ['$scope', '$http'];


function PhoneDetailCtrl($scope, $routeParams) {
  $scope.phoneId = $routeParams.phoneId;
}

//PhoneDetailCtrl.$inject = ['$scope', '$routeParams'];
