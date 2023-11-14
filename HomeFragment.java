package com.example.pratice7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

public class HomeFragment  extends Fragment  {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_dest_home,container,false);
    }
public void onViewCreated(View view,@Nullable Bundle savedInstanceState){
    Button BtnCat=view.findViewById(R.id.Btncat);
    View.OnClickListener OCLCat=new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Navigation.findNavController(view).navigate(R.id.blankFragment2);
        }
    };
    BtnCat.setOnClickListener(OCLCat);
    Button BtnDog=view.findViewById(R.id.Btndog);
    View.OnClickListener OCLDog= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(view).navigate(R.id.nexttodog);
        }
    };
    BtnDog.setOnClickListener(OCLDog);
}

}

