

function multiplicaMatrix(){
    m1 = [ [1,2,3],
           [4,5,6],
           [7,8,9] ]

    m2 = [ [4,6,8],
            [2,1,0,]
            [6,5,9]]
    m3 = [ [ , , ], [ , , ], [ , , ]]
    

    m3[0][0] = m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0] + m1[2][0] * m2[2][0] 

    console.log(m1[0][0])
    console.log(m3[0][0])
}

multiplicaMatrix()