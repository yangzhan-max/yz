document.write("<script type='text/javascript' src='layer/layer.js'></script>");
//公共代码
$(document).ready(function () {
    //引入layer
    $('#lobipanel-custom-control').lobiPanel({
        reload: false,
        close: false,
        editTitle: false
    });
    showInfoRight();
});

//渲染右上角的的头像和名称
function showInfoRight() {
    let storage = window.sessionStorage;
    let currentUser = null;
    let name = storage.getItem('name');
    let headpic = storage.getItem('headpic');
    //替换右边头像
    $('.user-avatar').html(name);
    $('.avatar-img').attr("src", "/upload/headpic/" + headpic);

};

//返回当前时间所属的学期学年
function timeJsonData() {
    //获取当前时间
    let nowTime = new Date();
    //当前年份
    let year = nowTime.getFullYear();
    //当前月份
    let month = nowTime.getMonth() + 1;

    //当前学期(默认第1学期)
    let schoolTerm = 1;
    //当前学年
    //例子：如果是第1学期，则是2019-2020学年的第1学期；如果是第2学期，则是2018-2019学期
    let schoolYear = year + "-" + (year + 1);
    if (month >= 2 && month <= 9) {
        schoolTerm = 2;
        schoolYear = (year - 1) + "-" + year;
    }
    //json数据
    let data = {
        "courseYear": schoolYear,
        "courseTerm": schoolTerm
    };
    return data;
}

//安全退出
function exit() {

    layer.confirm('你确定退出教务管理系统吗？', {
        btn: ['确定', '取消']
    }, function () {
        //清除服务端的session
        $.ajax({
            url: '/login/login-exit',
            type: 'get',
            success: function (result) {
                location.href = 'login.html';
            }
        });
    }, function () {
        return;
    });
}

//获取当前时间和日期
function getDate() {

    let myDate = new Date();
    //获取当前年
    let year = myDate.getFullYear();
    //获取当前月
    let month = myDate.getMonth() + 1;
    //获取当前日
    let date = myDate.getDate();
    //获取当前小时数(0-23)
    let h = myDate.getHours();
    //获取当前分钟数(0-59)
    let m = myDate.getMinutes();
    //获取当前秒数(0-59)
    let s = myDate.getSeconds();

    //日期时间处理
    function conver(s) {
        return s < 10 ? '0' + s : s;
    }

    //获取当前时间
    let now = year + '-' + conver(month) + "-" + conver(date) + " "
        + conver(h) + ':' + conver(m) + ":" + conver(s);

    return now;
}