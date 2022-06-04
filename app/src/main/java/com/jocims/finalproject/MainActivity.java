package com.jocims.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText fullName;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.Login);
        button.setOnClickListener(this);

        fullName = findViewById(R.id.FullName);
        email = findViewById(R.id.Email);

        TextView textRegister = findViewById(R.id.Register);
        TextView textPassword = findViewById(R.id.Password);

        String register = "First-time User? Register Here";
        String password = "Forgotten Password? Click Here";

        SpannableString sRegister = new SpannableString(register);
        SpannableString sPassword = new SpannableString(password);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(true);
            }
        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(true);
            }
        };

        sRegister.setSpan(clickableSpan1, 17, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sPassword.setSpan(clickableSpan2, 20, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textRegister.setText(sRegister);
        textRegister.setMovementMethod(LinkMovementMethod.getInstance());

        textPassword.setText(sPassword);
        textPassword.setMovementMethod(LinkMovementMethod.getInstance());
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Login:
                Toast.makeText(this, fullName.getText(), Toast.LENGTH_SHORT).show();
                Toast.makeText(this, email.getText(), Toast.LENGTH_SHORT).show();
//                //
//                break;
//            case R.id.Email:
//                //
        }
    }
}