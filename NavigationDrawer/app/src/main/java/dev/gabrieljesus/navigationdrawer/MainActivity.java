package dev.gabrieljesus.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.menu_inbox : {
                Toast.makeText(this,"Inbox", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_favoritos : {
                Toast.makeText(this,"Favoritos", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_sent_email : {
                Toast.makeText(this,"Emails enviados", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_trash : {
                Toast.makeText(this,"Lixeira", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_spam: {
                Toast.makeText(this,"Spam", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}