function changeValue(sign) {
	// var val = document.getElementById("value");
	// var actualValue = val.innerHTML;
	var current = parseInt(document.querySelector('#value').innerHTML,0);
	console.log("js");
	if (sign === '+') {
		current++;
		// actualValue++;
	}else if(sign === '-'){
		current--;
		// actualValue--;
	}
	console.log(current);
	// val.innerText = current;
	document.getElementById("value").innerHTML = current;
	//val.innerHTML = actualValue;
}
