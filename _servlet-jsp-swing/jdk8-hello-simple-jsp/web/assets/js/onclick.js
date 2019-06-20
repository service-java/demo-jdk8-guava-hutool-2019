function clockon(bgclock){
	var now = new Date(),
        year = now.getYear(),
	    month = now.getMonth(),
	    date = now.getDate(),
	    day = now.getDay();

	var week;
	month++;

	if(month<10) {
	    month="0"+month;
    }
	if(date<10) {
	    date="0"+date;
    }

    var arr_week = [ "星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
	week=arr_week[day];

	var time="";
	time=year+"年"+month+"月"+date+"日 "+week;
	if(document.all){
		bgclock.innerHTML="&nbsp;&nbsp;"+time
	}

	var timer=setTimeout("clockon(bgclock)",200);
} 
