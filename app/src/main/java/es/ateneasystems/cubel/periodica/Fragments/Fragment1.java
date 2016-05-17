package es.ateneasystems.cubel.periodica.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import es.ateneasystems.cubel.periodica.MainActivity;
import es.ateneasystems.cubel.periodica.R;

/**
 * Created by cubel on 17/05/16.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_starred, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Inbox");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentStarred);

        final TextView textViewStarredFragment = (TextView) view.findViewById(R.id.textViewStarredFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewStarredFragment.setTextSize(40);
                textViewStarredFragment.setText("This is the Starred Fragment");
                textViewStarredFragment.setTextColor(getResources().getColor(R.color.md_green_800));

            }
        });

        return view;
    }

}