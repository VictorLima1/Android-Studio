package com.example.victor.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());
                double soma = a + b;
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Resultado");
                alerta.setMessage("O resultado é " + soma);
                alerta.setNeutralButton("OK", null);
                alerta.show();
                num1.setText("");
                num2.setText("");

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());
                double soma = a * b;
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Resultado");
                alerta.setMessage("O resultado é " + soma);
                alerta.setNeutralButton("OK", null);
                alerta.show();
                num1.setText("");
                num2.setText("");

            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());
                double soma = a - b;
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Resultado");
                alerta.setMessage("O resultado é " + soma);
                alerta.setNeutralButton("OK", null);
                alerta.show();
                num1.setText("");
                num2.setText("");

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());
                double soma = a / b;
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Resultado");
                alerta.setMessage("O resultado é " + soma);
                alerta.setNeutralButton("OK", null);
                alerta.show();
                num1.setText("");
                num2.setText("");

            }
        });
    }
}
