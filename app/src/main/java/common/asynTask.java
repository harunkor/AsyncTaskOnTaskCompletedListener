package common;

import android.os.AsyncTask;

import com.harunkor.asynctaskontaskcompletedlistener.MainActivity;

/**
 * Created by KorHarun on 29/02/16.
 */
public class asynTask extends AsyncTask<Void,Void,String> {

    private onTaskCompleted listener;
    public  String str;

    public asynTask(onTaskCompleted listener )
    {
        this.listener=listener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... params) {

        str="";
        for(int i =0;i<100;i++)
        {
            str=str+i;
        }



        return str;
    }


    @Override
    protected void onPostExecute(String pstr) {


        MainActivity.incoming=pstr;

        listener.onTaskCompleted();

        super.onPostExecute(pstr);
    }



}
