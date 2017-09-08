package mumbaivisit.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentLocalTrainRoute extends Fragment {

    @BindView(R.id.route_image)
    ImageView routeImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_local_train_route, container, false);
        ButterKnife.bind(this, view);
        routeImage.setOnTouchListener(new Touch());
        return view;
    }
}
