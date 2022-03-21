package com.example.controlbase;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(" Beinvenue aux inscription du programme de Techniques de linformatique du Cegep de Sherbrooke");
        Button btnInfo = (Button)findViewById(R.id.info);
        Button btnInscription = (Button)findViewById(R.id.inscription);
        Button btnFin= (Button)findViewById(R.id.fin);
        btnInfo.setOnClickListener(this);
        btnInscription.setOnClickListener(this);
        btnFin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.info:
                this.startInfo();
                break;
            case R.id.inscription:
                this.startInscription();
                break;
            case R.id.fin:
                System.out.println("test");
                break;
            default:
                break;
        }
    }

    public void startInfo(){
        Intent temp = new Intent(MainActivity.this,Info.class);
        startActivity(temp);
    }
    public void startInscription(){
        Intent ins = new Intent(MainActivity.this,Inscription.class);
        startActivity(ins);
    }

}