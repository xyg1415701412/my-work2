package com.example.pratice7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomeFragment homeFragment=new HomeFragment();
        FragmentManager fragmentManager= getSupportFragmentManager();
if (savedInstanceState==null){
    HomeFragment homeFragment1=new HomeFragment();
    FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
//    transaction.add(R.id.destHome,homeFragment1);
//    transaction.commit();
}
    }


}