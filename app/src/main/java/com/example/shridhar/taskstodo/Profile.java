package com.example.shridhar.taskstodo;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by shridhar on 28/1/18.
 */

public class Profile extends Fragment
{
    SharedPreferences sp;
    SharedPreferences.Editor Ed;
    EditText name,mail;

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.profile,container,false);
        return myView;
    }


    @Override
    public void onStart()
    {
        super.onStart();

        getActivity().setTitle(R.string.profile);

        //Intitalising various buttons, sharedpreference objects etc.
        sp = this.getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
        Ed = sp.edit();
        Button btn = (Button) getActivity().findViewById(R.id.btn_login);
        name = myView.findViewById(R.id.input_name);
        mail = myView.findViewById(R.id.input_mail);
        String username,email;

        //Load previously stored data
        SharedPreferences sp1 = this.getActivity().getSharedPreferences("login",Context.MODE_PRIVATE);
        username = sp1.getString("username",null);
        email = sp1.getString("email",null);

        name.setText(username);
        mail.setText(email);



        //On clicking done in user details
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String username,email;
                username = name.getText().toString();
                email = mail.getText().toString();

                Ed.putString("username",username);
                Ed.putString("email",email);
                Ed.commit();

                Toast.makeText(getActivity(), "Saved user data", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
