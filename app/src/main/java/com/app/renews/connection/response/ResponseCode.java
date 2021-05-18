package com.app.renews.connection.response;

import com.app.renews.model.User;

import java.io.Serializable;

public class ResponseCode implements Serializable {
    public String code = "";
    public User user = new User();
}
