function verificaNumPrimo(num){
    listaDivisores = []
    for(i=1; i<=num; i++){
        if(num%i == 0){
            listaDivisores.push(i)
        }
    }

    if(listaDivisores.length == 2){
        console.log(`O numero ${num} é primo pois: `)
    } else {
        console.log(`O numero ${num} não é primo pois: `)
    }

    for(j=0; j<listaDivisores.length; j++){
        console.log(listaDivisores[j])
    }
}

verificaNumPrimo(31)