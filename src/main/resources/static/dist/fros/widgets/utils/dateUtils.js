define([],function(){
	var dateUtils ={
		/**
			convert format string to Date
			parameter: format(string), dateString(string)
			return Date object

			year: YYYY
			month: MM
			date: DD
			hour: hh
			minute: mm
			second: ss
		 */
		formatStringToDate:function(format, dateString){
			var dateObj = {
					year:'',
					month:'',
					date:'',
					hour:'',
					minute:'',
					second:''
				};
				
				if (format.indexOf('Y') > -1) {
					dateObj.year = dateString.substring(format.indexOf('Y'), format.lastIndexOf('Y')+1);
				}

				if (format.indexOf('M') > -1) {
					dateObj.month = dateString.substring(format.indexOf('M'), format.lastIndexOf('M')+1);
				}

				if (format.indexOf('D') > -1) {
					dateObj.date = dateString.substring(format.indexOf('D'), format.lastIndexOf('D')+1);
				}

				if (format.indexOf('h') > -1) {
					dateObj.hour = dateString.substring(format.indexOf('h'), format.lastIndexOf('h')+1);
				}

				if (format.indexOf('m') > -1) {
					dateObj.minute = dateString.substring(format.indexOf('m'), format.lastIndexOf('m')+1);
				}

				if (format.indexOf('s') > -1) {
					dateObj.second = dateString.substring(format.indexOf('s'), format.lastIndexOf('s')+1);
				}

				return new Date(dateObj.year, dateObj.month, dateObj.date, dateObj.hour, dateObj.minute, dateObj.second);
		},
		
		/**
		 * paremeter must like: yyyy-MM-dd or yyyy-MM-dd hh:mm:ss
		 * return 0(<),1(>),2(=)
		 * in javascript 1,2==true, 0==false
		 */
		compareDateString:function(compare, compareWith){
			var compareDate = new Date(compare);
			var compareWithDate = new Date(compareWith);
			if (compareDate < compareWithDate) {
				return 0;
			} else if(compareDate > compareWithDate) {
				return 1;
			} else {
				return 2;
			}
		}
	
	};
	return dateUtils;
});