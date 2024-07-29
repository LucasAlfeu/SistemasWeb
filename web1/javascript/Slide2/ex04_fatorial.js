function calculaFatorial(num){
    aux = 1
    for(i=1; i<=num; i++){
        aux *= i
    }
    console.log(`${num}! = ${aux}`)
}

calculaFatorial(7)