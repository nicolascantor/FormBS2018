package app1.apps.nicolas.formbs2018;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DialogoRegistroExitoso {


   public interface finalizoCuadroDialgo{
        void resultadoCuadroDialogo(String codido);
    }

    private finalizoCuadroDialgo interfaz;

    public DialogoRegistroExitoso(Context contexto, finalizoCuadroDialgo actividad, String nombre){

        interfaz = actividad;

        final Dialog dialogoNuevoValor = new Dialog(contexto);
        dialogoNuevoValor.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogoNuevoValor.setCancelable(false);
        dialogoNuevoValor.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogoNuevoValor.setContentView(R.layout.dialogo_registro_exitoso);


        TextView nombreDialog = (TextView) dialogoNuevoValor.findViewById(R.id.textNombreClienteDialog);
        Button btnFinRegistro = (Button) dialogoNuevoValor.findViewById(R.id.btnFinalizarRegistro);


        nombreDialog.setText(nombre.toUpperCase());


        btnFinRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                interfaz.resultadoCuadroDialogo("1245");
                dialogoNuevoValor.dismiss();
            }
        });

        dialogoNuevoValor.show();
    }
}
