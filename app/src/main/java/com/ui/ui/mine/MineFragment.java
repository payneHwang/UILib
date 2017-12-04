package com.ui.ui.mine;

import android.content.Context;

import com.ui.R;
import com.ui.base.BaseFragment;

/**
 */
public class MineFragment extends BaseFragment<MinePresenter> {
    private MinePresenter mHomePresenter;


    public MineFragment() {
    }

    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }


    @Override
    protected MinePresenter createPresenter() {
        return mHomePresenter = new MinePresenter();
    }

    @Override
    protected int setLayoutResourceId() {
        return R.layout.fragment_home;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
