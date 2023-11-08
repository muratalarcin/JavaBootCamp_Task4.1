package com.muratalarcin.javabootcamptask41;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.javabootcamptask41.databinding.FragmentABinding;

public class AFragment extends Fragment {
    FragmentABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater, container, false);

        binding.buttonBgidis.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment);
        });

        return binding.getRoot();
    }
}