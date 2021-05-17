package com.app.notch.connection.response;

import com.app.notch.model.Comment;

import java.io.Serializable;

public class ResponseCommentAdd implements Serializable {
    public String code = "";
    public Comment comment = new Comment();
}
