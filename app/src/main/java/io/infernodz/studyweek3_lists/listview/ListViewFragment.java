package io.infernodz.studyweek3_lists.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.infernodz.studyweek3_lists.R;
import io.infernodz.studyweek3_lists.entity.Rating;
import io.infernodz.studyweek3_lists.listview.CustomArrayAdapter;


public class ListViewFragment extends Fragment {

    private ListView listView;
    private CustomArrayAdapter adapter;
    private List<Rating> dataSet;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataSet();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        listView = (ListView) rootView.findViewById(R.id.listView);

        adapter = new CustomArrayAdapter(getActivity(), dataSet);
        listView.setAdapter(adapter);
        return rootView;
    }

    private void initDataSet() {
        dataSet = new ArrayList<>();
        dataSet.add(new Rating(2.5, "Toyota"));
        dataSet.add(new Rating(4.6, "Lada"));
        dataSet.add(new Rating(3.2, "BMW"));
        dataSet.add(new Rating(2.9, "Mercedes"));
        dataSet.add(new Rating(4.3, "UAZ"));
        dataSet.add(new Rating(4.8, "Daewoo"));
        dataSet.add(new Rating(1.6, "Porshe"));
        dataSet.add(new Rating(3.2, "Schkoda"));
        dataSet.add(new Rating(2.4, "Nissan"));
        dataSet.add(new Rating(3.5, "Crysler"));
        dataSet.add(new Rating(4.5, "Ford"));
        dataSet.add(new Rating(2.8, "Mazda"));
        dataSet.add(new Rating(3.1, "Opel"));
        dataSet.add(new Rating(3.2, "Jeep"));
        dataSet.add(new Rating(2.7, "Kio"));
    }
}
