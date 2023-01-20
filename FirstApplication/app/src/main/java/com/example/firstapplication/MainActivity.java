package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainContainer = new LinearLayout(this);
        mainContainer.setOrientation(LinearLayout.VERTICAL);
        mainContainer.setPadding(20,20,20,20);
        mainContainer.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        ViewGroup.LayoutParams layoutParamsForMainContainer = new
                ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        mainContainer.setLayoutParams(layoutParamsForMainContainer);

        TextView welcomeTextView = new TextView(this);
        welcomeTextView.setPadding(10,10,10,10);
        welcomeTextView.setTextColor(Color.MAGENTA);
        welcomeTextView.setTextSize(24.0F);
        welcomeTextView.setText("Welcome To Bitcode");
        welcomeTextView.setBackgroundColor(Color.GRAY);

        ViewGroup.LayoutParams layoutParamsForViews = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        welcomeTextView.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(welcomeTextView);


        TextView studentName = new TextView(this);
        studentName.setText("Gauri");
        studentName.setTextSize(16.0F);
        studentName.setTextColor(Color.BLUE);
        studentName.setBackgroundColor(Color.GRAY);
        studentName.setPadding(10,10,10,10);

        studentName.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(studentName);

        EditText edtUsername = new EditText(this);
        edtUsername.setHint("Enter edtUsername");

        edtUsername.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(edtUsername);


        ViewGroup.LayoutParams layoutParamsForImageView = new ViewGroup.LayoutParams(
                100,
                100
        );

        ImageView studentImage = new ImageView(this);
        studentImage.setImageResource(R.drawable.ic_launcher_background);
        studentImage.setLayoutParams(layoutParamsForImageView);

        mainContainer.addView(studentImage);

        Button btnSubmit = new Button(this);
        btnSubmit.setText("Submit");
        btnSubmit.setBackgroundColor(Color.BLUE);
        btnSubmit.setTextColor(Color.WHITE);
        btnSubmit.setTextSize(16.0F);
        btnSubmit.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(btnSubmit);

        setContentView(mainContainer);
    }
}