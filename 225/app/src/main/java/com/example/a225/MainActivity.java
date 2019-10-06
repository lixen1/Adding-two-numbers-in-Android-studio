package com.example.a225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,c;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c = a + b;
                String s = Double.toString(c);
                textView.setText(s);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,d;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                d = a - b;
                String s = Double.toString(d);
                textView.setText(s);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,f;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                f = a*b;
                String s = Double.toString(f);
                textView.setText(s);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,g;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                g = a/b;
                String s = Double.toString(g);
                textView.setText(s);

            }
        });
    }
}
