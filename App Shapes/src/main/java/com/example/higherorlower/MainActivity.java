package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int triangular_n(int x){
        return (((x)*(x + 1))/2);
    }
    public int rectangular_n(int x){
        return x*(x+1);
    }

    public void ClickFun(View view){


        EditText input=findViewById(R.id.input);
        String input_str=input.getText().toString();
        int input_int=Integer.parseInt(input_str);
        boolean triangular=false,rectangle=false;
        int i=0;

        while(i<input_int){
            if(triangular_n(i)==input_int){
                triangular=true;
            }
            i++;
        }
        i=0;
        while (i<input_int){
            if(rectangular_n(i)==input_int){
                rectangle=true;
            }
            i++;
        }

        if(rectangle&&triangular){
            Toast.makeText(this,"Both",Toast.LENGTH_SHORT).show();
        }else if(rectangle&&!triangular){
            Toast.makeText(this,"rectangular",Toast.LENGTH_SHORT).show();
        }else if(!rectangle&&triangular){
            Toast.makeText(this,"triangular",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Nothing",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}