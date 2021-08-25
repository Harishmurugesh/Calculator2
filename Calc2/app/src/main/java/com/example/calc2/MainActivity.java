package com.example.calc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Fragment1listener{

    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();


        getSupportFragmentManager().beginTransaction().add(R.id.container2, fragment2).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container1, fragment1).commit();
    }


    @Override
    public void sendResult1(String string) {
        fragment2.updateAnswer(string);
    }
}