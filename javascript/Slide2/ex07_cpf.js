function validaCpf(cpf){
    if(cpf.length == 11){        
        let primeiro = cpf[0]*10 + cpf[1]*9 + cpf[2]*8 + cpf[3]*7 + cpf[4]*6 + cpf[5]*5 + cpf[6]*4 + cpf[7]*3 + cpf[8]*2
        primeiro = (primeiro * 10) % 11
    
        let segundo = cpf[0]*11 + cpf[1]*10 + cpf[2]*9 + cpf[3]*8 + cpf[4]*7 + cpf[5]*6 + cpf[6]*5 + cpf[7]*4 + cpf[8]*3 + cpf[9]*2
        segundo = (segundo * 10) % 11

        if(primeiro == cpf[9] && segundo == cpf[10]){
            console.log(`${cpf} é um cpf válido`)
        } else {
            console.log(`${cpf} não é um cpf válido`)
        }
    } else {
        console.log(`${cpf} não é um cpf válido`)
    }
}

validaCpf("52998224725")
console.log("---------------------------")
validaCpf("12345678912")