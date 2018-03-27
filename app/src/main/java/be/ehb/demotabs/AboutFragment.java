package be.ehb.demotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {




    public AboutFragment() {
        // Required empty public constructor
    }
    //zelf aangemaakte factory/builder pattern
    public static AboutFragment newInstance(){
        AboutFragment mAboutFragment = new AboutFragment();
        //heel het fragment instellen en dan fragment returnen
        return mAboutFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //mijn xml
        View rootView = inflater.inflate(R.layout.fragment_about,container,false);

        Button btnToast = rootView.findViewById(R.id.btn_about_toast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Interactief fragment",Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }



}
