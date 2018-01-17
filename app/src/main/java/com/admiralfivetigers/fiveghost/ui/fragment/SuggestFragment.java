package com.admiralfivetigers.fiveghost.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.admiralfivetigers.fiveghost.R;
import com.admiralfivetigers.fiveghost.adapter.RvSuggestAdapter;
import com.jaeger.library.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;




/**
 * Created by 韩学文 on 2018/1/11.
 * 愿我余生从心所欲任性妄为
 * 宁愿做灯红酒绿中张牙舞爪的鬼
 * 也不做平淡生活里委曲求全的谁
 */
//推荐

@SuppressLint("ValidFragment")
public class SuggestFragment extends Fragment {

  private RecyclerView viewById;

//    public SuggestFragment(MainActivity mainActivity) {
//      this.context=mainActivity;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.suggest, container, false);
        StatusBarUtil.setTransparent(getActivity());
        viewById = view.findViewById(R.id.rv_suggest);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        viewById.setLayoutManager(manager);
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("for");
        List<String> stringList = new ArrayList<>();
        stringList.add("周边游");
        stringList.add("摄影游");
        stringList.add("摄影游");
        stringList.add("摄影游");
        stringList.add("摄影游");
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("线路一");
        stringList1.add("线路二");
        stringList1.add("线路三");
        stringList1.add("线路四");
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("导游A");
        stringList2.add("导游B");
        stringList2.add("导游C");
        stringList2.add("导游D");
        RvSuggestAdapter adapter = new RvSuggestAdapter(getActivity(), strings, stringList, stringList1, stringList2);
        viewById.setAdapter(adapter);
        return view;
    }
}
