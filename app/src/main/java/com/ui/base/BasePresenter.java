package com.ui.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * presenter的基类
 * Created by lu_hang on 2017/10/31.
 */

public abstract class BasePresenter<T extends BaseIView> {

    /**
     * View接口类型弱引用
     */
    protected Reference<T> mViewRef;

    /**
     * 关联view
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    /**
     * 获取当前的view
     *
     * @return
     */
    protected T getView() {
        return mViewRef.get();
    }

    /**
     * 是否关联
     *
     * @return
     */
    public boolean isViewAttached() {//判断是否与View建立了关联
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {//解除关联
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public abstract void onDestroy();

}