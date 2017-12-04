package com.ui.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ui.R;
import com.ui.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainView {

    /**
     * ui
     */
    @BindView(R.id.toolBar)
    Toolbar mNavTop;
    @BindView(R.id.group_nav_wrapper)
    RadioGroup mNavBottom;
    @BindView(R.id.frame_content)
    FrameLayout mFrameContent;

    protected Context mContext;
    //presenter
    MainPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        initNavigationTop();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter createPresenter() {
        return mPresenter = new MainPresenter();
    }


    @Override
    protected void doNetRequest() {

    }


    private void initNavigationTop() {
        mNavTop.setTitle("");
        setSupportActionBar(mNavTop);
        mNavTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "menu", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void setListener() {
        mNavBottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_home:
                        break;
                    case R.id.radio_contact:
                        break;
                    case R.id.radio_find:
                        break;
                    case R.id.radio_mine:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.alert:
                Toast.makeText(this, "alert", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
