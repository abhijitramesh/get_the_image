package com.example.get_the_image.api;

import com.example.get_the_image.MainActivity;
import com.squareup.okhttp.ResponseBody;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Url;

public interface RetrofitImageAPI{
    @GET
    Call<ResponseBody> getImageDetails(@Url String url);
}
