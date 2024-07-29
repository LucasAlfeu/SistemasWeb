function calculaFibonacci(num){
    let anterior = 0
    let proximo = 1

    console.log(anterior)
    for(i=0; i<num; i++){
        console.log(proximo)
        proximo = anterior + proximo
        anterior = proximo - anterior
    }
}

calculaFibonacci(10)