package com.example.cc.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OkhttpUtils.IJsonSting, LoadMoreAdapter.OnReloadClickListener {

    private RecyclerView mRecyclerView;

    private LoadMoreAdapter mLoadMoreAdapter;

    private List<GoodsBean.ContentBean> mDataLists = new ArrayList<>();

    /**
     * 加载更多时用到(页)
     */
    private int mPage = 0;
    /***
     * 默认展示16条(首页-菜品列表)
     */
    public static final int mDefaultShowCount = 16;
    private Gson mGson;
    private GoodsBean mGoodsBean;
    private List<String> filterFlag = new ArrayList<>();
    private int mTotalElements;
    private boolean isLoadFinish = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        init();

        //https://bolemart.21chinamall.com/api/categories/1012,1014/goods/?lg=id_ID&condition=&page=0&size=16&sort=price,asc
    }

    private void init() {

        mGson = new Gson();


        mLoadMoreAdapter = new LoadMoreAdapter(mDataLists);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mLoadMoreAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        initData();

        mRecyclerView.addOnScrollListener(new RecyclerViewOnScrollListener() {
            @Override
            public void onLoadMore() {
                mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOADING);
                if (mDataLists.size() < mTotalElements ){
                    if (isLoadFinish){
                        isLoadFinish = false;
                        initData();
                    }

                }else {
                    Log.d("MainActivity", "onLoadMore: "+mDataLists.size());
                    mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOAD_END);
                }
            }
        });

        mLoadMoreAdapter.setonReloadClickListener(this);

    }


    private void initData() {
        getCategoryData("price,asc", mPage, mDefaultShowCount, filterFlag, this);

    }


    public void getCategoryData(String sortId, int page, int size, List<String> filterFlag, OkhttpUtils.IJsonSting callback) {
        String condition = "";
        //编码只编码参数，不能编码等号
        if (filterFlag.size() > 0) {
            condition = filterFlag.get(0);
            try {
                JSONObject jobj = new JSONObject(condition);
                condition = jobj.toString();
                condition = URLEncoder.encode(jobj.toString(), "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String flag = "condition=" + condition + "&page=" + page + "&" + "size=" + size + "&sort=" + sortId;
        flag = "?lg=id_ID" + "&" + flag;
        String url = "https://bolemart.21chinamall.com/api/categories/" + "1012,1014/goods/" + flag;
        OkhttpUtils.getInstance().asynJsonStringByGet(url, callback);
    }

    @Override
    public void onResponeSuccess(String result) {
        isLoadFinish = true;
        mPage++;
        mGoodsBean = mGson.fromJson(result, GoodsBean.class);
        mTotalElements = mGoodsBean.getTotalElements();
        if (mDataLists.size() == 0){
            mLoadMoreAdapter.setData(mGoodsBean.getContent());
        }else {
            mLoadMoreAdapter.addData(mGoodsBean.getContent());
        }
        mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOAD_FINISH);

    }

    @Override
    public void onExceptionRespone(String result) {
        mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOAD_ERROR);
    }

    @Override
    public void onResponeFail(String result) {
        mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOAD_ERROR);
    }
    //点击重试
    @Override
    public void onReloadClick() {
        mLoadMoreAdapter.setCurrentLoadState(LoadMoreAdapter.LOADING);
        initData();
    }
}
