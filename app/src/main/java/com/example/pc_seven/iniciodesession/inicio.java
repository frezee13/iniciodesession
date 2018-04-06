package com.example.pc_seven.iniciodesession;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class incio extends AppCompatActivity {

    private Button BtnIniciar;
    private EditText Tv_Mensaje;
    private TextView eTusuario,eTcontrasena;
    private String usuario="frexzeer", contrasena="123456";
    public final String EXTRA_MESSAGE="usuario";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incio);

        BtnIniciar =(Button)findViewById(R.id.btn_iniciar);
        eTusuario = (TextView)findViewById(R.id.et_contrasena);
        eTcontrasena = (TextView) findViewById(R.id.et_contrasena);

        BtnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mandar mensaje
                if(eTusuario.getText().toString().equals(usuario) && eTcontrasena.getText().equals(contrasena)){
                    Intent mIntent;
                    mIntent = new Intent(  incio.this,  sesioniniciada.class  );
                    mIntent.putExtra(EXTRA_MESSAGE, eTusuario.getText().toString()  );
                    startActivity(mIntent);
                    finish();
                    }else {
                    Toast.makeText( incio, "Alguno de los campos ingresados fue erroneo", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
