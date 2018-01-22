package com.admiralfivetigers.fiveghost.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
* 账号安全
*    手机号
*    修改密码
* */
public class AccountSecurityActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;
    @BindView(R.id.rl_phonenumber_account)
    RelativeLayout rlPhonenumberAccount;
    @BindView(R.id.rl_passworld_account)
    RelativeLayout rlPassworldAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_security);
        ButterKnife.bind(this);
        tvTitleAll.setText("账号安全");
        ivMessageAll.setVisibility(View.GONE);
    }
}
