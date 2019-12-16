package com.cookandroid.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DeleteRequest extends StringRequest {//회원가입 요청을 보내는 클래스

    final static private String URL="https://youngwoo311.cafe24.com/ScheduleDelete.php";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, String courseID, Response.Listener<String> listener){
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
