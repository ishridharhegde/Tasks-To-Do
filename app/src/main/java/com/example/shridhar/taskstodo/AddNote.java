package com.example.shridhar.taskstodo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by shridhar on 28/1/18.
 */

public class AddNote extends Fragment
{
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.addnote,container,false);
        return myView;
    }


    @Override
    public void onStart()
    {
        super.onStart();

        getActivity().setTitle(R.string.addnewnote);



    }







}
