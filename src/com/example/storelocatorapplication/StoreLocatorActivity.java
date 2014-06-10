package com.example.storelocatorapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;

/**
 * Created with IntelliJ IDEA.
 * Date: 5/4/14
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreLocatorActivity extends Activity {
    ProgressDialog mProgress;
    //http://api.remix.bestbuy.com/v1/stores(area(94103,10))?apiKey=xk5y3v8xgpnn79mgpq9xxzhr&format=json
    String urlPrefix = "http://api.remix.bestbuy.com/v1/stores(area(";
    String urlSuffix = "))?apiKey=xk5y3v8xgpnn79mgpq9xxzhr&format=json";
    String apiKey = "xk5y3v8xgpnn79mgpq9xxzhr";
    TableLayout table;
    String zip="";
    String dist="";
    EditText zipcode,distance;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    @Override
    protected void onStart(){
        super.onStart();
    }
}