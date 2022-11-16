alert("dd")
function insert(){

let title =document.querySelector(".title").value;
let content =document.querySelector(".content").value;


$.ajax({

url : "/",
data: {"title":title,"content":content},
ContentType: "application/json",
success: function(data) {
    console.log(data);
})


}