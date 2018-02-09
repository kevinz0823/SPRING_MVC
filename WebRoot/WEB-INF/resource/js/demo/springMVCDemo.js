function springMVCReturnJSON() {
	// 一般使用简单易用的高层实现 $.get, $.post等
	// 大多数情况下你无需直接操作$.ajax函数，除非你需要操作不常用的选项，以获得更多的灵活性
	$.post("springMVCReturnJSON.do", {
		"param1" : "param1的值",
		"param2" : "param2的值"
	}, function(data, status) {
		data = JSON.parse(data);// 转化为JSON对象
		console.log(data);
		console.log(status);
		if (status && data.success) {
			alert("运行成功");
			// 成功之后的逻辑
		} else {
			alert("运行失败");
		}
	});
}

function springMVCRequestParam1() {
	$.post("springMVCRequestParam1.do", {
		"param1" : "param1的值",
		"param2" : "param2的值"
	}, function(data, status) {
	});
}

function springMVCRequestParam2() {
	$.post("springMVCRequestParam2.do", {
		"param1" : "param1的值",
		"param2" : "param2的值"
	}, function(data, status) {
	});
}

function springMVCRequestParam3() {
	$.post("springMVCRequestParam3.do", {
		"param1" : "param1的值",
		"param2" : "param2的值"
	}, function(data, status) {
	});
}