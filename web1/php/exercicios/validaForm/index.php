<html>
    <head>
        <title>Validação de Formulário em PHP</title>
    </head>
    <body>

    <?php
        $nameErr = $emailErr = $genderErr = $websiteErr = "";
        $name = $email = $gender = $comment = $website = "";

        if($_SERVER["REQUEST_METHOD"] == "POST"){
            if(empty($_POST["name"])){
                $nameErr = "Nome Obrigatorio";
            } else {
                $name = teste_entrada($_POST["name"]);
                if(!preg_match("/^[a-zA-Z]*$/", $name)){ //Valida o nome
                    $nameErr = "Apenas letras e espaços em branco são permitidos";
                }
            }

            if(empty($_POST["email"])){
                $emailErr = "Email Obrigatório";
            } else {
                $email = teste_entrada($_POST["email"]);
                if(!filter_var($email, FILTER_VALIDATE_EMAIL)){ //Valida email
                    $nameErr = "Email mal formado";
                }
            }

            if(empty($_POST["website"])){
                $websiteErr = "";   // esse campo não é obrigatório
            } else {
                $website = teste_entrada($_POST["website"]);
                if(!filter_var($website, FILTER_VALIDATE_URL)){ //Valida o site
                    $websiteErr = "URL inválida";
                }
            }

            if(empty($_POST["comment"])){
                $comment = "";   //campo não obrigatprio
            } else { $comment = teste_entrada($_POST["comment"]); }

            if(empty($_POST["gender"])){
                $genderErr = "O Gênero é obrigatório";
            } else { $gender = teste_entrada(($_POST["gender"])); }                  

        }
        
        function teste_entrada($data){  // função para tratar os dados do formulario
            $data = trim($data);            //remove espaços em branco
            $data = stripslashes($data);    //Remove contra barras (\)
            $data = htmlspecialchars($data);
            return $data;
        }
                
    ?>

        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <!-- htmlspecialchars trocas os caracteres especiais por exemplo "<" por "&lt" sempre usar em formulários -->
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
            <input type="radio" name="gender" id="female" value="female" <?php isset($gender) && $gender == "female" // Validando o radio ?>> 
            <label for="female">Female</label><br>

            <input type="radio" name="gender" id="male" value="male" <?php if(isset($gender) && $gender == "male") echo "checked" ?>>
            <label for="male">Male</label><br>

            <span class="error"><?php echo $genderErr?></span>
            <br><br>

            <input type="submit" value="Submit" name="submit">


        </form>
    </body>
</html>