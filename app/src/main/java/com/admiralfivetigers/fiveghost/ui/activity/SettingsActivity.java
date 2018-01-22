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

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;
    //帐号安全
    @BindView(R.id.rl_accountsecurity_setting)
    RelativeLayout rlAccountsecuritySetting;
    //隐私设置
    @BindView(R.id.rl_privacysettings_setting)
    RelativeLayout rlPrivacysettingsSetting;
    //用户注册协议
    @BindView(R.id.rl_userregistrationprotocol_setting)
    RelativeLayout rlUserregistrationprotocolSetting;
    //清除缓存
    @BindView(R.id.rl_cleancache_setting)
    RelativeLayout rlCleancacheSetting;
    //意见建议
    @BindView(R.id.rl_recommendationrecommendations_setting)
    RelativeLayout rlRecommendationrecommendationsSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        ivMessageAll.setVisibility(View.GONE);
        tvTitleAll.setText("设置");
        rlAccountsecuritySetting.setOnClickListener(this);
        rlPrivacysettingsSetting.setOnClickListener(this);
        rlUserregistrationprotocolSetting.setOnClickListener(this);
        rlCleancacheSetting.setOnClickListener(this);
        rlRecommendationrecommendationsSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //帐号安全
            case R.id.rl_accountsecurity_setting:
                break;
            //隐私设置
            case R.id.rl_privacysettings_setting:
                break;
            //用户注册协议
            case R.id.rl_userregistrationprotocol_setting:
                break;
            //清理缓存
            case R.id.rl_cleancache_setting:
                break;
            //意见建议
            case R.id.rl_recommendationrecommendations_setting:
                break;
        }
    }
}
