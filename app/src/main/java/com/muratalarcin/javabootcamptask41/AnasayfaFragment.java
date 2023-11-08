package com.muratalarcin.javabootcamptask41;

import android.nfc.NfcAntennaInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.javabootcamptask41.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonAgidis.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_anasayfaFragment_to_AFragment);
        });

        binding.buttonXgidis.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_anasayfaFragment_to_XFragment);
        });

        return binding.getRoot();
    }
}