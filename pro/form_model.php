<?php
    require_once("./db/query_fns.php");
function add_user($name,$apaterno,$amaterno,$email,$user, $password, $cp, $nac, $sexo, $correo_unam, $cel, $rol, $turno){
	$consulta = "INSERT INTO usuario (nombre,ap_paterno,ap_materno,email,usuario_col,password,codigo_postal,fecha_nacimiento,sexo,correo_unam,tel_celular,rol,turno_id) VALUES ('".$name."','".$apaterno."', '".$amaterno."', '".$email."', '".$user."', '".$password."', '".$cp."', '".$nac."', '".$sexo."', '".$correo_unam."', '".$cel."', '".$rol."', '".$turno."');";
	$tupla = add_item($consulta);
	return $tupla;
}
?>