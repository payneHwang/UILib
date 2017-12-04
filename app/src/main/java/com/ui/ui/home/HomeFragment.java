package com.ui.ui.home;

import android.content.Context;

import com.ui.R;
import com.ui.base.BaseFragment;

/**
 */
public class HomeFragment extends BaseFragment<HomePresenter> {
    private HomePresenter mHomePresenter;


    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Override
    protected HomePresenter createPresenter() {
        return mHomePresenter = new HomePresenter();
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
