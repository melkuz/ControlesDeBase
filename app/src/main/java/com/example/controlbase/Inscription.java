package com.example.controlbase;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Array;

public class Inscription extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        setTitle("inscription au programme");
        Button btnInscrire = (Button)findViewById(R.id.btnInscrire);
        Button btnNetoyer= (Button)findViewById(R.id.btnNetoyer);
        Button btnAnuler= (Button)findViewById(R.id.btnAnnuler);
        Spinner spinnerVille = (Spinner) findViewById(R.id.inputVille);
        Spinner spinnerProvinces = (Spinner) findViewById(R.id.inputProvince);
        Spinner spinnerOption1 = (Spinner) findViewById(R.id.inputOption1);
        Spinner spinnerOption2 = (Spinner) findViewById(R.id.inputOption2);

        String[] provinces = {"Province","Quebec","Ontario"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, provinces);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProvinces.setAdapter(adapter);

        String[] villes = {"Ville"};
        ArrayAdapter<String> apatervilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, villes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] villesQuebec = {"Ville","Sherbrooke","Magogi", "Drummondville", "Montréal"};
        ArrayAdapter<String> adaptervilleQuebec = new ArrayAdapter<String>(Inscription.this, android.R.layout.simple_spinner_dropdown_item, villesQuebec);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] villesOntario = {"Ville","Toronto", "Ottawa", "Kingston"};
        ArrayAdapter<String> adaptervilleOntario = new ArrayAdapter<String>(Inscription.this, android.R.layout.simple_spinner_dropdown_item, villesOntario);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] optionsProgramme1 = {"Option1","Gestion de Réseaux","Programmation et Conception."};
        ArrayAdapter<String> adapteroptionsProgramme1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionsProgramme1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOption1.setAdapter(adapteroptionsProgramme1);

        String[] optionsProgramme2 = {"Option2","Programmation et Conception","Gestion de reseaux"};
        ArrayAdapter<String> adapteroptionsProgramm2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionsProgramme2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] optionsProgramme2Reseaux = {"Option2","Programmation et Conception."};
        ArrayAdapter<String> adapteroptionsProgramme2Reseaux = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionsProgramme2Reseaux);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] optionsProgramme2Programmation = {"Option2","Gestion de reseaux"};
        ArrayAdapter<String> adapteroptionsProgramm2Programmation = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionsProgramme2Programmation);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerOption1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int selection =spinnerOption1.getSelectedItemPosition();

                if (selection == 0 ){
                    spinnerOption2.setAdapter(adapteroptionsProgramm2);
                }
                if (selection == 1 ){
                    spinnerOption2.setAdapter(adapteroptionsProgramme2Reseaux);
                }
                if (selection == 2 ){
                    spinnerOption2.setAdapter(adapteroptionsProgramm2Programmation);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        spinnerProvinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int selection =spinnerProvinces.getSelectedItemPosition();
                if (selection == 0 ){
                   spinnerVille.setAdapter(apatervilles);
                }
                if (selection == 1 ){
                    spinnerVille.setAdapter(adaptervilleQuebec);
                }
                if (selection == 2 ){
                    spinnerVille.setAdapter(adaptervilleOntario);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        btnInscrire.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity4();
            }
        });
        btnNetoyer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nettoyerForm();
            }
        });
        btnAnuler.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                returnMenu();
            }
        });
    }

    public void startActivity4(){
        TextView tvNom = (TextView) findViewById(R.id.)
        Spinner spinnerVille = (Spinner) findViewById(R.id.inputVille);
        Spinner spinnerProvinces = (Spinner) findViewById(R.id.inputProvince);
        Spinner spinnerOption1 = (Spinner) findViewById(R.id.inputOption1);
        Spinner spinnerOption2 = (Spinner) findViewById(R.id.inputOption2);
        Intent temp = new Intent(Inscription.this,Info.class);
        temp.putExtra("Nom", )
        startActivity(temp);
    }

    public void nettoyerForm(){
        EditText inputNom = (EditText) findViewById(R.id.inputNom);
        EditText inputPrenom = (EditText) findViewById(R.id.inputPrenom);
        EditText inputCivique = (EditText) findViewById(R.id.inputCivique);
        EditText inputRue = (EditText) findViewById(R.id.inputRue);
        EditText inputTel = (EditText) findViewById(R.id.inputTel);

        Spinner spinnerVille = (Spinner) findViewById(R.id.inputVille);
        Spinner spinnerProvinces = (Spinner) findViewById(R.id.inputProvince);
        Spinner spinnerOption1 = (Spinner) findViewById(R.id.inputOption1);
        Spinner spinnerOption2 = (Spinner) findViewById(R.id.inputOption2);

        Spinner tab[] = {spinnerOption2,spinnerOption1,spinnerVille,spinnerProvinces};

        for (int i =0; i < tab.length; i++ ){
            tab[i].setSelection(0);
        }

        EditText tabnt[]={inputNom,inputPrenom,inputCivique,inputRue,inputTel};
        for (int i =0; i < tabnt.length; i++ ){
            tabnt[i].setText("");
        }
    }

    public void returnMenu(){
        Intent temp = new Intent(Inscription.this,MainActivity.class);
        startActivity(temp);
    }


}