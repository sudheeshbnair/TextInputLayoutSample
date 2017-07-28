package com.sb.android.textinputlayoutsample;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextDrawable drawable = new TextDrawable(getResources(), "+91");
        TextInputEditText editText = (TextInputEditText) findViewById(R.id.edit_text);
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, null,null,null);


    }
}
