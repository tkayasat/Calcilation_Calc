package com.example.calcilation_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Button btn_clean = findViewById(R.id.btn_clean);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_point = findViewById(R.id.btn_point);
        Button btn_equal = findViewById(R.id.btn_equal);
        Button btn_add = findViewById(R.id.btn_add);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_multiply = findViewById(R.id.btn_multiply);
        Button btn_divide = findViewById(R.id.btn_divide);

        btn_clean.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button b;

        switch (v.getId()) {
            case R.id.btn_clean:
                b = findViewById(R.id.btn_clean);
                textView.setText(b.getText());
                break;
            case R.id.btn_1:
                b = findViewById(R.id.btn_1);
                textView.setText(b.getText());
                break;
            case R.id.btn_2:
                b = findViewById(R.id.btn_2);
                textView.setText(b.getText());
                break;
            case R.id.btn_3:
                b = findViewById(R.id.btn_3);
                textView.setText(b.getText());
                break;
            case R.id.btn_4:
                b = findViewById(R.id.btn_4);
                textView.setText(b.getText());
                break;
            case R.id.btn_5:
                b = findViewById(R.id.btn_5);
                textView.setText(b.getText());
                break;
            case R.id.btn_6:
                b = findViewById(R.id.btn_6);
                textView.setText(b.getText());
                break;
            case R.id.btn_7:
                b = findViewById(R.id.btn_7);
                textView.setText(b.getText());
                break;
            case R.id.btn_8:
                b = findViewById(R.id.btn_8);
                textView.setText(b.getText());
                break;
            case R.id.btn_9:
                b = findViewById(R.id.btn_9);
                textView.setText(b.getText());
                break;
            case R.id.btn_0:
                b = findViewById(R.id.btn_0);
                textView.setText(b.getText());
                break;
            case R.id.btn_point:
                b = findViewById(R.id.btn_point);
                textView.setText(b.getText());
                break;
            case R.id.btn_equal:
                b = findViewById(R.id.btn_equal);
                textView.setText(b.getText());
                break;
            case R.id.btn_add:
                b = findViewById(R.id.btn_add);
                textView.setText(b.getText());
                break;
            case R.id.btn_minus:
                b = findViewById(R.id.btn_minus);
                textView.setText(b.getText());
                break;
            case R.id.btn_multiply:
                b = findViewById(R.id.btn_multiply);
                textView.setText(b.getText());
                break;
            case R.id.btn_divide:
                b = findViewById(R.id.btn_divide);
                textView.setText(b.getText());
                break;
        }
    }
}