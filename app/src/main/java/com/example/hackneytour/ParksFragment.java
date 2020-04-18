package com.example.hackneytour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * <p>
 * create an instance of this fragment.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of information
        final ArrayList<Information> info = new ArrayList<>();
        info.add(new Information(R.string.park_name_AbneyParkCemeteryTrust, R.string.park_address_AbneyParkCemeteryTrust, R.string.park_openingTime_AbneyParkCemeteryTrust, R.mipmap.abney_park_foreground));
        info.add(new Information(R.string.park_name_HackneyDowns, R.string.park_address_HackneyDowns, R.string.park_openingTime_HackneyDowns, R.mipmap.hackney_downs_foreground));
        info.add(new Information(R.string.park_name_LondonFields, R.string.park_address_LondonFields, R.string.park_openingTime_LondonFields, R.mipmap.london_fields_foreground));
        info.add(new Information(R.string.park_name_ClissoldPark, R.string.park_address_ClissoldPark, R.string.park_openingTime_ClissoldPark, R.mipmap.clissold_park_foreground));
        info.add(new Information(R.string.park_name_VictoriaPark, R.string.park_address_VictoriaPark, R.string.park_openingTime_VictoriaPark, R.mipmap.victoria_park_foreground));

        // Create an {@link InformationAdapter}, whose data source is a list of {@link Information}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InformationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Information} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}


