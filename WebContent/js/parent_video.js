window.onload = function() {}

$(document).ready(function() {
	var currentIndex = -1;
	$("#video_tab>p").click(function() {
		var index = $(this).index();
		selectMode(index);
	})
	//初始化
	selectMode(0);
	function selectMode(index) {
		if (currentIndex != index) {
			selectTab(index);
			switch (index) {
				case 0:
					$(".video_middle_all").show();
					$(".video_middle_paid").hide();
					break;
				case 1:
					$(".video_middle_all").hide();
					$(".video_middle_paid").show();
					break;
			}
			currentIndex = index;
		}

		function selectTab(index) {
			console.log($("#video_tab>p").length);
			for (var i = 0; i < 2; i++) {
				if (index == i) {
					$("#video_tab>p").eq(i).addClass("video_choose");
				} else {
					$("#video_tab>p").eq(i).removeClass("video_choose");
				}
			}
		}
	}
});