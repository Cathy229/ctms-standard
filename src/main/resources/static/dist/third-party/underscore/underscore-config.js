define(["_underscore"],function(){
	_.templateSettings = {
	  interpolate: /\{\{(.+?)\}\}/g
	};
	return _;
});