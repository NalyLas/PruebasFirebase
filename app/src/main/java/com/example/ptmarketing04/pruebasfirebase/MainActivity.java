package com.example.ptmarketing04.pruebasfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static final String LOGTAG = "android-fcm";

    private Button btnToken;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Probar el archivo que has subido a drive en casa en servidor local
        //no funciona en el servidor remoto del ayala
        //puede que por el servidor prueba desde casa si te genera la notificacion.

        btnToken = (Button)findViewById(R.id.btnToken);
        btnToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se obtiene el token actualizado
                String refreshedToken = FirebaseInstanceId.getInstance().getToken();

                Log.d(LOGTAG, "Token actualizado: " + refreshedToken);
            }
        });
    }
}
