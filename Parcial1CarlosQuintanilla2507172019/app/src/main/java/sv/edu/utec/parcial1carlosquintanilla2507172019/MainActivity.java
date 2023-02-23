package sv.edu.utec.parcial1carlosquintanilla2507172019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    EditText etusuario,etcontraseña;
    TextView txresp;
    Button btingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusuario=findViewById(R.id.edtuser);
        etcontraseña=findViewById(R.id.edtcontra);
        txresp=findViewById(R.id.txvresp);
        btingresar = findViewById(R.id.btningresar);

        btingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Usuario, contraseña, resp;

                Usuario = etusuario.getText().toString();
                contraseña=etcontraseña.getText().toString();



                if(Usuario.equals("parcialETps1")&&(contraseña.equals("p4rC14l#tp$"))){
                    Intent intento=new Intent(getApplicationContext(),Pantalla2.class);
                    startActivity(intento);

                }
                else {
                    txresp.setText("contraseña y usuario no son correctos");
                }
            }
        });



    }
}