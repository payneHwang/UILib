package com.ui.ui.find;

import android.content.Context;

import com.ui.R;
import com.ui.base.BaseFragment;
import com.ui.ui.home.HomePresenter;

/**
 */
public class FindFragment extends BaseFragment<HomePresenter> {
    private HomePresenter mHomePresenter;


    public FindFragment() {
    }

    public static FindFragment newInstance() {
        FindFragment fragment = new FindFragment();
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
