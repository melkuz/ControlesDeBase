package com.example.controlbase;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Button btnback = (Button)findViewById(R.id.btndesback);
        setTitle("Information sur les programmes Techniques de liniformatique");

        btnback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                Intent temp = new Intent(Info.this,MainActivity.class);

                startActivity(temp);
            }
        });

        TextView t1= (TextView)findViewById(R.id.titre1);

        TextView t2= (TextView)findViewById(R.id.titre2);

        TextView d1= (TextView)findViewById(R.id.description1);
        TextView d2= (TextView)findViewById(R.id.description2);
        t1.setText("Gestion Reseau");
        t2.setText("Gestion Reseau");
        d1.setText(" when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted." +
                " The wise man therefore always holds in these matters to this principle of selection: ");
        d2.setText(" when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted." +
                " The wise man therefore always holds in these matters to this principle of selection: ");
    }


}