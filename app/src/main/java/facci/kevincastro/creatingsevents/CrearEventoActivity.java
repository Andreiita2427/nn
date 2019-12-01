package facci.kevincastro.creatingsevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CrearEventoActivity extends AppCompatActivity {

    Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_evento);




        btn_guardar=(Button)findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CrearEventoActivity.this,PrincipalActivity.class);
                CrearEventoActivity.this.startActivity(intent);
                finish();
                }
        });
    }
}
