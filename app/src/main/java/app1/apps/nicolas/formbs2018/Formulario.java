package app1.apps.nicolas.formbs2018;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Formulario extends AppCompatActivity implements DialogoRegistroExitoso.finalizoCuadroDialgo{

    Context context;
    private int dia,mes,ano;
    public EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        context = this;

        nombre = (EditText) findViewById(R.id.editTextNombre);
        EditText apellido = (EditText) findViewById(R.id.editTextapellido);
        EditText cedula = (EditText) findViewById(R.id.editTextCedula);
        EditText Celular = (EditText) findViewById(R.id.editTextCelular);
        EditText telefono = (EditText) findViewById(R.id.editTextTelefono);
        EditText ciudad = (EditText) findViewById(R.id.editTextCiudad);
        EditText direccion = (EditText) findViewById(R.id.editTextDireccion);
        EditText email = (EditText) findViewById(R.id.editTextCorreo);
        final EditText fechaNacimient = (EditText) findViewById(R.id.editNacimiento);
        Button btnAgregarregistro = (Button) findViewById(R.id.btnAgregarRegistro_);



        btnAgregarregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DialogoRegistroExitoso(context, Formulario.this, nombre.getText().toString());
            }
        });


        fechaNacimient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c  = Calendar.getInstance();
                dia = c.get(Calendar.DAY_OF_MONTH);
                mes = c.get(Calendar.MONTH);
                ano = c.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        fechaNacimient.setText(dayOfMonth+"/"+month+"/"+year);
                    }
                },dia,mes,ano);
                datePickerDialog.show();
            }
        });


    }

    @Override
    public void resultadoCuadroDialogo(String codido) {

        Intent intent = new Intent(Formulario.this, Presentacion.class);
        startActivity(intent);

    }
}
