package com.example.helloandroidtp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivitePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("--------------- on create call -----------------");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        System.out.println("--------------- on start call -----------------");
        super.onStart();
    }

    @Override
    protected void onStop() {
        System.out.println("--------------- on stop call -----------------");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        System.out.println("--------------- on restart call -----------------");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("--------------- on resume call -----------------");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("--------------- on pause call -----------------");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        System.out.println("--------------- on SaveInstanceState call -----------------");
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        System.out.println("--------------- on RestoreInstanceState SaveInstanceState call -----------------");
        super.onRestoreInstanceState(savedInstanceState);
    }
}