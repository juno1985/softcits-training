$(function(){
	/* alert($("#ctx").val()); */
	$("#attach").uploadify({
		/* height	: 30, */
		swf : $("#ctx").val() + '/resources/uploadify/uploadify.swf',
		uploader : $("#ctx").val() + '/admin/users/picUpload',
		/* width : 100, */
		auto : false,
		multi : false,
		fileObjName : "attach",
		uploadLimit : 1,
		fileTypeExts : "*.jpg; *.png",
		/*debug : true,*/
		/* "onUploadError" : function(file, errorCode, errorMsg, errorString){
			alert(file.name + " " + errorCode + " " + errorMsg + " " + errorString); */
		onUploadSuccess : function(file, data, response) {
			/*  alert(data + " " + response);  */

			var obj = $.parseJSON(data);
			/* alert(obj.msg); */

			//将后台返回的图片名保存进隐藏dom
			$("#attSrc").val(obj.msg);

			/* alert($("#attSrc").val()); */
			$("#imgPreview").find("p").remove();
			$("body").find("#imgPreview").append(
					"<img width='300px' height='350px' src='"+ $("#ctx").val() + 
						"/resources/upload/" + obj.msg + "'/>");
		}
	});
	$("#uploadFile").click(function() {
		$("#attach").uploadify("upload", "*");
	});
})(jQuery)