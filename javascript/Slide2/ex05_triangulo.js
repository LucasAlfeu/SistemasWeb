function verificaTriangulo(lado1, lado2, lado3){
    if(lado1-lado3 < lado2 && lado2 < lado1 + lado3){
        console.log("É Um triangulo")
        classificaTriangulo(lado1, lado2, lado3)
    } else {
        console.log("Não é um triangulo")
    }
}

function classificaTriangulo(lado1, lado2, lado3){
    if(lado1 == lado2 && lado1 == lado3){
        console.log("Esse trinagulo é EQUILÁTERO, possui todos os lados iguais")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        console.log("Esse triangulo é ISÓSCELES, possui dois lados iguais")
    } else {
        console.log("Esse triangulo é ESCALENO,possui todos os lados diferentes")
    }
}

verificaTriangulo(6,6,6)
verificaTriangulo(6,1,6)
verificaTriangulo(4,5,6)
verificaTriangulo(1,6,1)
