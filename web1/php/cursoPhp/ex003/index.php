<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tipos Primitivos</title>
</head>
<body>
    <h1>Teste de Tipos Primitivos</h1>
    <?php 
        $num = 300;
        echo "O valor da variável eh: $num";
        echo "<br>";

        $num2 = 0x1A;   //Hexadecimal
        echo "O valor da variável eh: $num2";
        echo "<br>";

        $num3 = 0b1011; //Binario
        echo "O valor da variável eh: $num3";
        echo "<br>";

        var_dump($num);  // Mostra informações da variavel

        echo "<br>";
        $num4 ="345";
        var_dump($num4);
        echo "<br>";
        echo "Conversão de string para float: ".var_dump((float) $num4);
        
        echo "<br>";
        $vet = [1,4,"Lucas", 3.14, true];
        var_dump($vet)

    ?>
</body>
</html>