package com.getmycalc.sss.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,B00,Bdot,Badd,Bsub,Bmul,Bdiv,Bmod,Bans,Bc,Bdel;
    TextView Ans;
    double var1,var2,sol;
    int soli;
    boolean add,sub,mul,div,mod,c;
    private Vibrator myVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);


        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        B6 = (Button) findViewById(R.id.B6);
        B7 = (Button) findViewById(R.id.B7);
        B8 = (Button) findViewById(R.id.B8);
        B9 = (Button) findViewById(R.id.B9);
        B0 = (Button) findViewById(R.id.B0);
        B00 = (Button) findViewById(R.id.B00);
        Bdel= (Button) findViewById(R.id.Bdel);
        Bans = (Button) findViewById(R.id.Bans);
        Bmul = (Button) findViewById(R.id.Bmul);
        Bdiv = (Button) findViewById(R.id.Bdiv);
        Bsub = (Button) findViewById(R.id.Bsub);
        Badd = (Button) findViewById(R.id.Badd);
        Bdot = (Button) findViewById(R.id.Bdot);
        Bc = (Button) findViewById(R.id.Bc);
        Bmod = (Button) findViewById(R.id.Bmod);
        Ans = (TextView) findViewById(R.id.Ans);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"1");
                myVib.vibrate(50);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"2");
                myVib.vibrate(50);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"3");
                myVib.vibrate(50);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"4");
                myVib.vibrate(50);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"5");
                myVib.vibrate(50);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"6");
                myVib.vibrate(50);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"7");
                myVib.vibrate(50);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"8");
                myVib.vibrate(50);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"9");
                myVib.vibrate(50);
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"0");
                myVib.vibrate(50);
            }
        });
        B00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+"00");
                myVib.vibrate(50);
            }
        });
        Bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans.setText(Ans.getText()+".");
                myVib.vibrate(50);
            }
        });





        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(Ans.getText()+"");
                add = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });

        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(Ans.getText()+"");
                sub = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });

        Bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(Ans.getText()+"");
                mul = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });

        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(Ans.getText()+"");
                div = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });
        Bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Ans.getText().toString();
                if (str.length() >=1 ) {
                    str = str.substring(0, str.length() - 1);
                    Ans.setText(str);
                } else if (str.length() <=1 ) {
                    Ans.setText("0");
                }
            }
        });

        Bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(Ans.getText()+"");
                mod = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });

        Bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = true;
                Ans.setText(null);
                myVib.vibrate(50);
            }
        });

        Bans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myVib.vibrate(50);
                var2 = Double.parseDouble(Ans.getText()+"");
                if(add == true)
                {
                    sol = var1 + var2;
                    if(sol == Math.floor(sol));
                    {
                        soli = (int) sol;
                        Ans.setText(soli + "");
                    }
                    if(sol != Math.floor(sol))
                    {
                        Ans.setText(sol + "");
                    }
                    add = false;
                }
                if(sub == true)
                {
                    sol = var1 - var2;
                    if(sol == Math.floor(sol));
                    {
                        soli = (int) sol;
                        Ans.setText(soli + "");
                    }
                    if(sol != Math.floor(sol))
                    {
                        Ans.setText(sol + "");
                    }
                    sub = false;
                }
                if(mul == true)
                {
                    sol = var1 * var2;
                    if(sol == Math.floor(sol));
                    {
                        soli = (int) sol;
                        Ans.setText(soli + "");
                    }
                    if(sol != Math.floor(sol))
                    {
                        Ans.setText(sol + "");
                    }
                    mul = false;
                }
                if(div == true)
                {
                    if (var2 == 0)
                    {
                        Ans.setText("inf"+"");
                    }
                    else {
                        sol = var1 / var2;
                        if (sol == Math.floor(sol)) ;
                        {
                            soli = (int) sol;
                            Ans.setText(soli + "");
                        }
                        if (sol != Math.floor(sol)) {
                            Ans.setText(sol + "");
                        }
                    }
                    div = false;
                }
                if(mod == true)
                {
                    sol = var1 % var2;
                    if(sol == Math.floor(sol));
                    {
                        soli = (int) sol;
                        Ans.setText(soli + "");
                    }
                    if(sol != Math.floor(sol))
                    {
                        Ans.setText(sol + "");
                    }
                    mod = false;
                }

            }
        });


    }
}
