package com.rasoftec.tpos2;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rasoftec.tpos.R;
import com.rasoftec.tpos2.data.factura_encabezado;
import com.rasoftec.ApplicationTpos;

import java.util.ArrayList;
import java.util.List;

import static com.rasoftec.ApplicationTpos.newFactura_encabezado;
import static com.rasoftec.ApplicationTpos.p;

public class DetailActivity extends AppCompatActivity {
    EditText txtName, txtDpi, txtNit, txtCel, txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtName = (EditText) findViewById(R.id.txtName);
        txtDpi = (EditText) findViewById(R.id.txtDpi);
        txtNit = (EditText) findViewById(R.id.txtNit);
        txtCel = (EditText) findViewById(R.id.txtTel);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
    }

    /*** Public method to Chance activity ***/

    public void changeActivity(View v){
        String name=txtName.getText().toString();
        String dpi= txtDpi.getText().toString();
        String nit = txtNit.getText().toString();
        String cel = txtCel.getText().toString();
        String email = txtEmail.getText().toString();
        newFactura_encabezado.setNombre(name);
        newFactura_encabezado.setDpi(dpi);
        newFactura_encabezado.setNit(nit);
        newFactura_encabezado.setCel(cel);
        newFactura_encabezado.setEmail(email);
       // ApplicationTpos.params.add(a);//last
        Intent changeActivity = new Intent(this, locationActivity.class);
        //changeActivity.putExtra("list", params);
        startActivity(changeActivity);
        if (changeActivity.resolveActivity(getPackageManager()) != null) {
            startActivity(changeActivity);
        }
    }
    /*** Public methods to clear text boxes ***/

    public void clearName(View view){
        txtName.getText().clear();
    }

    public void clearDpi(View view){
        txtDpi.getText().clear();
    }

    public void clearNit(View view){
        txtNit.getText().clear();
    }

    public void clearCel(View view){
        txtCel.getText().clear();
    }
}









