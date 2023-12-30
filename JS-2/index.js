function calculateValue(sign){
	var val = document.getElementById("value1");
	var val2 = document.getElementById("value2");
	console.log(val);
	var sol = document.getElementById("answer");

	var curr1 = parseInt(val.value,0);
	var  curr2 = parseInt(val2.value,0);

	var ans = 0;
	if(sign === '+'){
		ans = curr1 + curr2;
	}else if(sign === '-') {
		ans = curr1 - curr2;
	}else if( sign === '/'){
		ans = curr1 / curr2;
	}else if( sign === '*'){
		ans = curr1 * curr2;
	}
	console.log(ans);
	console.log(ans);
	console.log(ans);
	sol.innerHTML = ans;
}