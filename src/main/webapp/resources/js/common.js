	$(function() {
		$('#attach-file').on('change', function() {
			$("#file-name").html(this.files[0].name);
			$("#file-name").css('padding-right','15px');
			$('#delete-file').css('display', 'inline-block')
		});
		$('#delete-file').on('click', function() {
			$('#attach-file').val('');
			$("#file-name").html('');
			$("#file-name").css('padding-right','0px');
			$('#delete-file').css('display', 'none')
			
		});
	});
	
	function need() {
		var need=true;
		$('.need').each(function() {
			if($(this).val()==""){
				alert($(this).attr('title')+' 입력하세요!');
				$(this).focus();
				need= false;
				return need;
			}
		});
		return need;
	}