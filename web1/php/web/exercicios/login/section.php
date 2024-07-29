<?php 
    session_start();
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Usuário</title>
</head>
<body>
    <h1>Bem vindo</h1>
    <br>
    <br>
    <p>Usuário Logado</p>
    <br>
    <br>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>">
        <input type="submit" value="Sair">
    </form>
    <?php 
        echo "Meu nome é ".$_SESSION["nome"];
        if($_SERVER["REQUEST_METHOD"] == "POST"){
            header("location: index.php");
            session_destroy();
        }
    ?>
</body>
</html>