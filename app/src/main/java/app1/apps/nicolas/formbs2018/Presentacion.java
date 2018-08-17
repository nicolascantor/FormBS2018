package app1.apps.nicolas.formbs2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        Button btnAgregarInscripcion = (Button) findViewById(R.id.btnNuevaInscrip);

        btnAgregarInscripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Presentacion.this, Formulario.class);
                startActivity(intent);
            }
        });
    }
}
