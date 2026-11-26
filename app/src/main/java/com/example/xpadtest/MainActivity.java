package com.example.xpadtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView message = new TextView(this);
        message.setText(
                "XPad Test APK\n\n"
                + "Package: com.example.xpadtest\n"
                + "Purpose: basic installation-path diagnostic\n\n"
                + "This app requests no special permissions."
        );
        message.setTextSize(18);
        message.setGravity(Gravity.CENTER);
        message.setPadding(32, 32, 32, 32);

        setContentView(message);
    }
}
