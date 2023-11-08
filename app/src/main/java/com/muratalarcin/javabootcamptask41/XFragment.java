package com.muratalarcin.javabootcamptask41;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.javabootcamptask41.databinding.FragmentXBinding;

public class XFragment extends Fragment {
    FragmentXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentXBinding.inflate(inflater, container,false);

        binding.buttonYgidis.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_XFragment_to_YFragment);
        });

        return binding.getRoot();
    }
}