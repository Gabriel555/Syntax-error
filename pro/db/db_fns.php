<?php

function db_connect() {
    $con = mysqli_connect("localhost", "root", "", "mydb_hack");
    if (mysqli_connect_errno()) {
        die("Connection failed: " . mysqli_connect_error());
    }
    mysqli_set_charset( $con, 'utf8');
    return $con;
}
