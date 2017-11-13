package com.example.cc.recyclerviewdemo;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by cc on 2017/11/11.
 */

public abstract class RecyclerViewOnScrollListener extends RecyclerView.OnScrollListener {
    //是否正在向上滑动
    private boolean isUpLoading = false;

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);

        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

        if (newState == RecyclerView.SCROLL_STATE_IDLE){
            //当不滑动时
           // 获取最后一个完全显示的itemPosition
            int lastPosition = layoutManager.findLastCompletelyVisibleItemPosition();
            int itemCount = layoutManager.getItemCount();
            //判断是否滑动到了最后一个item，并且是向上滑动
            if(lastPosition == (itemCount -1) && isUpLoading){
                onLoadMore();
            }
        }

    }

    /**
     * 加载更多回调
     */
    public abstract void onLoadMore();

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        isUpLoading = dy > 0;
    }
}
