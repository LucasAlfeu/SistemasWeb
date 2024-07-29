<!DOCTYPE html>
<html>
    <body>
    </br>
    </br>
    </br>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post" enctype="multipart/form-data">
            <input type="text" name="nome" placeholder="Seu nome">
            </br>
            <input type="file" name="arquivo" id="arquivo">
            </br>
            <input type="submit" name="enviar">
        </form>

        <?php
            if(isset($_POST['enviar'])){ //Mostra as informações de uma variável criado depois que é enviada o input type file

                //print_r($_FILES);// %_FILES é uma variável que guarda um array com informações do arquivo enviado

                if (!empty($_FILES['arquivo']['name'])){ // verificando se o nome do arquivo enviado não está vazio
                    $nomeArquivo = $_FILES['arquivo']['name'];
                    $tipo = $_FILES['arquivo']['type'];
                    $nomeTemporario = $_FILES['arquivo']['tmp_name'];
                    $tamanho = $_FILES['arquivo']['size'];
                    $erros = array();

                    //Validação de tamanho
                    $tamMax = 1024 * 1024 * 5; // 5MB
                    if($tamanho > $tamMax){
                        $erros[] = "Seu arquivo excede o tamanho máximo<br>";
                    }
                    
                    //Validação do tipo de arquivo
                    $arquivosPermitidos = ["png", "jpg", "jpeg"]; //array com as extenssões permitidas
                    $extensao = pathinfo($nomeArquivo, PATHINFO_EXTENSION);
                    if(!in_array($extensao, $arquivosPermitidos)){ // in array retorna um boolean, ela procura o tipo de extensão no array arquivocPermitidos
                        $erros[] = "Arquivo não permitido<br>";
                    }

                    //Validação pelo tipo de arquivo MIME type
                    $typePermitidos = ["image/png", "image/jpg", "image/jpeg"];
                    if(!in_array($tipo, $typePermitidos)){
                        $erros[] = "Tipo de arquivo não permitido<br>";
                    }

                    //Mostrar os erros
                    if(!empty($erros)){
                        foreach($erros as $erro){
                            echo $erro;
                        }
                    } else {
                        $caminho = "uploads/";
                        $hoje = date("d-m-Y_h-h"); //Pega o dia, mes, ano, horas e minutos que o arquivo foi feito o upload
                        $novoNome = $hoje."-".$nomeArquivo;

                        //função pra fazer o upload, o primeiro parâmetro é o nome temporario e o segundo é o destino concatenando com o nome do arquivo
                        if (move_uploaded_file($nomeTemporario, $caminho.$novoNome)){
                            echo "Upload feito com sucesso";
                        } else {
                            echo "Erro ao enviar o arquivo!";
                        }

                    }
                }
            }
        ?>
    </body>
</html>