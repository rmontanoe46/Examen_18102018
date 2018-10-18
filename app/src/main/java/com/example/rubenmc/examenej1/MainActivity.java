package com.example.rubenmc.examenej1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btS,btR,btM,btD;

    TextView n1,n2,resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btS=findViewById(R.id.btSuma);
        btS.setOnClickListener(this);

        btR=findViewById(R.id.btResta);
        btR.setOnClickListener(this);

        btM=findViewById(R.id.btMulti);
        btM.setOnClickListener(this);

        btD=findViewById(R.id.btDivi);
        btD.setOnClickListener(this);

        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        resultat=findViewById(R.id.res);

    }

    @Override
    public void onClick(View v) {

        int a,b,c;

        a=R.id.num1;
        b=R.id.num2;



        if(v==btS)
        {
            c=a+b;
        }
        if(v==btR)
        {
            c=a-b;
        }
        if(v==btM)
        {
            c=a*b;
        }
        if(v==btD)
        {
            c=a/b;
        }

        //c+"";




    }
}
