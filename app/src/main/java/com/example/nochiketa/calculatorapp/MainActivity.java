package com.example.nochiketa.calculatorapp;

import android.sax.TextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView textView;
    Button buttonadd, buttonsub, buttonmul, buttondiv, buttonequal, buttoncancel, buttonone, buttontwo, buttonthree, buttonfour, buttonfive, buttonsix, buttonseven, buttoneight, buttonnine,buttonzero;
    int  operation;
    Float mnum1, mnum2, total;

    String exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textview1);

        buttonadd = (Button)findViewById(R.id.plus);
        buttonsub = (Button)findViewById(R.id.subs);
        buttonmul = (Button)findViewById(R.id.multiplication);
        buttondiv = (Button)findViewById(R.id.division);
        buttonequal = (Button)findViewById(R.id.equal);
        buttoncancel = (Button)findViewById(R.id.cancel);
        buttonone = (Button)findViewById(R.id.one);
        buttontwo = (Button)findViewById(R.id.two);
        buttonthree = (Button)findViewById(R.id.three);
        buttonfour = (Button)findViewById(R.id.four);
        buttonfive = (Button)findViewById(R.id.five);
        buttonsix = (Button)findViewById(R.id.six);
        buttonseven = (Button)findViewById(R.id.seven);
        buttoneight = (Button)findViewById(R.id.eight);
        buttonnine = (Button)findViewById(R.id.nine);
        buttonzero = (Button)findViewById(R.id.zero);

        exp = "";

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"1";
                textView.setText(exp);
            }
        });
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"2";
                textView.setText(exp);
            }
        });
        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"3";
                textView.setText(exp);
            }
        });
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"4";
                textView.setText(exp);
            }
        });
        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"5";
                textView.setText(exp);
            }
        });
        buttonsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"6";
                textView.setText(exp);
            }
        });
        buttonseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"7";
                textView.setText(exp);
            }
        });
        buttoneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"8";
                textView.setText(exp);
            }
        });
        buttonnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"9";
                textView.setText(exp);
            }
        });
        buttonzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp+"0";
                textView.setText(exp);
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 1;
                mnum1 = Float.parseFloat(textView.getText().toString());
                exp ="";
                textView.setText(exp);
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 2;
                mnum1 = Float.parseFloat(textView.getText().toString());
                exp = "";
                textView.setText(exp);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 3;
                mnum1 = Float.parseFloat(textView.getText().toString());
                exp = "";
                textView.setText(exp);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 4;
                mnum1 = Float.parseFloat(textView.getText().toString());
                exp = "";
                textView.setText(exp);
            }
        });

        /*buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });*/

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mnum2 = Float.parseFloat(textView.getText().toString());

                switch (operation)
                {
                    case 1:
                        total = mnum1 + mnum2;
                        break;
                    case 2:
                        total = mnum1 - mnum2;
                        break;
                    case 3:
                        total = mnum1 * mnum2;
                        break;
                    case 4:
                        total = mnum1 / mnum2;
                        break;
                    default:
                        textView.setText("This is me");

                }
                exp = "";
                textView.setText(String.valueOf(total));
            }
        });
    }
}
