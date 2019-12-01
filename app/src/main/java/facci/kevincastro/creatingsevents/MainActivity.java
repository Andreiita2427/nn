package facci.kevincastro.creatingsevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_registro;
    Button btn_iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registro=(Button) findViewById(R.id.btn_registro);
        btn_iniciar=(Button)findViewById(R.id.btn_iniciar);

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PrincipalActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });

        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegistroActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}
