define(['jquery'],function($){
	var cmp = {
		setConfig:function(options,$self){
			return this.setCache("_config",options,$self);
		},
		getConfig:function($self){
			return this.getCache("_config",$self);
		},
		setCache:function(key,value,$self){
			return $self.data(key,value);
		},
		getCache:function(key,$self){
			return $self.data(key);
		}
	}
	return cmp;
});