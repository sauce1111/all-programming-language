

function fnCheckLogin(url, method){

  if(loginUser == null){
    alert('로그인 후 이용해주세요.');
    return;
  }

  if(method == 'post'){
    form.attr('action', url);
    form.attr('method', 'post');
    form.submit();
    return;
  }

  location.href = url;

}


function fnGoListPage(url, currentPageNo){

   form.attr('action', url);
   form.attr('method', 'get');
   $('input[name=currentPageNo]').val(currentPageNo);
   form.submit();

}