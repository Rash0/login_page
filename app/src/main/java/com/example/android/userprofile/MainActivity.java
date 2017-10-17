package com.example.android.userprofile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {
        Intent startLoginScreen = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(startLoginScreen);
    }

    public void signUp(View view) {
        Intent startSignupScreen = new Intent(getApplicationContext(), SignUp.class);
        startActivity(startSignupScreen);
    }



    public void facebookLogin(View view) {
        String url = "http://www.facebook.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void gmailLogin (View view) {
        String url = "https://www.gmail.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
