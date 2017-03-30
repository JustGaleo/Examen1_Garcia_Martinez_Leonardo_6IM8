package mx.incorporation.typhoon.examen1_garcia_martinez_leonardo_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad2 extends AppCompatActivity {
double pesos, dolares;
    TextView muestraDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        muestraDatos = (TextView) findViewById(R.id.lblMSJ);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        pesos = recibe.getDouble("Pesos");
        dolares = recibe.getDouble("Dolares");


        muestraDatos.setText("Leonardo García Martínez, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);


    }
    public void onCreate(View view){
        //No existe un boton al cual darle click... por lo tanto el método no es funcional o no nos enseño... de todas maneras
        // aqui esta
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        pesos = recibe.getDouble("Pesos");
        dolares = recibe.getDouble("Dolares");


        muestraDatos.setText("Leonardo García Martínez, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);
    }
    public void onClickEnviar(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Examen 1er parcial ");
        intent.putExtra(Intent.EXTRA_TEXT, "Leonardo García Martínez, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
        startActivity(Intent.createChooser(intent, "Gmail"));

    }

}
