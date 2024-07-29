<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercicio</title>
</head>
<body>
    <h1>Formulario</h1>
    <?php
        $nameErr = $emailErr = $genderErr = $websiteErr = "";
        $name = $email = $gender = $comment = $website = "";

        if($_SERVER["REQUEST_METHOD"] == "POST"){
            if(empty($_POST["name"])){
                $nameErr = "Nome Obrigatorio";
            } else {
                $name = teste_entrada($_POST["name"]);
                if(!preg_match("/^[a-zA-Z]*$/", $name)){
                    $nameErr = "Apenas letras e espaços em branco são permitidos";
                }
            }

            if(empty($_POST["email"])){
                $emailErr = "Email Obrigatório";
            } else {
                $email = teste_entrada($_POST["email"]);
                if(!filter_var($email, FILTER_VALIDATE_EMAIL)){
                    $nameErr = "Email mal formado";
                }
            }

            if(empty($_POST["website"])){
                $websiteErr = ""; 
            } else {
                $website = teste_entrada($_POST["website"]);
                if(!filter_var($website, FILTER_VALIDATE_URL)){
                    $websiteErr = "URL inválida";
                }
            }

            if(empty($_POST["comment"])){
                $comment = "";
            } else { $comment = teste_entrada($_POST["comment"]); }

            if(empty($_POST["gender"])){
                $genderErr = "O Gênero é obrigatório";
            } else { $gender = teste_entrada(($_POST["gender"])); }                  

        }
        
        function teste_entrada($data){
            $data = trim($data); 
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }

        if(isset($_POST['submit'])){

            if (!empty($_FILES['arquivo']['name'])){ 
                $nomeArquivo = $_FILES['arquivo']['name'];
                $tipo = $_FILES['arquivo']['type'];
                $nomeTemporario = $_FILES['arquivo']['tmp_name'];
                $tamanho = $_FILES['arquivo']['size'];
                $erros = array();

                $tamMax = 1024 * 1024 * 5; // 5MB
                if($tamanho > $tamMax){
                    $erros[] = "Seu arquivo excede o tamanho máximo<br>";
                }
                
                
                $arquivosPermitidos = ["png", "jpg", "jpeg"]; 
                $extensao = pathinfo($nomeArquivo, PATHINFO_EXTENSION);
                if(!in_array($extensao, $arquivosPermitidos)){
                    $erros[] = "Arquivo não permitido<br>";
                }

                
                $typePermitidos = ["image/png", "image/jpg", "image/jpeg"];
                if(!in_array($tipo, $typePermitidos)){
                    $erros[] = "Tipo de arquivo não permitido<br>";
                }

                
                if(!empty($erros)){
                    foreach($erros as $erro){
                        echo $erro;
                    }
                } else {
                    $caminho = "uploads/";
                    $hoje = date("d-m-Y_h-h"); 
                    $novoNome = $hoje."-".$nomeArquivo;

                    if (move_uploaded_file($nomeTemporario, $caminho.$novoNome)){
                        echo "Upload feito com sucesso";
                    } else {
                        echo "Erro ao enviar o arquivo!";
                    }

                }
            }
        }
                
    ?>

        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" enctype="multipart/form-data">

            <H1>PHP Form Validation Exemple</H1>

            Name: <input type="text" name="name"><br>
            <span class="error"><?php echo $nameErr?></span>
            <br><br>

            Email:<input type="text" name="email"><br>
            <span class="error"><?php echo $emailErr?></span>
            <br><br>

            Website: <input type="text" name="website"><br>
            <span class="error"><?php echo $websiteErr?></span>
            <br><br>

            Comment: <textarea name="comment" rows="5" cols="40"></textarea><br>

            Gender:<br>
            <input type="radio" name="gender" id="female" value="female" <?php isset($gender) && $gender == "female" ?>> 
            <label for="female">Female</label><br>

            <input type="radio" name="gender" id="male" value="male" <?php if(isset($gender) && $gender == "male") echo "checked" ?>>
            <label for="male">Male</label><br>

            <span class="error"><?php echo $genderErr?></span>
            <br><br>

            <input type="file" name="arquivo" id="arquivo">
            </br>

            <input type="submit" value="Submit" name="submit">


        </form>
</body>
</html>