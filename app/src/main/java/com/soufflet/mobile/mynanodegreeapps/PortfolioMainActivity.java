package com.soufflet.mobile.mynanodegreeapps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class PortfolioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
    }

    public void goToMoviesApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch the Popular Movies APP.");
    }

    public void goToStockHawkApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch the Stock Hack APP.");
    }

    public void goToBuildItBiggerApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch the Build It Bigger APP.");
    }

    public void goToMaterialApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch the Make Your App Material APP.");
    }

    public void goToGoUbiquitousApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch the Go Ubiquitous APP.");
    }

    public void goToCapastoneApp(View view) {
        generateUserMessage(view.getContext(), "This button will launch my Capstone Project.");
    }

    private static void generateUserMessage(Context context, String message) {
        Toast.makeText(context, message, LENGTH_SHORT).show();
    }
}
