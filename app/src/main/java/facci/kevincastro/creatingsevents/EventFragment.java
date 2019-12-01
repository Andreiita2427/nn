package facci.kevincastro.creatingsevents;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    View vista;
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Party in Discotec Madera Fina","Avenidazo","Concierto de Juanes","Cine en la Playa del Murcielago",
    "Feria de Manta 2019", "Congreso CITIC", "Congreso CITIC", "Congreso CITIC", "Congreso CITIC", "Congreso CITIC"};

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event,container,false);
        lv = (ListView) view.findViewById(R.id.id_list_view);

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        return view;


    }
}
