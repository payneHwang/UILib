package com.ui.ui.contact;

import android.content.Context;

import com.ui.R;
import com.ui.base.BaseFragment;
import com.ui.ui.home.HomePresenter;

/**
 */
public class ContactFragment extends BaseFragment<HomePresenter> {
    private HomePresenter mHomePresenter;


    public ContactFragment() {
    }

    public static ContactFragment newInstance() {
        ContactFragment fragment = new ContactFragment();
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
