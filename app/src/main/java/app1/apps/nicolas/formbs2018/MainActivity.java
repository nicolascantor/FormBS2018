package app1.apps.nicolas.formbs2018;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView grupoMeicol, g4;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        grupoMeicol = (ImageView) findViewById(R.id.imageGrupoMeicol);

        trans1();
        grupoMeicol.setImageResource(R.drawable.logog4);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                startActivity(intent);

            }
        }, 3000);

    }


        public void trans1(){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.fondo);
            grupoMeicol.startAnimation(animation);

            //trans2();
        }


}
