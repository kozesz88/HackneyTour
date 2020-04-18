package com.example.hackneytour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {
    //creating a new adapter
    public InformationAdapter(Context context, ArrayList<Information> information) {
        super(context, 0, information);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }


        Information currentInformation = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentInformation.getname());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentInformation.getaddress());

        TextView openingTimeTextView = listItemView.findViewById(R.id.openingTime_text_view);

        openingTimeTextView.setText(currentInformation.getopeningTime());

        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current object and
        // set the image to iconView
        if (currentInformation.hasImage()) {
            imageView.setImageResource(currentInformation.getImageResourceId());
            imageView.setVisibility((View.VISIBLE));
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}