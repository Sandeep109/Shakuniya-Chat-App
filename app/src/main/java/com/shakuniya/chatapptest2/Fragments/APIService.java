package com.shakuniya.chatapptest2.Fragments;

import com.shakuniya.chatapptest2.Notifications.MyResponse;
import com.shakuniya.chatapptest2.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
        @Headers(
                {
                        "Content-Type:application/json",
                        "Authorization:key=AAAAy1QsH4g:APA91bHk9cJNj0It3pBY_yYX2DvMt5ELRpbTrtkzhGbf4h4M6OKBZFBtW0-wJYCb43GGfQ0f-Ylc1eNO63vQt28cNweDe_xNrRXSBcX9wttZe6WFi0APhXHwJb6QSHHTLcAkgbQBl2uW"
                }
        )
       @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
