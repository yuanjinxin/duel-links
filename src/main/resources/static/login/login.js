function login() {
    $.post(ctx + "/login", {
        "username": $("#username").val(),
        "password": $("#password").val(),
        "captcha": $("#captcha").val(),
        "remember-me": rememberMe,
    }, function (data) {
        if (data.code == 300) {
            layer.msg(data.msg, {icon: 1,time: 1000}, function () {
                window.location.href = ctx + data.url;
            });
        } else {
            layer.msg(data.msg, {icon: 2,time: 2000}, function () {});
        }
    });
}