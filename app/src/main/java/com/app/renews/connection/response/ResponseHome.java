package com.app.renews.connection.response;


import com.app.renews.model.News;
import com.app.renews.model.Topic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseHome implements Serializable {

    public String status = "";
    public List<News> featured = new ArrayList<>();
    public List<Topic> topic = new ArrayList<>();

}
