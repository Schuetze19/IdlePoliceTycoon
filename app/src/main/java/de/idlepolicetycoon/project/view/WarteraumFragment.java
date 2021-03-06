package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dennis.idlepolicetycoon.R;


public class WarteraumFragment extends Fragment {

    public static final String patientenAnzahlKey = "patientenanz";
    private int patientenAnzahl;

    public WarteraumFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_warteraum, container, false);
        if (savedInstanceState != null) {
            patientenAnzahl = savedInstanceState.getInt(patientenAnzahlKey);
        }
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        if(args != null){
            // Mach was, mit den Argumenten die man bekommt.
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(patientenAnzahlKey,patientenAnzahl);
    }
}
