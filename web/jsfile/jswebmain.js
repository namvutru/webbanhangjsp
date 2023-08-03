new WOW().init();
function buy(id){
    var m= document.f.num.value;
    document.f.action="buy?id="+id+"&num="+m;
    document.f.submit();
}

