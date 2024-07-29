<?php
    $target_dir = "uploads/"; //Especifica o diretório onde o  arquivo será salvo no servidor

    $target_file = $target_dir.basename($_FILES["fileToUpload"]["name"]);
    //target_file especifica o caminho do arquivo que está sendo enviado

    $uploadOk = 1;

    //imageFileType armazena a extensão do arquivo
    $imageFileType = pathinfo($target_file,PATHINFO_EXTENSION);

    //Verifica se o arquivo de imagem é verdadeiro pu falso
    if(isset($_POST["submit"])){
        $check = getimagesize($_FILES["fileToUpload"]["temp_name"]);
        if($check !== false){
            echo "File is an image - ".$check["mine"].".";
            $uploadOk = 1;
        } else {
            echo "File is not an image.";
            $uploadOk = 0;
        }
    }
?>