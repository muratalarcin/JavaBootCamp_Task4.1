package com.muratalarcin.javabootcamptask41;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.javabootcamptask41.databinding.FragmentBBinding;

public class BFragment extends Fragment {
    FragmentBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater, container,false);

        binding.buttonYgidis2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_BFragment_to_YFragment);
        });

        return binding.getRoot();
    }
}