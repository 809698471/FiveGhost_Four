package com.admiralfivetigers.fiveghost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary.ReleaseitineraryActivity;
import com.admiralfivetigers.fiveghost.ui.fragment.OnedelfFragment;
import com.admiralfivetigers.fiveghost.ui.fragment.OrderFragment;
import com.admiralfivetigers.fiveghost.ui.fragment.ShtickFragment;
import com.admiralfivetigers.fiveghost.ui.fragment.SuggestFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
*  主界面
* */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.main_img)
    ImageView mainImg;
    private FrameLayout framlayout;
    private RadioButton rb_main_01;
    private RadioButton rb_02;
    private RadioButton rb_03;
    private RadioButton rb_04;
    private RadioButton rb_05;

    private FragmentManager msg;
    private FragmentTransaction transaction;
    private ShtickFragment shtickFragment;
    private OrderFragment orderFragment;
    private OnedelfFragment onedelfFragment;
    private SuggestFragment suggestFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initData() {
        //动态添加Fragment ,获取Fragment 管理器
        msg = getSupportFragmentManager();
        //开启Fragment事物
        transaction = msg.beginTransaction();

        suggestFragment = new SuggestFragment();
        transaction.add(R.id.framlayout, suggestFragment);
        //方法2隐藏所有的Fragment。
//        hideAll(transaction);
        transaction.commit();
    }

    private void initView() {
        framlayout = (FrameLayout) findViewById(R.id.framlayout);
        rb_main_01 = (RadioButton) findViewById(R.id.rb_main_01);
        rb_02 = (RadioButton) findViewById(R.id.rb_02);
        rb_03 = (RadioButton) findViewById(R.id.rb_03);
        rb_04 = (RadioButton) findViewById(R.id.rb_04);
        rb_05 = (RadioButton) findViewById(R.id.rb_05);
//        //判断home_pager是否为null
        if (suggestFragment == null) {
            suggestFragment = new SuggestFragment();
//            //设置首页默认被选中
            rb_main_01.setChecked(true);
        }

        rb_main_01.setOnClickListener(this);
        rb_02.setOnClickListener(this);
        rb_03.setOnClickListener(this);
        rb_04.setOnClickListener(this);
        rb_05.setOnClickListener(this);
        mainImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReleaseitineraryActivity.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        //动态添加Fragment ,获取Fragment 管理器
        msg = getSupportFragmentManager();
        //开启Fragment事物
        transaction = msg.beginTransaction();
        //方法2隐藏所有的Fragment。
        hideAll(transaction);
        switch (v.getId()) {
            case R.id.rb_main_01:
                if (suggestFragment == null) {
                    suggestFragment = new SuggestFragment();
                    transaction.add(R.id.framlayout, this.suggestFragment);
                } else {
                    transaction.show(suggestFragment);
                }
                break;
            case R.id.rb_02:
                if (shtickFragment == null) {
                    shtickFragment = new ShtickFragment();
                    transaction.add(R.id.framlayout, shtickFragment);
                } else {
                    transaction.show(shtickFragment);
                }
                break;
            case R.id.rb_04:
                if (orderFragment == null) {
                    orderFragment = new OrderFragment();
                    transaction.add(R.id.framlayout, orderFragment);
                } else {
                    transaction.show(orderFragment);
                }
                break;
            case R.id.rb_05:
                if (onedelfFragment == null) {
                    onedelfFragment = new OnedelfFragment();
                    transaction.add(R.id.framlayout, onedelfFragment);
                } else {
                    transaction.show(onedelfFragment);
                }
                break;
        }
        transaction.commit();
    }

    private void hideAll(FragmentTransaction transaction) {
        if (suggestFragment != null) {
            transaction.hide(suggestFragment);
        }
        if (shtickFragment != null) {
            transaction.hide(shtickFragment);
        }

        if (orderFragment != null) {
            transaction.hide(orderFragment);
        }
        if (onedelfFragment != null) {
            transaction.hide(onedelfFragment);
        }
    }
}
