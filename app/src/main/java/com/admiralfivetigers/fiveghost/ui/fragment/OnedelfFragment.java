package com.admiralfivetigers.fiveghost.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;
import com.admiralfivetigers.fiveghost.ui.activity.HelpCenterActivity;
import com.admiralfivetigers.fiveghost.ui.activity.SettingsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 韩学文 on 2018/1/11.
 * 愿我余生从心所欲任性妄为
 * 宁愿做灯红酒绿中张牙舞爪的鬼
 * 也不做平淡生活里委曲求全的谁
 */
/*
* 个人中心
*      收藏路线
*      我的关注
*      常用旅客
*      浏览记录
*      分享APP
*      设置——SettingsActivity
*      帮助中心——HelpCenterActivity
* */
public class OnedelfFragment extends Fragment implements View.OnClickListener {
    //收藏路线
    @BindView(R.id.rl_collectionroute_oneself)
    RelativeLayout rlCollectionrouteOneself;
    //我的关注
    @BindView(R.id.rl_myconcern_oneself)
    RelativeLayout rlMyconcernOneself;
    //常用旅客
    @BindView(R.id.rl_commonlyusedpassenger_oneself)
    RelativeLayout rlCommonlyusedpassengerOneself;
    //浏览记录
    @BindView(R.id.rl_browserecord_oneself)
    RelativeLayout rlBrowserecordOneself;
    //分享APP
    @BindView(R.id.rl_shareapp_oneself)
    RelativeLayout rlShareappOneself;
    //设置
    @BindView(R.id.rl_settings_oneself)
    RelativeLayout rlSettingsOneself;
    //帮助中心
    @BindView(R.id.rl_helpcenter_oneself)
    RelativeLayout rlHelpcenterOneself;
    Unbinder unbinder;
    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onedelf, container, false);
        unbinder = ButterKnife.bind(this, view);
        tvTitleAll.setText("个人中心");
       /*
       * 测试
       * */
        ivMessageAll.setVisibility(View.GONE);
        rlSettingsOneself.setOnClickListener(this);
        rlHelpcenterOneself.setOnClickListener(this);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //收藏路线
            case R.id.rl_collectionroute_oneself:
                break;
            //我的关注
            case R.id.rl_myconcern_oneself:
                break;
            //常用旅客
            case R.id.rl_commonlyusedpassenger_oneself:
                break;
            //浏览记录
            case R.id.rl_browserecord_oneself:
                break;
            //分享APP
            case R.id.rl_shareapp_oneself:
                break;
            //设置
            case R.id.rl_settings_oneself:
                startActivity(new Intent(getContext(), SettingsActivity.class));
                break;
            //帮助中心
            case R.id.rl_helpcenter_oneself:
                startActivity(new Intent(getContext(), HelpCenterActivity.class));
                break;
        }
    }
}
