var sMon = new Array(12);
	sMon[0] = "Jan"
	sMon[1] = "Feb"
	sMon[2] = "Mar"
	sMon[3] = "Apr"
	sMon[4] = "May"
	sMon[5] = "Jun"
	sMon[6] = "Jul"
	sMon[7] = "Aug"
	sMon[8] = "Sep"
	sMon[9] = "Oct"
	sMon[10] = "Nov"
	sMon[11] = "Dec"

function calendar(t) {
	var sPath = "../js/calendar1.htm";
	strFeatures = "dialogWidth=206px;dialogHeight=205px;center=yes;help=no;status=no";
	st = t.value;
	sDate = showModalDialog(sPath,st,strFeatures);
	t.value = formatDate(sDate, 0);
	//alert(t.value);
}

function checkDate(t) {
	dDate = new Date(t.value);
	if (dDate == "NaN") {t.value = ""; return;}

	iYear = dDate.getFullYear()

	if ((iYear > 1899)&&(iYear < 1950)) {

		sYear = "" + iYear + ""
		if (t.value.indexOf(sYear,1) == -1) {
			iYear += 100
			sDate = (dDate.getMonth() + 1) + "-" + dDate.getDate() + "-" + iYear
			dDate = new Date(sDate)
		}
	}



	t.value = formatDate(dDate);
}

function formatDate(sDate) {
	var sScrap = "";
	var dScrap = new Date(sDate);
	if (dScrap == "NaN") return sScrap;
	
	iDay = dScrap.getDate();
	iMon = dScrap.getMonth()+1;
	iYea = dScrap.getFullYear();	
        if(iDay<10)iDay="0"+iDay;
        if(iMon<10)iMon="0"+iMon;
        
	sScrap = iYea + "-" + iMon + "-" + iDay ;
	return sScrap;
}
