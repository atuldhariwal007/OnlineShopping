$(function(){
//solving active button problem
	switch(menu){
	case "About us":
		$("#about").addClass("active");
		break;
	case "Home":
		$("#home").addClass("active");
		break;
	case "Contact us":
		$("#contact").addClass("active");
		break;
		
	}
});