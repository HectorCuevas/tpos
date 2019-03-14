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

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class locationActivity extends AppCompatActivity {
    EditText txtAddress, txtMunicipio, txtDepartamento;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        txtAddress = (EditText) findViewById(R.id.txtAddress);
        txtMunicipio = (EditText) findViewById(R.id.txtMunicipio);
        txtDepartamento = (EditText) findViewById(R.id.txtDepartamento);
    }

    public void addJsonArray(ArrayList<String> detail){
        try{
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("usuario_movilizandome", "");
            jsonObject.put("cod_cliente", "");
            jsonObject.put("forma_pago", "CONT");
            jsonObject.put("total", "");
            jsonObject.put("cobrado", "decimal");
            jsonObject.put("procesado", "S");
            jsonObject.put("num_factura", "");
            jsonObject.put("cobrado_2", "");
            jsonObject.put("fecha", "");
            jsonObject.put("latitud", "");
            jsonObject.put("longitud", "");
            /*** required fields ***/
            jsonObject.put("dpi", "");
            jsonObject.put("nombre_cliente", "");
            jsonObject.put("nit", "");
            jsonObject.put("direccion", "");
            jsonObject.put("departamento", "");
            jsonObject.put("municipio", "");
            jsonObject.put("zona", "");
            jsonObject.put("email", "");
            jsonObject.put("dpi_frontal", "");
            jsonObject.put("dpi_trasero", "");

        }catch (JSONException e){
            Toast.makeText(this, "No se ha podido crear el objeto json", Toast.LENGTH_SHORT).show();
        }
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
       /* ApplicationTpos.detail.add(address);
        ApplicationTpos.detail.add(municipio);
        ApplicationTpos.detail.add(departamento);*/
       // addJsonArray(ApplicationTpos.detail);
        Intent cambiarActividad = new Intent(this, PhotoActivity.class);
        startActivity(cambiarActividad);
        if (cambiarActividad.resolveActivity(getPackageManager()) != null) {
            startActivity(cambiarActividad);
        }
    }
}
