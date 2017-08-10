package io.infernodz.studyweek3_lists.listview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import io.infernodz.studyweek3_lists.R;
import io.infernodz.studyweek3_lists.entity.Rating;

public class CustomArrayAdapter extends ArrayAdapter<Rating> {

    public CustomArrayAdapter(Context context, List<Rating> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Rating rating = getItem(position);

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.getTextRating().setText(String.valueOf(rating.getRating()));
        viewHolder.getTextName().setText(rating.getName());

        return convertView;
    }

    public static class ViewHolder {

        private TextView textRating;
        private TextView textName;

        public ViewHolder(View view) {
            textRating = (TextView) view.findViewById(R.id.tvRating);
            textName = (TextView) view.findViewById(R.id.tvName);
        }

        public TextView getTextRating() {
            return textRating;
        }

        public TextView getTextName() {
            return textName;
        }
    }
}
