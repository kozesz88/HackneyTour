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
public class CafeFragment extends Fragment {

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of information
        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information(R.string.cafe_name_Warbler, R.string.cafe_address_Warbler, R.string.cafe_openingTime_Warbler));
        info.add(new Information(R.string.cafe_name_BlackCat, R.string.cafe_address_BlackCat, R.string.cafe_openingTime_BlackCat));
        info.add(new Information(R.string.cafe_name_PalmVaults, R.string.cafe_address_PalmVaults, R.string.cafe_openingTime_PalmVaults));
        info.add(new Information(R.string.cafe_name_BlackSheepCoffee, R.string.cafe_address_BlackSheepCoffee, R.string.cafe_openingTime_BlackSheepCoffee));
        info.add(new Information(R.string.cafe_name_Leles, R.string.cafe_address_Leles, R.string.cafe_openingTime_Leles));
        info.add(new Information(R.string.cafe_name_Coffee8, R.string.cafe_address_Coffee8, R.string.cafe_openingTime_Coffee8));
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


