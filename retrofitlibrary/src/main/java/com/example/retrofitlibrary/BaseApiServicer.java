package com.example.retrofitlibrary;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/26 19:58
 * 邮箱：17600157003@163.com
 */

public interface BaseApiServicer<T> {

    /**
     * 普通写法
     */

    @GET("{url}")

    Observable<ResponseBody> getdata(
            @Path("url") String url
    );

    @POST("{url}")
    Observable<ResponseBody> postdata(
            @Path("url") String url
    );

    @GET("{url}")
    Observable<ResponseBody> getshopping(
            @Path("url") String url
    );



    @GET("{url}")
    Observable<ResponseBody> executeGet(
            @Path("url") String url,
            @QueryMap Map<String, String> maps
    );


    @POST("{url}")
    Observable<BaseResponse<Object>> executePost(
            @Path("url") String url,
            //  @Header("") String authorization,
            @QueryMap Map<String, String> maps);

    @POST("{url}")
    Observable<ResponseBody> executePost2(
            @Path("url") String url,
            //  @Header("") String authorization,
            @QueryMap Map<String, String> maps);
    @Headers({"Content-Type: application/json"})//需要添加头
    @POST("{url}")
    Observable<ResponseBody> executePostJson(
            @Path("url") String url,
            //  @Header("") String authorization,
            @Body RequestBody route);


    @POST("{url}")
    Observable<ResponseBody> json(
            @Path("url") String url,
            @Body RequestBody jsonStr);

    @Multipart
    @POST("{url}")
    Observable<ResponseBody> upLoadFile(
            @Path("url") String url,
            @Part("image\"; filename=\"image.jpg") RequestBody requestBody);

    @POST("{url}")
    Call<ResponseBody> uploadFiles(
            @Path("url") String url,
            @Path("headers") Map<String, String> headers,
            @Part("filename") String description,
            @PartMap() Map<String, RequestBody> maps);


}
