var boardC = {
    init : function () {
        var _this = this;

        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            writeMemberIdx: $('#writeMemberIdx').val(),
            title: $('#title').val(),
            memberName: $('#memberName').val(),
            content: $('#contents').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/board/c',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert("게시글 등록 완료");
            window.location.href = '/board/c';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

boardC.init();