package com.example.robin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button18, button19, button20,  button21;

      TextView TextView1, TextView2;
      int operator;
      Double a, b, c;

    {
        c = 0.0;
        a = 0.0;
        b = 0.0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1); button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3); button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5); button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7); button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9); button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11); button12 = (Button) findViewById(R.id.button12);
        button18 = (Button) findViewById(R.id.button18); button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20); button21 = (Button) findViewById(R.id.button21);
        TextView1 = (TextView) findViewById(R.id.textView);
        TextView2 = (TextView) findViewById(R.id.textView2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"1");
                //TextView2.setText(TextView2.getText().toString()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"2");
              //  TextView2.setText(TextView2.getText().toString()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"3");
             //   TextView2.setText(TextView2.getText().toString()+"3");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"4");
               // TextView2.setText(TextView2.getText().toString()+"4");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"5");
              //  TextView2.setText(TextView2.getText().toString()+"5");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"6");
              //  TextView2.setText(TextView2.getText().toString()+"6");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"7");
                //TextView2.setText(TextView2.getText().toString()+"7");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"8");
               // TextView2.setText(TextView2.getText().toString()+"8");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+"9");
              //  TextView2.setText(TextView2.getText().toString()+"9");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextView1.getText().toString() == ""){
                    TextView1.setText("+");
                }
                else {
                    TextView2.setText(TextView1.getText() + "+");
                    a = Double.parseDouble(TextView1.getText().toString());
                    TextView1.setText("+");
                    TextView1.setText("");
                    operator = 1;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView1.getText().toString() == ""){
                    TextView1.setText("-");
                }
                else {
                    TextView2.setText(TextView1.getText() + "-");
                    a = Double.parseDouble(TextView1.getText().toString());
                    TextView1.setText("-");
                    TextView1.setText("");
                    operator = 2;
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView1.getText().toString() == "") {
                    TextView1.setText("X");
                } else {
                    TextView2.setText(TextView1.getText() + "X");
                    a = Double.parseDouble(TextView1.getText().toString());
                    TextView1.setText("X");
                    TextView1.setText("");
                    operator = 3;
                }
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText(TextView1.getText().toString()+".");
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView1.getText().toString() == ""){
                    TextView1.setText("/");
                }
                else {
                    TextView2.setText(TextView1.getText() + "/");
                    a = Double.parseDouble(TextView1.getText().toString());

                    TextView1.setText("/");
                    TextView1.setText("");
                    operator = 4;
                }
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView1.getText().toString() == "") {
                    TextView1.setText("=");
                } else {
                    b = Double.parseDouble(TextView1.getText().toString());
                    switch (operator) {
                        case 1:
                            c = a + b;
                            break;
                        case 2:
                            c = a - b;
                            break;
                        case 3:
                            c = a * b;
                            break;
                        case 4:
                            c = a / b;
                            break;
                        default:
                            c = 0.0;
                    }
                    TextView1.setText("" + c);
                    TextView2.setText(TextView2.getText().toString() + "" + b);
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView2.setText("");
                TextView1.setText("");
            }
        });



    }
}
