'use strict';

/* App Module */

angular.module('crud', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/stores', {templateUrl: '/assets/partials/store-list.html',   controller: StoresListCtrl}).
      when('/phones/:phoneId', {templateUrl: '/assets/partials/phone-detail.html', controller: PhoneDetailCtrl}).
      otherwise({redirectTo: '/stores'});
}]);
