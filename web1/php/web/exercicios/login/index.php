<?php 
    session_start();
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seção do Usuário</title>
</head>
<body>
    <h1>Tela de Login</h1>
    <br>
    <br>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>">
        Nome: <input type="text" name="fname">
        <br>
        <br>
        Senha: <input type="password" name="fpassword" id="password">
        <br>
        <br>
        <input type="submit" value="Enviar">
        <br>
        <br>
    </form>
    <?php 
        if($_SERVER["REQUEST_METHOD"] == "POST"){
            $name = $_REQUEST['fname'];
            $password = $_REQUEST['fpassword'];
            $_SESSION["nome"] = "Lucas";

            if($name == "web1" and $password == "ufrrj"){
                header("location: section.php");
            }
        }
    ?>
</body>
</html>