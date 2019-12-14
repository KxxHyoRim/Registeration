package com.cookandroid.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class AddRequest extends StringRequest {//회원가입 요청을 보내는 클래스

    final static private String URL="https://youngwoo311.cafe24.com/CourseAdd.php";
    private Map<String, String> parameters;

    public AddRequest(String userID, String courseID, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters =new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("courseID",courseID);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
