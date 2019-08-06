package examples.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setView();
    }

    private void bindView(){
        bottomNavigationView = findViewById(R.id.bottomNav);
    }

    private void setView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(MainActivity.this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu_fav:{
                Toast.makeText(MainActivity.this,
                        getResources().getText(R.string.menu_fav),
                        Toast.LENGTH_SHORT)
                     .show();
                break;
            }
            case R.id.menu_home:{
                Toast.makeText(MainActivity.this,
                        getResources().getText(R.string.menu_home),
                        Toast.LENGTH_SHORT)
                        .show();
                break;
            }
            case R.id.menu_loc:{
                Toast.makeText(MainActivity.this,
                        getResources().getText(R.string.menu_loc),
                        Toast.LENGTH_SHORT)
                        .show();
                break;
            }
        }
        return true;
    }
}
