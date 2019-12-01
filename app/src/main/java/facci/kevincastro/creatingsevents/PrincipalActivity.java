package facci.kevincastro.creatingsevents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final FloatingActionButton fab = findViewById(R.id.flo_btn);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final EventFragment eventFragment = new EventFragment();
        final CalendarFragment calendarFragment = new CalendarFragment();
        final PerfilFragment perfilFragment = new PerfilFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();
                if (id == R.id.event){
                    setFragment(eventFragment);
                    fab.show();
                    return true;
                }else if (id == R.id.calendar){
                    setFragment(calendarFragment);
                    fab.hide();
                    return true;
                }else if (id == R.id.perfil){
                    setFragment(perfilFragment);
                    fab.hide();
                    return true;
                }
                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.event);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this, CrearEventoActivity.class);
                //intent.putExtra("some","some data");
                startActivity(intent);
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }


}
