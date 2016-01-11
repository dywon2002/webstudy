	var mem = {id:"hong",name:"홍",age:22};
	console.log("mem type : "+typeof(mem));
	
	// JSON.stringify(객체) -> 문자열로 반환
	// JSON.parse(문자열) -> JSON 객체로 변환
	var jsonStr = JSON.stringify(mem); // JSON 형태는 키 값에 더블쿼티션이 붙는다 , 객체가 아닌 문자열로 바뀐다
	console.log("json type : "+typeof(jsonStr));
	var jsonObj = JSON.parse(jsonStr);
	console.log("jsonObj type : "+typeof(jsonObj));
	console.log(jsonObj);