<%-- 
    Document   : questions
    Created on : 05.06.2022, 11:06:09
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
        <div class="first_block questions_block">
            <div class="bg_gradient blur">
                <img src="img/Subtract.png" alt="" class="UpHeart">
                <img src="img/Heart.png" alt="" class="DownHeart">
                <div class="container_questions">
                    <div class="question_main">
                        <div class="question_text">
                            <h2 class="question_font"></h2>
                        </div>
                        <div>
                            <p>Выбери один ответ</p>
                        </div>
                        <div>
                            <ul class="answer"></ul>
                        </div>
                    </div>
                    
                    <div class="btn_row">
                        <a href="#" id="prBtn" class="btn prev">Предыдущий вопрос</a>
                    </div>
                    
                </div>
                
            </div>
            
        </div>
        <script src="JSON\places.json"></script>      
        <script >
            window.onload = function(){
    
    

    
    fetch('JSON/questions.json')
    .then(response => response.json())
    .then(function(quiz){
        console.log(quiz);


        let result = [];
        let step = 0;

        function showQuestion(questionNumber){
            if(step == 0){
                document.getElementById("prBtn").style.display = 'none';
            }else{
                document.getElementById("prBtn").style.display = 'inline-block';
            }
            document.querySelector(".question_font").innerHTML = quiz[questionNumber]['q'];
            let answer = ''
            for (let key in quiz[questionNumber]['ans']){
                answer += `<li data-v=${key} class="answer-variant">${quiz[questionNumber]['ans'][key]}</li>`
            }
            document.querySelector(".answer").innerHTML = answer;
        }
    
        document.onclick = function (event){
            
            event.stopPropagation();
            if(event.target.classList.contains("answer-variant") && step < quiz.length ){
                result.push(event.target.dataset.v);
                step++;
                if(step >= quiz.length){
                    sessionStorage.setItem('answers',result);
                    window.location.href = "/result.html";

                }
                console.log(result);
            }
            if(event.target.classList.contains("prev") && step > 0 ){
                step--;
                result.pop();
                console.log(result);
            }
            
            
            
            
            showQuestion(step)
        }
        
        showQuestion(step)
    });

        </script>
    </body>
</html>