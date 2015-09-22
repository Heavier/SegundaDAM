package com.example.dam.segundadam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Sumas extends AppCompatActivity {

    //variables de instancia o del objeto
    //Variables estaticas o de clase
    //Constantes
    private TextView tvOp1, tvOp2, tvResultado;
    private EditText etOp1;
    private EditText etOp2;
    private EditText etResultado;
    private Button btOperar;
    private RadioButton rbSumar, rbRestar, rbMulti, rbDiv;
    private String opc, res;

    //Ciclo de vida de la actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumas);
        iniciar();
    }

    //Al crear el menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sumas, menu);
        return true;
    }

    //al seleccionar una opción del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void iniciar(){
        tvOp1 = (TextView)findViewById(R.id.tvOp1);
        tvOp2 = (TextView)findViewById(R.id.tvOp2);
        tvResultado= (TextView)findViewById(R.id.tvResultado);
        etOp1 = (EditText)findViewById(R.id.etOp1);
        etOp2 = (EditText)findViewById(R.id.etOp2);
        etResultado = (EditText)findViewById(R.id.etResultado);
        btOperar = (Button)findViewById(R.id.btOperar);
        rbSumar = (RadioButton)findViewById(R.id.rbSumar);
        rbRestar = (RadioButton)findViewById(R.id.rbRestar);
        rbMulti = (RadioButton)findViewById(R.id.rbMulti);
        rbDiv = (RadioButton)findViewById(R.id.rbDiv);
        opc = "";
        res = "35";


        btOperar.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        int a = Integer.valueOf(etOp1.getText().toString());
                        int b = Integer.valueOf(etOp2.getText().toString());

                        switch(opc) {
                            case "suma":
                                res = sumar(a, b);
                            case "resta":
                                res = restar(a, b);
                            case "multi":
                                res = multiplicar(a, b);
                            case "divi":
                                res = dividir(a, b);
                        }
                        etResultado.setText(res);
                    }
                });
    }

    public void onRadioButtonClicked(View view) {
        // Está seleccionado?
        boolean checked = ((RadioButton) view).isChecked();

        // Comprueba qué boton está seleccionado
        switch(view.getId()) {
            case R.id.rbSumar:
                if (checked)
                    opc = "suma";
                break;
            case R.id.rbRestar:
                if (checked)
                    opc = "resta";
                break;
            case R.id.rbMulti:
                if (checked)
                    opc = "multi";
                break;
            case R.id.rbDiv:
                if (checked)
                    opc = "divi";
                break;
        }
    }


    private String sumar(int a , int b){
        int resultado = 0;
        resultado = a + b;
        return resultado + "";
    }
    private String restar(int a , int b){
        int resultado = 0;
        resultado = a - b;
        return resultado + "";
    }
    private String multiplicar(int a , int b){
        int resultado = 0;
        resultado = a * b;
        return resultado + "";
    }
    private String dividir(int a , int b){
        int resultado = 0;
        resultado = a / b;
        return resultado + "";
    }

}
