
$(function () {
    queryStudent();
    $("#query").click(function () {
        queryStudent();
    });
});

function queryStudent(){
    let name = $("#name").val();
    let age = $("#age").val();
    let student = {id:0,name,age};
    $.post("student",{stu:JSON.stringify(student),crud:"query"},function (data) {
        data = JSON.parse(data);
        if(data == "null"){
            $("<tr><td colspan='3'>没有查询到数据</td></tr>");
        }
        $("#studentData").empty();
        for (let i = 0;i<data.length;i++){
            let item = data[i];
            let tr = $("<tr></tr>");
            let idTd = $("<td>"+item.id+"</td>");
            let nameTd = $("<td>"+item.name+"</td>");
            let ageTd = $("<td>"+item.age+"</td>");
            tr.append(idTd,nameTd,ageTd);
            $("#studentData").append(tr);
        }
    })
}