package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import java.util.logging.Logger;

import de.idlepolicetycoon.project.controller.FragmentController;

public class KrankenwagenUpgradeFragment extends Fragment {

    private Button btn_close;
    private FragmentController fragmentController = new FragmentController();
    private KrankenwagenUpgradeFragment krankenwagenUpgradeFragment;

    public KrankenwagenUpgradeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_krankenwagen_upgrade, container, false);

        krankenwagenUpgradeFragment = this;

        btn_close = (Button) view.findViewById(R.id.btn_close);

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentController.closeFragment(krankenwagenUpgradeFragment);
            }
        });
        return view;
    }
}
