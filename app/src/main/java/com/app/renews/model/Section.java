package com.app.renews.model;

import java.io.Serializable;

public class Section implements Serializable {
    public String title = "";

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }
}
