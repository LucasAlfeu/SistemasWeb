<?php
    if(isset($_POST['submit'])){ //Mostra as informações de uma variável criado depois que é enviada o input type file
        print_r($_FILES);
    }
?>