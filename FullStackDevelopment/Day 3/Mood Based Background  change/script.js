/* We will create a function which will be called whenever a button is clicked!!!*/
function changeMood(mood){
    //1.create variables to find the parts of the page to change*/
    const body=document.body;
    const text=document.getElementById('status');
    //we will do the changes using if-else conditions
    if(mood==="happy"){
        body.style.background = "#FFDE59";
        body.style.color="black"; //Mask the text black
        text.textContent="Keep shining! 🌞";//updates h1

    }else if(mood==="calm"){
        body.style.background="#7091F5";//blue
        body.style.color="white";
        text.textContent="take a deep breathe...🧘";
    }else if(mood==="sad"){
        body.style.background="#2D3436";
        body.style.color="It's okay to feel this way. 🌧️";
    }else if(mood==="angry"){
        body.style.background="#D63031";
        body.style.color="white";//
        text.textContent="Deep breaths..let it out. 🔥";//updates h1
    }
}
