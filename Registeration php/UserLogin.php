<?php

    $con = mysqli_connect("localhost", "youngwoo311", "duddn311^^", "youngwoo311");

    $userID = $_POST["userID"];
    $userPassword = $_POST["userPassword"];

    $statement = mysqli_prepare($con, "SELECT * FROM USER_REG WHERE userID = ?"); //개인정보 암호화로 수정
    mysqli_stmt_bind_param($statement, "s", $userID); //개인정보 암호화로 수정
    mysqli_stmt_execute($statement);

    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $checkedPassword, $userGender, $userMajor, $userEmail ); //개인정보 암호화로 수정

    $response = array();
    $response["success"] = false;

    while(mysqli_stmt_fetch($statement)){
        if(password_verify($userPassword, $checkedPassword)){//개인정보 암호화로 추가
            $response["success"] = true;
            $response["userID"] = $userID;
        }
        
    }

    echo json_encode($response);
?>