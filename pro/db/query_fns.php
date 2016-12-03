<?php

require_once 'db_fns.php';

//extrae de la db todos los items y los almacena en un arreglo
function get_items($consulta) {
    //realiza la conexion a la bd
    $conn = db_connect();
    //ejecuta el query
    $resultado = mysqli_query($conn, $consulta) OR die("ERROR ". mysqli_error($conn));
    //si no hay resultados
    if (!$resultado) {
        //cierra la conexion
        mysqli_close($conn);
        //se devuelve el arreglo
        return false;
    } else {
        //en caso de haber resultados los almacenara en un arreglo
        $items_array = mysqli_fetch_all($resultado, MYSQLI_ASSOC);
        //liberamos los resultados
        mysqli_free_result($resultado);
        //cierra la conexion
        mysqli_close($conn);
        //se devuelve el arreglo
        return $items_array;
    }
}

//extrae de la db un item
function get_item($consulta) {
    //realiza la conexion a la bd
    $conn = db_connect();
    //ejecuta el query
    $resultado = mysqli_query($conn, $consulta) OR die("ERROR ". mysqli_error($conn));
    //si no hay resultados
    if (!$resultado) {
        //cierra la conexion
        mysqli_close($conn);
        return false;
    } else {
        //regresa unicamente el primer elemento
        $row = mysqli_fetch_array($resultado);
        //liberamos los resultados
        mysqli_free_result($resultado);
        //cierra la conexion
        mysqli_close($conn);
        return $row;
    }
}

//agrega un item
function add_item($consulta) {
    //realiza la conexion a la bd
    $conn = db_connect();
    //ejecuta el query
    $resultado = mysqli_query($conn, $consulta) OR die("ERROR ". mysqli_error($conn));
    //si no hay resultados
    if (!$resultado) {
        //cierra la conexion
        mysqli_close($conn);
        return false; //no se pudo agregar
    } else {
        $last_id = mysqli_insert_id($conn);
        //cierra la conexion
        mysqli_close($conn);
        return $last_id; //se agrego el elemento
    }
}

//actualiza los datos de un item
function change_item($consulta) {
    //realiza la conexion a la bd
    $conn = db_connect();
    //ejecuta el query
    $resultado = mysqli_query($conn, $consulta) OR die("ERROR ". mysqli_error($conn));
    //si no hay resultados
    if (!$resultado) {
        //cierra la conexion
        mysqli_close($conn);
        return false; //no hay cambio
    } else {
        //cierra la conexion
        mysqli_close($conn);
        return true; //cambio realizado
    }
}

//borra un item
function delete_item($consulta) {
    //realiza la conexion a la bd
    $conn = db_connect();
    //ejecuta el query
    $resultado = mysqli_query($conn, $consulta) OR die("ERROR ". mysqli_error($conn));
    //si no hay resultados
    if (!$resultado) {
        //cierra la conexion
        mysqli_close($conn);
        return false; //no se pudo borrar
    } else {
        //cierra la conexion
        mysqli_close($conn);
        return true; //se borro el elemento
    }
}
