package sv.edu.utec.parcial1carlosquintanilla2507172019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class Pantalla2 extends AppCompatActivity {
    EditText etpesp, etaltura;
    TextView txresp;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        etpesp=findViewById(R.id.edtpeso);
        etaltura=findViewById(R.id.edtaltura);
        txresp=findViewById(R.id.txvrespicm);
        btCalcular=findViewById(R.id.btncalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso, altura, respuesta;

                peso = Double.parseDouble(etpesp.getText().toString());
                altura = Double.parseDouble(etaltura.getText().toString());

                respuesta = (peso / (altura * altura));
                if (altura > 0) {

                    if (respuesta < 10.5) {
                        txresp.setText("Criticamante Bajo de peso " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 15.9) {
                        txresp.setText("Severamente Bajo de peso " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 18.5) {
                        txresp.setText("Bajo de peso " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 25) {
                        txresp.setText("Normal peso saludable " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 30) {
                        txresp.setText("Sobrepeso " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 35) {
                        txresp.setText("Obesidad Clase 1: Moderadamente obeso " + "\n " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta < 40) {
                        txresp.setText("Obesidad Clase 2: Severamente obeso " + "\n " + " IMC: " + String.valueOf(respuesta));
                    } else if (respuesta > 40) {
                        txresp.setText("Obesidad Clase 3: Criticamante obeso " + "\n " + " IMC: " + String.valueOf(respuesta));
                    } else {
                        txresp.setText("Error");
                    }


                }
                else {
                    txresp.setText("Error no divisible entre 0");
                }
            }
        });


    }

}