package com.admiralfivetigers.fiveghost.ui.activity.settings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HelpCenterActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;
    @BindView(R.id.rl_about_help)
    RelativeLayout rlAboutHelp;
    @BindView(R.id.rl_xxx_help)
    RelativeLayout rlXxxHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_center);
        ButterKnife.bind(this);
        ivMessageAll.setVisibility(View.GONE);
        tvTitleAll.setText("帮助中心");
    }
}
