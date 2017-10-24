package mumbaivisit.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FragmentPlacesList extends Fragment {
    private static final String LOG_TAG = FragmentPlacesList.class.getSimpleName();
    private final String URL= "https://en.wikipedia.org/wiki";
    
    @BindView(R.id.places_list)
    RecyclerView placesListRecyclerView;
    @BindView(R.id.web_view_place)
    WebView webView;
    
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
        placeAdapter = new PlacesAdapter(this, placesArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        placesListRecyclerView.setLayoutManager(layoutManager);
        placesListRecyclerView.setItemAnimator(new DefaultItemAnimator());
        placesListRecyclerView.setAdapter(placeAdapter);
        return view;
    }

   // @OnClick(R.id.web_view_place)
   /* public void openWebPage(String placeName) {
         webView.setVisibility(View.VISIBLE);
         webView.loadUrl(URL + placeName);
    }
*/
    private void addItemsToArrayList() {
        placesArrayList = new ArrayList<String>();
        placesArrayList.add("Gateway_of_India");
        placesArrayList.add("Elephanta_Caves");
        placesArrayList.add("Colaba_Causeway");
        placesArrayList.add("Juhu");
        placesArrayList.add("Film_City");
        placesArrayList.add("Haji_Ali_Dargah");
        placesArrayList.add("Marine_Drive,_Mumbai");
        placesArrayList.add("Siddhivinayak_Temple,_Mumbai");
        placesArrayList.add("EsselWorld");
        placesArrayList.add("Chor_Bazaar");
        placesArrayList.add("Aksa_Beach");
        placesArrayList.add("Powai_Lake");
        placesArrayList.add("Bandra–Worli_Sea_Link");
    }
}
