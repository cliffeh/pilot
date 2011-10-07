/* pilot.js */
function pilot_init() {
	$('#test').clock();

	$.ajax({
		url : 'http://192.168.0.123:8080/pilot/rest/list',
		dataType : 'json',
		success : function(data) {
			$('#test2').append(data);
//			var items = [];
//
//			$.each(list, function(data) {
//				$.each(data, function(key, val) {
//					items.push('<li id="' + key + '">' + val + '</li>');
//				});
//			});
//
//			$('<ul/>', {
//				'class' : 'my-new-list',
//				html : items.join('')
//			}).appendTo('#test2');
			
		},
		error : function(jqXHR, textStatus, errorThrown) {
			$('#test2').append("error retrieving data: " + textStatus);
		}
	});
}
