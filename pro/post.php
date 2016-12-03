<?php

if (isset($_POST["nombre"]) && isset($_POST["apPaterno"]) && isset($_POST["apMaterno"]) &&isset($_POST["email"]) && isset($_POST["usuario_col"]) && isset($_POST["password"]) && isset($_POST["cp"]) && isset($_POST["nac"]) && isset($_POST["sexo"]) && isset($_POST["cel"]) && isset($_POST["rol"]) && isset($_POST["turno"])) {
	if ($_POST["nombre"] != "" && $_POST["apPaterno"] != ""){
		
        echo $_POST["nombre"];
		echo "<br/>";
		echo $_POST["apPaterno"];
        
        $name = $_POST["nombre"];
        $apaterno = $_POST["apPaterno"];
        $amaterno = $_POST["apMaterno"];
        $email = $_POST["email"];
        $usuario_col = $_POST["usuario_col"];
        $password = $_POST["password"];
        $cp = $_POST["cp"];
        $nac = $_POST["nac"];
        $sexo = $_POST["sexo"];
        $correo_unam = $_POST["correo_unam"];
        $cel = $_POST["cel"];
        $rol = $_POST["rol"];
        $turno = $_POST["turno"];
        require_once "./form_model.php";
        $user_added = add_user($name,$apaterno, $amaterno, $email, $usuario_col, $password, $cp, $nac, $sexo, $correo_unam, $cel, $rol, $turno);
	} 
    else {
		$error = "Faltan Datos";
		require_once("contact.html");
	}
} else {
	require_once("contact.html");
}
?>