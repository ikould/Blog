//页面请求
window.onload = function() {
	//获取登录页面的用户名和密码，并转换成字符串
	/*var str_data = $("#find_key").map(function() {
		return ($(this).attr("name") + ':' + $(this).val());
	}).get().join("&");
	str_data += ",type:ADD_ADMIN";
	str_data += ",password:123"*/
	var str_data = {"name":"liudong","type":"ADD_ADMIN1","password":123};
	console.log(str_data);
	//通过ajax传输
	$.ajax({
		type: 'post',
		url: 'main.do',
		data: str_data,

		//处理返回的结果
		success: function(data) {
			console.log('success');
			console.log(data);

			var jsonData = eval("(" + data + ")");
			//判断jsonData的数据结果			
			if (!jsonData.flagName) {
				//判断如果用户名不正确则在页面上显示错误消息
				$("#nameMsg").html("用户名错误");
				$("#pwdMsg").html("");
			} else if (!jsonData.flagPwd) {
				$("#nameMsg").html("");
				$("#pwdMsg").html("密码错误");
			} else {
				//将用户名传递给Cookie
				setCookie("userName", $("#loginName").val());

				window.location.href = "login.html#pageTwo";
				setTimeout(function() {
					window.location.href = "discover.html";
				}, 1500);
			}
		}
	});
}