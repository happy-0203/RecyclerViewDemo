package com.example.cc.recyclerviewdemo;

import android.os.Handler;
import android.os.Looper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/5/26.
 */

public class OkhttpUtils {
    private OkHttpClient mOkHttpClient;
    private Handler mHandler;
    private static OkhttpUtils mOkhttpUtils;

    //提交JSON数据
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    //提交字符串
    private static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("text/x-markdown;charset=utf-8");

    //提交图片的参数类型
    private static final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");


    private OkhttpUtils() {
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        mHandler = new Handler(Looper.getMainLooper());
    }

    /**
     * 单例模式获取工具类对象
     *
     * @return
     */
    public static OkhttpUtils getInstance() {
        if (mOkhttpUtils == null) {
            synchronized (OkhttpUtils.class) {
                if (mOkhttpUtils == null) {
                    mOkhttpUtils = new OkhttpUtils();
                }
            }
        }
        return mOkhttpUtils;
    }

    /**
     * 异步get请求
     *
     * @param url
     * @param callback
     */
    public void asynJsonStringByGet(String url, final IJsonSting callback) {

        //获得登录后的token

        final Request request = new Request.Builder()
                .url(url)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });

    }

    /**
     * 向服务器提交json格式字符串
     *
     * @param url
     * @param jsonParams
     * @param callback
     */
    public void asynPostJson(String url, String jsonParams, final IJsonSting callback){
        RequestBody body = RequestBody.create(JSON, jsonParams);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });
    }




    /**
     * 向服务器提交json格式字符串,不带token
     *
     * @param url
     * @param jsonParams
     * @param callback
     */
    public void asynLoginJson(String url, String jsonParams, final IJsonSting callback) {
        RequestBody body = RequestBody.create(JSON, jsonParams);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });
    }


    /**
     * 向服务器提交json格式字符串
     *
     * @param url
     * @param jsonParams
     * @param callback
     */
    public void asynPutJson(String url, String jsonParams, final IJsonSting callback) {
        RequestBody body = RequestBody.create(JSON, jsonParams);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });
    }


    /**
     * 向服务器提交json格式字符串
     *
     * @param url
     * @param jsonParams
     * @param callback
     */
    public void asynDeleteJson(String url, String jsonParams, final IJsonSting callback) {

        RequestBody body = RequestBody.create(JSON, jsonParams);
        Request request = new Request.Builder()
                .url(url)
                .delete(body)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });
    }


    /**
     * 上传图片
     *
     * @param localPath
     * @param callback
     */
    public void asynUpLoadImage(String localPath, String url, final IJsonSting callback) {
        MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        File file = new File(localPath);
        builder.addFormDataPart("file", file.getName(), RequestBody.create(MEDIA_TYPE_PNG, file));

        MultipartBody requestBody = builder.build();

        Request request = new Request.Builder()
                .url(url)//地址
                .post(requestBody)//添加请求体
                .build();

        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onFailExceptionMethod(e.getMessage(), callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (response != null && response.isSuccessful()) {
                    onSuccessJsonStringMethod(result, callback);
                } else {
                    onFailJsonStringMethod(result, callback);
                }
            }
        });
    }





    /**
     * 返回Json字符串
     *
     * @param jsonValue
     * @param callback
     */
    private void onSuccessJsonStringMethod(final String jsonValue, final IJsonSting callback) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    try {
                        callback.onResponeSuccess(jsonValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }

    /**
     * 返回Json字符串
     *
     * @param jsonValue
     * @param callback
     */
    private void onFailJsonStringMethod(final String jsonValue, final IJsonSting callback) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    try {
                        callback.onResponeFail(jsonValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }

    /**
     * 返回Json字符串
     *
     * @param jsonValue
     * @param callback
     */
    private void onFailExceptionMethod(final String jsonValue, final IJsonSting callback) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    try {
                        callback.onExceptionRespone(jsonValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }


    public interface IJsonSting {
        void onResponeSuccess(String result);

        void onExceptionRespone(String result);

        void onResponeFail(String result);
    }
}
