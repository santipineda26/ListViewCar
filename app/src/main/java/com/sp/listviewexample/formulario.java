package com.sp.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ib.custom.toast.CustomToastView;
import com.sp.listviewexample.models.Car;

import java.util.ArrayList;

public class formulario extends AppCompatActivity implements View.OnClickListener{



    public static ArrayList<Car> carros = new ArrayList<>();

    private Button btnAgregar;
    private Button btnListar;
    private EditText txtNombre;
    private EditText txtValor;
    private EditText txtModelo;
    private EditText txtCc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnListar = findViewById(R.id.btnListar);
        txtNombre = findViewById(R.id.txtNombre);
        txtValor = findViewById(R.id.txtValor);
        txtModelo = findViewById(R.id.txtModelo);
        txtCc = findViewById(R.id.txtCc);
        btnAgregar.setOnClickListener(this);
        btnListar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAgregar){
            String nombre = txtNombre.getText().toString();
            String valor = txtValor.getText().toString();
            String modelo = txtModelo.getText().toString();
            String cc = txtCc.getText().toString();
            if (nombre.isEmpty()) {
                CustomToastView.makeErrorToast(this, "Error al validar el Nombre", R.layout.custom_toast).show();
                return;
            }
            if (valor.isEmpty()) {
                CustomToastView.makeErrorToast(this, "Error al validar el Valor", R.layout.custom_toast).show();
                return;
            }
            if (modelo.isEmpty()) {
                CustomToastView.makeErrorToast(this, "Error al validar el Modelo", R.layout.custom_toast).show();
                return;
            }
            if (cc.isEmpty()) {
                CustomToastView.makeErrorToast(this, "Error al validar  el Cilindraje", R.layout.custom_toast).show();
                return;
            }

            Car carro = new Car(nombre,valor,modelo,cc,null);
            carros.add(carro);
            txtNombre.setText("");
            txtValor.setText("");
            txtModelo.setText("");
            txtCc.setText("");


        }

        if (v.getId() == R.id.btnListar) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

    }
}
