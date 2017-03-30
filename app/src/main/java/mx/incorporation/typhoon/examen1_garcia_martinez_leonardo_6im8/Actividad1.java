package mx.incorporation.typhoon.examen1_garcia_martinez_leonardo_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {
    EditText pesos;
    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        pesos = (EditText) findViewById(R.id.lblPesos);
        msj = (TextView) findViewById(R.id.lblMensaje);
    }
    public void onClickConvertir(View v) {
        if(pesos.getText().equals(" ")){
            msj.setText("Inválido");
        }else{
            double money, conversion;
            money = Double.parseDouble(pesos.getText().toString());
            conversion = money/15;


            Intent envia = new Intent(this, Actividad2.class);
            Bundle datos = new Bundle();
            datos.putDouble("Pesos", money);
            datos.putDouble("Dolares", conversion);
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }

    }
}
