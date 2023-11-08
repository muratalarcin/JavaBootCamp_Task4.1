package com.muratalarcin.javabootcamptask41;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;
import com.muratalarcin.javabootcamptask41.databinding.FragmentYBinding;

public class YFragment extends Fragment {
    FragmentYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYBinding.inflate(inflater, container, false);

        NavController navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView);

        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textView6, "Anasayfaya Dönmek İstiyor Musunuz?", Snackbar.LENGTH_SHORT)
                        .setAction("Evet", view -> {
                            setEnabled(false);
                            navController.navigate(R.id.action_YFragment_to_anasayfaFragment);
                        }).show();
            }
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), geriTusu);

        return binding.getRoot();
    }
}