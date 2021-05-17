package com.app.notch.connection.response;


import com.app.notch.model.News;
import com.app.notch.model.Topic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseHome implements Serializable {

    public String status = "";
    public List<News> featured = new ArrayList<>();
    public List<Topic> topic = new ArrayList<>();

}
