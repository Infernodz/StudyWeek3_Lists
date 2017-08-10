package io.infernodz.studyweek3_lists.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.infernodz.studyweek3_lists.R;
import io.infernodz.studyweek3_lists.recyclerview.RecyclerViewCustomAdapter;


public class RecyclerViewFragment extends Fragment {

    private static final int SPAN_COUNT = 2;
    private static final int NUM_ROW = 20;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerViewCustomAdapter adapter;
    private List<String> dataSet;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataSet();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(getActivity(), SPAN_COUNT);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewCustomAdapter(dataSet);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    private void initDataSet() {
        dataSet = new ArrayList<>();
        for (int i = 0; i < NUM_ROW; i++) {
            dataSet.add("Item " + (i + 1));
        }
    }
}
