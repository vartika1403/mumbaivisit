package mumbaivisit.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class FragmentPlacesList extends Fragment {
    private static final String LOG_TAG = FragmentPlacesList.class.getSimpleName();
    
    @BindView(R.id.places_list)
    RecyclerView placesListRecyclerView;
    
    private ArrayList<String> placesArrayList;
    private PlacesAdapter placeAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_places_list, container, false);
        ButterKnife.bind(this, view);
        addItemsToArrayList();
        placeAdapter = new PlacesAdapter(placesArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        placesListRecyclerView.setLayoutManager(layoutManager);
        placesListRecyclerView.setItemAnimator(new DefaultItemAnimator());
        placesListRecyclerView.setAdapter(placeAdapter);
        return view;
    }

    private void addItemsToArrayList() {
        placesArrayList = new ArrayList<String>();
        placesArrayList.add("GATEWAY OF INDIA");
        placesArrayList.add("ELEPHANTA CAVES");
        placesArrayList.add("COLABA CAUSEWAY MARKET");
        placesArrayList.add("JUHU BEACH");
        placesArrayList.add("VICTORIA TERMINUS");
        placesArrayList.add("FILM CITY");
        placesArrayList.add("HAJI ALI");
        placesArrayList.add("MARINE DRIVE");
        placesArrayList.add("SIDDHIVINAYAKA TEMPLE");
        placesArrayList.add("ESSEL WORLD");
        placesArrayList.add("CHOR BAZAAR");
        placesArrayList.add("AKSHA BEACH");
        placesArrayList.add("POWAI LAKE");
        placesArrayList.add("WORLI SEAFACE");

    }
}
