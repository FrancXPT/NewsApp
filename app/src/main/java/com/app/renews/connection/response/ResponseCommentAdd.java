package com.app.renews.connection.response;

import com.app.renews.model.Comment;

import java.io.Serializable;

public class ResponseCommentAdd implements Serializable {
    public String code = "";
    public Comment comment = new Comment();
}
