package com.app.renews.connection.response;

import com.app.renews.model.News;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseNews implements Serializable {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public List<News> news = new ArrayList<>();

}
