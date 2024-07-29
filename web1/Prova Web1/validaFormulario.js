let elem = document.getElementById("elemInput")

function validar(elemento){
    conteudo = elemento.value
    if(conteudo.length < 5){
        elemento.value = ""
    }
}