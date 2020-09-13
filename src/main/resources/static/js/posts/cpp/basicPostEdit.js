

$(function(){
  $('.writePost').click(function(){
    $.ajax({
        url : '/posts/cpp',
        data : form.serialize(),
        type : 'post',
        success : function(res) {
          alert('게시글이 작성되었습니다.');
          location.href = '/posts/cpp/basicPostList';
        }
    });
  });
});