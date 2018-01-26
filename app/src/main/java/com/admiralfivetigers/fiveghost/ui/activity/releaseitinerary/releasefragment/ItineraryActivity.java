package com.admiralfivetigers.fiveghost.ui.activity.releaseitinerary.releasefragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.admiralfivetigers.fiveghost.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
*    一站式和分站式
* */
public class ItineraryActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_all)
    ImageView ivBackAll;
    @BindView(R.id.tv_title_all)
    TextView tvTitleAll;
    @BindView(R.id.iv_message_all)
    ImageView ivMessageAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);
        ButterKnife.bind(this);
        ivMessageAll.setVisibility(View.GONE);
        int tag = getIntent().getIntExtra("tag", 0);
        switch (tag) {
            case 1:
                tvTitleAll.setText("一站式行程");
                break;
            case 2:
                tvTitleAll.setText("分站式行程");
                break;
        }

    }
}
