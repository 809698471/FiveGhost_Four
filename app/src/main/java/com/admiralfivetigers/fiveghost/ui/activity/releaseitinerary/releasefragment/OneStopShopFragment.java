package com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary.releasefragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.admiralfivetigers.fiveghost.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 韩学文 on 2018/1/26.
 * 愿我余生从心所欲任性妄为
 * 宁愿做灯红酒绿中张牙舞爪的鬼
 * 也不做平淡生活里委曲求全的谁
 */
/*
*   一站式发布
* */
public class OneStopShopFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.btn_bonestopshop)
    Button btnBonestopshop;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onestopshop, container, false);
        unbinder = ButterKnife.bind(this, view);
        btnBonestopshop.setOnClickListener(this);
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
            case R.id.btn_bonestopshop:
                Intent intent = new Intent(getContext(), ItineraryActivity.class);
                intent.putExtra("tag", 1);
                startActivity(intent);
                break;
        }
    }
}
