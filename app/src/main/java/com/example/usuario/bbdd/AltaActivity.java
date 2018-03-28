package com.example.usuario.bbdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AltaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);
        findViewById(R.id.Grabar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo= ((EditText)findViewById(R.id.txtTitulo)).getText().toString();
                String autor= ((EditText)findViewById(R.id.txtAutor)).getText().toString();
                Double precio= Double.parseDouble(((EditText)findViewById(R.id.txtPrecio)).getText(). toString());
                DBLibros adp=new DBLibros(AltaActivity.this);
                adp.altaLibro(titulo, autor, precio);
                adp.close();
                finish();
            }
        });
    }
}
