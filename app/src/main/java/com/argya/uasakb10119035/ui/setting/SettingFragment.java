/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 * */

package com.argya.uasakb10119035.ui.setting;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.argya.uasakb10119035.MainActivity;
import com.argya.uasakb10119035.R;
import com.argya.uasakb10119035.ui.auth.LoginActivity;
import com.argya.uasakb10119035.ui.auth.RegisterActivity;
import com.google.firebase.auth.FirebaseAuth;

public class SettingFragment extends Fragment {
    FirebaseAuth auth;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        auth = FirebaseAuth.getInstance();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        Button logoutBtn = view.findViewById(R.id.logout_button);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}