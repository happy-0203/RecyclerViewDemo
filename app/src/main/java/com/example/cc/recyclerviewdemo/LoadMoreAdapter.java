package com.example.cc.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cc on 2017/11/11.
 */

public class LoadMoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<GoodsBean.ContentBean> mDataList;
    //普通条目
    private final int TYPE_ITEM = 1;
    //FootView
    private final int TYPE_FOOT = 2;

    //当前加载状态,默认加载完成
    private int mCurrentLoadState = 2;

    //正在加载中
    public static final int LOADING = 1;
    //加载完成
    public static final int LOAD_FINISH = 2;
    //加载到底
    public static final int LOAD_END = 3;

    //加载错误
    public static final int LOAD_ERROR = 4;

    public LoadMoreAdapter(List<GoodsBean.ContentBean> dataList) {
        this.mDataList = dataList;
    }

    @Override
    public int getItemViewType(int position) {
        //最后一个item设置为FootView
        if (position + 1 == getItemCount()) {
            return TYPE_FOOT;
        } else {
            return TYPE_ITEM;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_ITEM) {
            //正常条目
            View normalView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_normal, parent, false);
            RecyclerViewHolder holder = new RecyclerViewHolder(normalView);
            return holder;
        } else if (viewType == TYPE_FOOT) {
            //上拉加载更多
            View loadView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_loadmore_view, parent, false);
            FootViewHolder footViewHolder = new FootViewHolder(loadView);
            return footViewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RecyclerViewHolder) {
            GoodsBean.ContentBean contentBean = mDataList.get(position);
            ((RecyclerViewHolder) holder).mNormalText.setText(contentBean.getName());
        } else if (holder instanceof FootViewHolder) {
            FootViewHolder footViewHolder = (FootViewHolder) holder;

            footViewHolder.mLlError.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //点击重试
                    if (mOnReloadClickListener != null) {
                        mOnReloadClickListener.onReloadClick();
                    }
                }
            });

            switch (mCurrentLoadState) {
                case LOADING:
                    //加载中
                    footViewHolder.mProgressBar.setVisibility(View.VISIBLE);
                    footViewHolder.mTvLoading.setVisibility(View.VISIBLE);
                    footViewHolder.mLlEnd.setVisibility(View.GONE);
                    footViewHolder.mLlError.setVisibility(View.GONE);
                    break;
                case LOAD_FINISH:
                    //加载完成
                    footViewHolder.mProgressBar.setVisibility(View.GONE);
                    footViewHolder.mTvLoading.setVisibility(View.GONE);
                    footViewHolder.mLlEnd.setVisibility(View.GONE);
                    footViewHolder.mLlError.setVisibility(View.GONE);
                    break;
                case LOAD_END:
                    //加载到底
                    footViewHolder.mProgressBar.setVisibility(View.GONE);
                    footViewHolder.mTvLoading.setVisibility(View.GONE);
                    footViewHolder.mLlEnd.setVisibility(View.VISIBLE);
                    footViewHolder.mLlError.setVisibility(View.GONE);
                    break;
                case LOAD_ERROR:
                    //加载错误
                    footViewHolder.mProgressBar.setVisibility(View.GONE);
                    footViewHolder.mTvLoading.setVisibility(View.GONE);
                    footViewHolder.mLlEnd.setVisibility(View.GONE);
                    footViewHolder.mLlError.setVisibility(View.VISIBLE);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return mDataList != null ? mDataList.size() + 1 : 0;
    }


    //正常条目的ViewHolder
    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView mNormalText;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mNormalText = (TextView) itemView.findViewById(R.id.text);
        }
    }

    class FootViewHolder extends RecyclerView.ViewHolder {

        ProgressBar mProgressBar;
        TextView mTvLoading;
        LinearLayout mLlEnd;
        LinearLayout mLlError;

        public FootViewHolder(View itemView) {
            super(itemView);
            mProgressBar = (ProgressBar) itemView.findViewById(R.id.pb_loading);
            mTvLoading = (TextView) itemView.findViewById(R.id.tv_loading);
            mLlEnd = (LinearLayout) itemView.findViewById(R.id.ll_end);
            mLlError = (LinearLayout) itemView.findViewById(R.id.ll_error);

        }
    }


    public void setCurrentLoadState(int loadState) {
        this.mCurrentLoadState = loadState;
        notifyDataSetChanged();
    }


    public void setData(List<GoodsBean.ContentBean> dataList) {
        if (mDataList != null) {
            mDataList.clear();
            mDataList.addAll(dataList);
            notifyDataSetChanged();
        }
    }

    public void addData(List<GoodsBean.ContentBean> dataList) {
        if (mDataList != null) {
            mDataList.addAll(dataList);
            notifyDataSetChanged();
        }

    }


    private OnReloadClickListener mOnReloadClickListener;

    public interface OnReloadClickListener {
        void onReloadClick();
    }


    public void setonReloadClickListener(OnReloadClickListener onReloadClickListener) {
        this.mOnReloadClickListener = onReloadClickListener;
    }


}
