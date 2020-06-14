<?php

    $con = mysqli_connect("localhost", "youngwoo311", "duddn311^^", "youngwoo311");

    $userID = $_POST["userID"];
    $userPassword = $_POST["userPassword"];
    $userGender = $_POST["userGender"];
    $userMajor = $_POST["userMajor"];
    $userEmail = $_POST["userEmail"];

    $checkedPassword = password_hash($userPassword, PASSWORD_DEFAULT);//개인정보 암호화
    $statement = mysqli_prepare($con, "INSERT INTO USER_REG VALUES (?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "sssss", $userID, $checkedPassword, $userGender, $userMajor, $userEmail);//userPassword->checkedPassword로 수정
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>