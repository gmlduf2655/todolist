let time = document.getElementById("time");
let day = document.getElementById("day");

function showTime(){
	getTime();
	setInterval(getTime,1000);
}

function getTime(){
	let date = new Date();

	let hour = date.getHours();
	if(hour < 10){
		hour = "0" + hour;
	}
	let min = date.getMinutes();
	if(min < 10){
		min = "0" + min;
	}
	let sec = date.getSeconds();
	if(sec< 10){
		sec = "0" +sec;
	}
	
	let dayNum = date.getDay();
	let dayOfWeek = getDayOfWeek(dayNum);	
	
	time.innerHTML = `<h1>${hour}:${min}:${sec}</h1>`;
	day.innerHTML = `${dayOfWeek}`;
}

function getDayOfWeek(dayNum){
	let dayOfWeek = "";
	switch(dayNum){
		case 0:
			dayOfWeek = "월요일";
			break;
		case 1:
			dayOfWeek = "화요일";
			break;
		case 2:
			dayOfWeek = "수요일";
			break;
		case 3:
			dayOfWeek = "목요일";
			break;
		case 4:
			dayOfWeek = "금요일";
			break;
		case 5:
			dayOfWeek = "토요일";
			break;
		case 6:
			dayOfWeek = "일요일";
			break;
		default: break;
		
	}
	return dayOfWeek;
}

showTime();