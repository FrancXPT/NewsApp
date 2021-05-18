package com.app.renews.data;

public class Constant {

    /**
     * -------------------- EDIT THIS WITH YOURS -------------------------------------------------
     */

    // Edit WEB_URL with your url. Make sure you have backslash('/') in the end url
//    public static String WEB_URL = "http://demo.dream-space.web.id/notch_panel/";
    public static String WEB_URL = "http://bbamoula.ml/";

    /* [ IMPORTANT ] be careful when edit this security code */
    /* This string must be same with security code at Server, if its different android unable to submit data */
    public static final String SECURITY_CODE = "U95w8iazFYkMPfZ92RPhrTUiGT47dxj1cmBnlnowqarqmewrwt8ytBd2gvEGlold4vfdHqPXRgnP6FelzNR55mZeGNH4RYz7xUtH";

    // Edit with your app portfolio
    public static String MORE_APP_URL = "http://bbamoula.ml/";

    // this limit value used for give pagination (request and display) to decrease payload

    public static int NEWS_PER_REQUEST = 10;
    public static int TOPIC_PER_REQUEST = 10;
    public static int COMMENT_PER_REQUEST = 10;
    public static int NOTIFICATION_PAGE = 20;
    public static int SAVED_PAGE = 15;

    // retry load image notification
    public static int LOAD_IMAGE_NOTIF_RETRY = 3;

    // Method get path to image
    public static String getURLimgNews(String file_name) {
        return WEB_URL + "uploads/news/" + file_name;
    }

    public static String getURLimgTopic(String file_name) {
        return WEB_URL + "uploads/topic/" + file_name;
    }

    public static String getURLimgUser(String file_name) {
        return WEB_URL + "uploads/user/" + file_name;
    }

}
