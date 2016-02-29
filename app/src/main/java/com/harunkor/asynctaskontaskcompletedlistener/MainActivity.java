package com.harunkor.asynctaskontaskcompletedlistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import common.asynTask;
import common.onTaskCompleted;

public class MainActivity extends AppCompatActivity {

    public TextView txt;
    public static String incoming;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       txt=(TextView)findViewById(R.id.mytext);



        asynTask   task = new asynTask(new onTaskCompleted() {
            @Override
            public void onTaskCompleted() {

               txt.setText(incoming);
            }
        });

        task.execute();

       // txt.setText(incoming);



    }
}
