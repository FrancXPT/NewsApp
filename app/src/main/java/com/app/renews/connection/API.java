package com.app.renews.connection;

import com.app.renews.connection.response.ResponseCode;
import com.app.renews.connection.response.ResponseCommentAdd;
import com.app.renews.connection.response.ResponseCommentList;
import com.app.renews.connection.response.ResponseDevice;
import com.app.renews.connection.response.ResponseHome;
import com.app.renews.connection.response.ResponseInfo;
import com.app.renews.connection.response.ResponseNews;
import com.app.renews.connection.response.ResponseNewsDetails;
import com.app.renews.connection.response.ResponseTopic;
import com.app.renews.data.Constant;
import com.app.renews.model.CommentBody;
import com.app.renews.model.DeviceInfo;
import com.app.renews.model.SearchBody;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

public interface API {

    String CACHE = "Cache-Control: max-age=0";
    String AGENT = "User-Agent: Vido";
    String SECURITY = "Security: " + Constant.SECURITY_CODE;

    @Headers({CACHE, AGENT})
    @GET("services/info")
    Call<ResponseInfo> getInfo(
            @Query("version") Integer version
    );

    @Headers({CACHE, AGENT, SECURITY})
    @POST("services/registerDevice")
    Call<ResponseDevice> registerDevice(
            @Body DeviceInfo deviceInfo
    );

    @Headers({CACHE, AGENT, SECURITY})
    @GET("services/login")
    Call<ResponseCode> login(
            @Query("email") String email,
            @Query("password") String password,
            @Query("notif_device") String notif_device
    );

    @Headers({CACHE, AGENT, SECURITY})
    @GET("services/forgotPassword")
    Call<ResponseCode> forgotPassword(
            @Query("email") String email
    );

    @Headers({CACHE, AGENT, SECURITY})
    @Multipart
    @POST("services/register")
    Call<ResponseCode> register(
            @Part MultipartBody.Part avatar,
            @PartMap Map<String, RequestBody> data
    );

    @Headers({CACHE, AGENT})
    @GET("services/getHome")
    Call<ResponseHome> getHome();

    @Headers({CACHE, AGENT})
    @POST("services/listNewsAdv")
    Call<ResponseNews> getListNewsAdv(
            @Body SearchBody searchBody
    );

    @Headers({CACHE, AGENT})
    @GET("services/listTopic")
    Call<ResponseTopic> getListTopic(
            @Query("page") Integer page,
            @Query("count") Integer count,
            @Query("q") String query
    );

    @Headers({CACHE, AGENT, SECURITY})
    @GET("services/listNewsComment")
    Call<ResponseCommentList> getListComment(
            @Query("page") Integer page,
            @Query("count") Integer count,
            @Query("news_id") Long news_id
    );

    @Headers({CACHE, AGENT, SECURITY})
    @POST("services/addComment")
    Call<ResponseCommentAdd> addComment(
            @Body CommentBody commentBody
    );

    @Headers({CACHE, AGENT})
    @GET("services/getNewsDetails")
    Call<ResponseNewsDetails> getNewsDetails(
            @Query("id") Long id,
            @Query("view") int view
    );

    @Headers({CACHE, AGENT})
    @GET("services/listTopicName")
    Call<ResponseTopic> getListTopicName();

}
