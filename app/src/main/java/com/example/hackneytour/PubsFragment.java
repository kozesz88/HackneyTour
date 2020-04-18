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
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class PubsFragment extends Fragment {

    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of information
        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information(R.string.pub_name_OsloHackney, R.string.pub_address_OsloHackney, R.string.pub_openingTime_OsloHackney));
        info.add(new Information(R.string.pub_name_TheCockTavern, R.string.pub_address_TheCockTavern, R.string.pub_openingTime_TheCockTavern));
        info.add(new Information(R.string.pub_name_PubOnThePark, R.string.pub_address_PubOnThePark, R.string.pub_openingTime_PubOnThePark));
        info.add(new Information(R.string.pub_name_ThePemburyTavern, R.string.pub_address_ThePemburyTavern, R.string.pub_openingTime_ThePemburyTavern));
        info.add(new Information(R.string.pub_name_TheThreeCompasses, R.string.pub_address_TheThreeCompasses, R.string.pub_openingTime_TheThreeCompasses));
        info.add(new Information(R.string.pub_name_TheStarbyHackneyDowns, R.string.pub_address_TheStarbyHackneyDowns, R.string.pub_openingTime_TheStarbyHackneyDowns));

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


