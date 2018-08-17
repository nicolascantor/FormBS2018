package app1.apps.nicolas.formbs2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity implements DialogoRegistroExitoso.finalizoCuadroDialgo{

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        context = this;

        EditText nombre = (EditText) findViewById(R.id.editTextNombre);
        EditText apellido = (EditText) findViewById(R.id.editTextapellido);
        EditText cedula = (EditText) findViewById(R.id.editTextCedula);
        EditText Celular = (EditText) findViewById(R.id.editTextCelular);
        EditText telefono = (EditText) findViewById(R.id.editTextTelefono);
        EditText ciudad = (EditText) findViewById(R.id.editTextCiudad);
        EditText direccion = (EditText) findViewById(R.id.editTextDireccion);
        EditText email = (EditText) findViewById(R.id.editTextCorreo);
        Button btnAgregarregistro = (Button) findViewById(R.id.btnAgregarRegistro_);



        btnAgregarregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DialogoRegistroExitoso(context, Formulario.this);
            }
        });
    }

    @Override
    public void resultadoCuadroDialogo(String codido) {

        Intent intent = new Intent(Formulario.this, Presentacion.class);
        startActivity(intent);

    }
}
