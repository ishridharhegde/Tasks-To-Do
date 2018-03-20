package com.example.shridhar.taskstodo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shridhar on 28/1/18.
 */

public class Tasks extends Fragment
{


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.tasks,container,false);
        return myView;
    }


     @Override
    public void onStart()
     {
        super.onStart();
         getActivity().setTitle(R.string.task);



     }

    

}
