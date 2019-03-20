package com.rasoftec.tpos2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rasoftec.ApplicationTpos;
import com.rasoftec.tpos.R;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

import static com.rasoftec.ApplicationTpos.newFactura_encabezado;
import static com.rasoftec.ApplicationTpos.p;

public class locationActivity extends AppCompatActivity {
    EditText txtAddress, txtMunicipio, txtDepartamento, txtZona;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        txtAddress = (EditText) findViewById(R.id.txtAddress);
        txtMunicipio = (EditText) findViewById(R.id.txtMunicipio);
        txtDepartamento = (EditText) findViewById(R.id.txtDepartamento);
        txtZona = (EditText) findViewById(R.id.txtZona);
    }

    /*** Public methods to clear text boxes ***/

    public void clearAddress(View view){
        txtAddress.getText().clear();
    }
    public void clearMunicipio(View view){
        txtMunicipio.getText().clear();
    }
    public void clearDepartamento(View view){
        txtDepartamento.getText().clear();
    }

    /*** Change implicit activity ***/
    public void changePhotoActivity(View v){
        String address = txtAddress.getText().toString();
        String municipio = txtMunicipio.getText().toString();
        String departamento = txtDepartamento.getText().toString();
        String zona = txtZona.getText().toString();
        departamento=(departamento.equals(null)?"":departamento);
        municipio=(municipio.equals(null))?"":municipio;
        newFactura_encabezado.setDireccion(address);
        newFactura_encabezado.setMunicipio(municipio);
        newFactura_encabezado.setDepto(departamento);
        newFactura_encabezado.setZona(zona);
        p.add(newFactura_encabezado);
        Toast.makeText(this, ""+ p.get(0).getNombre(), Toast.LENGTH_LONG).show();
       // addJsonArray(ApplicationTpos.detail);
        Intent cambiarActividad = new Intent(this, PhotoActivity.class);
        startActivity(cambiarActividad);
        if (cambiarActividad.resolveActivity(getPackageManager()) != null) {
            startActivity(cambiarActividad);
        }
    }
}
