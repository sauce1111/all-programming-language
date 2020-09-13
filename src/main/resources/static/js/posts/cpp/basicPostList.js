

$(function(){

  fnListenEvent_basicPostList();


  sortNo = $('input[name=sortNo]').val();
  sortIdx = sortNo == '' ? 0 : parseInt(sortNo) - 1;
  $('.sort').eq(sortIdx).css({'color':'black', 'font-weight':'700'});


  $('input[name=recordCountPerPage][value='+recordCountPerPage+']').attr('checked', true);

});

function fnListenEvent_basicPostList(){

  $('.sort').click(function(){
    $('input[name=sortNo]').val($(this).index() + 1);
    $('input[name=currentPageNo]').val('');
    form.submit();
  });


  $('input[name=postKeyword]').keydown(function(e){
    if(e.keyCode == 13){
     fnSearchByKeyword();
    }
  });


  $('input[name=recordCountPerPage]').change(function(){
    $('input[name=currentPageNo]').val('');
    form.submit();
  });

}

function fnSearchByKeyword(){

  keyword = $('input[name=postKeyword]').val();
  $('input[name=postKeyword]').val($.trim(keyword));
  $('input[name=currentPageNo]').val('');
  form.submit();
  return;

}