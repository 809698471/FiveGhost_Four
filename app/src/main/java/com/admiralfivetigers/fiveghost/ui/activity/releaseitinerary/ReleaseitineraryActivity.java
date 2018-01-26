package com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;
import com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary.releasefragment.OneStopShopFragment;
import com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary.releasefragment.SubstationTypeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReleaseitineraryActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;
    @BindView(R.id.tl_release)
    TabLayout tlRelease;
    @BindView(R.id.vp_release)
    ViewPager vpRelease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_releaseitinerary);
        ButterKnife.bind(this);
        tvTitleAll.setText("发布行程");
        List<Fragment> fragments = new ArrayList<>();
        OneStopShopFragment oneStopShopFragment = new OneStopShopFragment();
        SubstationTypeFragment substationTypeFragment = new SubstationTypeFragment();
        fragments.add(oneStopShopFragment);
        fragments.add(substationTypeFragment);
        List<String> strings=new ArrayList<>();
        strings.add("一站式发布");
        strings.add("分站式发布");
        vpRelease.setAdapter(new ReleaseAdapter(getSupportFragmentManager(), fragments, strings));
        tlRelease.setupWithViewPager(vpRelease);
    }
}
