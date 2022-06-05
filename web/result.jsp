<%-- 
    Document   : result
    Created on : 05.06.2022, 11:07:09
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, width=device-width">
        <title>Kursach</title>
        <link rel="stylesheet" type= "text/css" href="css/style.css">
    </head>
    <body>
        <div class="first_block">
            <div class="bg_gradient blur">
                <div class="container">
                    <div class="space"></div>
                    <h1 class="placeName"></h1>
                    <img class="placeImg" id="placeImg" src="" alt="" >
                    <h2 class="placeDiscription"></h2>
                    <div class="space"></div>
                    <h2 class="placeAdress"></h2>
                    
                    <a href="index.jsp" class="btn again">Пройти еще раз</a>
                </div>
                
            </div>
            
        </div>
        <script src="JSON\places.json"></script>
        <script>
            window.onload = function () {
    ans = sessionStorage.getItem('answers');
    res = {}
    var maxId = 0;
    maxNum = 0;
    for (let i = 0; i < ans.length; i++) {
        if (res[ans[i]] != undefined && ans[i] != ',') {
            res[ans[i]]++;
            if (res[ans[i]] > maxNum) {
                maxNum = res[ans[i]];
                maxId = ans[i];
            }
        } else {
            res[ans[i]] = 1;
        }

    }
    console.log(ans);
    console.log(res);

    fetch('JSON/places.json')
        .then(response => response.json())
        .then(function (places) {
            const random = (min, max) => Math.floor(Math.random() * (max - min)) + min;
            var cat = "comfy";
            switch (Number(maxId)) {
                case 0:
                    cat = "comfy";
                    break;
                case 1:
                    cat = "active";
                    break;
                case 2:
                    cat = "regular";
                    break;
                case 3:
                    cat = "unique";
                    break;
                default:
                    cat = "def";
                    break;
            }
            console.log(maxId);
            console.log(cat);
            var pos = random(0,places[cat].length);
            document.querySelector(".placeName").innerHTML = places[cat][pos]['name'];
            document.querySelector(".placeDiscription").innerHTML = places[cat][pos]['discription'];
            document.querySelector(".placeAdress").innerHTML = places[cat][pos]['adress'];
            document.getElementById("placeImg").src = places[cat][pos]['image'];
        });

}
        </script>
    </body>
</html>
