package com.example.autoservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class ShopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_shop, container, false);

        View.OnClickListener buyListener = view ->
                Toast.makeText(getContext(), "Товар добавлен в корзину!", Toast.LENGTH_SHORT).show();

        v.findViewById(R.id.btnBuy1).setOnClickListener(buyListener);
        v.findViewById(R.id.btnBuy2).setOnClickListener(buyListener);

        return v;
    }
}