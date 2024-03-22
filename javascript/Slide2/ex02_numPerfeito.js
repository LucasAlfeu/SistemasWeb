function verificaPerfeicao(num){
    perfeito = false
    divisores = []
    count = 0

    for (i=1; i<=num; i++){
        if(num%i == 0){
            divisores.push(i)
        }
    }
    
    for(i=0; i<divisores.length-1; i++){
        count += divisores[i]
    }

    if(count == num){
        perfeito = true
    }
    return perfeito
}
verificaPerfeicao(8)

function numerosPerfeitosEmUmIntervalo(intervalo){
    ehPerfeito = false
    listaNumPerfeitos = []

    for(j=1; j<=intervalo; j++){
        ehPerfeito = verificaPerfeicao(j)
        if(ehPerfeito == true){
            listaNumPerfeitos.push(j)
        }
    }

    console.log(`Lista de numeros pereitos no intervalo de 1 a ${intervalo}`)
    for(i=0; i<listaNumPerfeitos.length; i++){
        console.log(listaNumPerfeitos[i])
    }
}

numerosPerfeitosEmUmIntervalo(1000)