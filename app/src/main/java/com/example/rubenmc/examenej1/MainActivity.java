package com.example.rubenmc.examenej1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        EditText a=(EditText)findViewById(R.id.num1);
        EditText b=(EditText)findViewById(R.id.num2);
        TextView c=(TextView)findViewById(R.id.res);

        int n1,n2,res;

        n1= Integer.parseInt(a.getText().toString());
        n2= Integer.parseInt(b.getText().toString());

        a.setText("");
        b.setText("");

        if(v==btS)
        {
            res=n1+n2;
            c.setText(String.valueOf(res));
        }
        if(v==btR)
        {
            res=n1-n2;
            c.setText(String.valueOf(res));
        }
        if(v==btM)
        {
            res=n1*n2;
            c.setText(String.valueOf(res));
        }
        if(v==btD)
        {
            if(n2==0)
            {
                c.setText("Infinito");
            }
            else
            {
                res=n1/n2;
                c.setText(String.valueOf(res));
            }
        }
    }
}
