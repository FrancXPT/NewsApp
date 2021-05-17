package com.app.notch.connection.response;

import com.app.notch.model.User;

import java.io.Serializable;

public class ResponseCode implements Serializable {
    public String code = "";
    public User user = new User();
}
