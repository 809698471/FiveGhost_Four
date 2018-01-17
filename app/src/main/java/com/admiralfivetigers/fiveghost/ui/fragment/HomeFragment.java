package com.admiralfivetigers.fiveghost.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.admiralfivetigers.fiveghost.R;
import com.admiralfivetigers.fiveghost.adapter.RvSuggestAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * 首页
 */
public class HomeFragment extends Fragment {

    private SearchView search_view;
    private RecyclerView rv_suggest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.suggest, null);
        initView(view);

        return view;
    }

    private void initView(View view) {
        search_view = (SearchView) view.findViewById(R.id.search_view);
        rv_suggest = (RecyclerView) view.findViewById(R.id.rv_suggest);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rv_suggest.setLayoutManager(manager);
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
        rv_suggest.setAdapter(adapter);
    }
}
