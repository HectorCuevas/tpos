package com.rasoftec.tpos2;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import com.rasoftec.tpos.R;
import com.rasoftec.tpos2.data.factura_encabezado;
import com.rasoftec.ApplicationTpos;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    EditText txtName, txtDpi, txtNit, txtCel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtName = (EditText) findViewById(R.id.txtName);
        txtDpi = (EditText) findViewById(R.id.txtDpi);
        txtNit = (EditText) findViewById(R.id.txtNit);
        txtCel = (EditText) findViewById(R.id.txtTel);
    }

    /*** Public method to Chance activity ***/

    public void changeActivity(View v){
        String name=txtName.getText().toString();
        String dpi= txtDpi.getText().toString();
        String nit = txtNit.getText().toString();
        String cel = txtCel.getText().toString();
        //ArrayList<String> params = new ArrayList<>();
        ApplicationTpos.params.add(name);
        ApplicationTpos.params.add(dpi);
        ApplicationTpos.params.add(nit);
        ApplicationTpos.params.add(cel);
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









