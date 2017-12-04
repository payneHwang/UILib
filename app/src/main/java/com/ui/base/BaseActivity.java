package com.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.ui.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * activity的基类
 * Created by lu_hang on 2017/10/31.
 */

public abstract class BaseActivity<V extends BaseIView, T extends BasePresenter<V>> extends AppCompatActivity {

    public T mPresenter;
    @BindView(R.id.frame_content)
    protected FrameLayout mFrameContent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mPresenter = createPresenter();//创建Presenter
        mPresenter.attachView((V) this);
        setContentView(getLayoutResId());
        super.onCreate(savedInstanceState);
    }

    protected abstract int getLayoutResId();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
//        initStatusRoot();
        doNetRequest();
        setListener();
    }

    /**
     * 初始化状态转换的Layout
     */
//    protected abstract void initStatusRoot();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
        mPresenter.onDestroy();
    }

    @Override
    protected void onPause() {
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        super.onPause();
    }


    /**
     * 创建关联的presenter
     *
     * @return
     */
    protected abstract T createPresenter();

    /**
     * 初始化数据
     */
    protected abstract void doNetRequest();

    /**
     * 初始化监听器
     */
    protected abstract void setListener();


}
