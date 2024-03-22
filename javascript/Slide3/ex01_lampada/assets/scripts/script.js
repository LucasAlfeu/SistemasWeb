let on = "./assets/images/bulbOn.png"
let off = "./assets/images/bulbOff.png"


function bulbOnOff(){
    let bulb = document.getElementById("bulb")
    let text = document.getElementById("text")
    if(bulb.src.match("bulbOff")){
        bulb.src = on;
        text.innerText= "Ligado"
    } else {
        bulb.src = off;
        text.innerText= "Desligado"
    }
}