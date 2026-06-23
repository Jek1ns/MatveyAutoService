package com.example.autoservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class AppointmentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_appointment, container, false);
        Button btnSubmit = v.findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view -> {
            Toast.makeText(getContext(), "Вы успешно записаны! Менеджер свяжется с вами.", Toast.LENGTH_LONG).show();

        });
        return v;
    }
}