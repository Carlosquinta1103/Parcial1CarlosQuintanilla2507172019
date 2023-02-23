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
                
            }
        });


    }

}