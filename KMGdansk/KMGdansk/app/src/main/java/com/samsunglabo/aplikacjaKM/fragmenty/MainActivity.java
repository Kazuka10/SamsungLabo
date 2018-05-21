package com.samsunglabo.aplikacjaKM.fragmenty;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


//implement the interface OnNavigationItemSelectedListener in your activity class
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment

        loadFragment(new HomeFragment());
        //Intent map_intent = new Intent(this, MapActivity.class);  Michał Korpal: To nie może być jako defaultowo generowany widok przy starcie aplikacji. Musi być otwieranie
        // po kliknieciu na ikonke lub przycisk (przykład OnNavigationItemSelected)
        // Jeśli implementujesz nowa aktywnosć z mapą musisz ją dodać do android manifest zeby aplikacja ja widziala i sie nie crashowala.
        // Wystepuje pelno nieprawidlowosci (mozna sprawdzic w LOGCAT)
        // Ponaprawialem troche twoj kod na szybko,  wyswietla sie kontener na mape ze znacznikiem, lecz nie widac mapy. Trzeba nad tym posiedzieć jeszcze, żeby to zadziałało.
       // startActivity(map_intent);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.tab_favorites:
                fragment = new HomeFragment();
                break;

            case R.id.tab_nearby:
                fragment = new MapStationDetail();
                break;

            case R.id.tab_przystanki:
                fragment = new NotificationsFragment();
                break;

            case R.id.tab_linie:
                fragment = new ProfileFragment();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
