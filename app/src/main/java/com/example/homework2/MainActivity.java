package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    TextView tw;
    CheckBox cb;
    private Button btn_move;
    RadioButton rbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_move=(Button)findViewById(R.id.btnMove);
        rg=findViewById(R.id.radioGroup);
        tw=findViewById((R.id.textView2));
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showSelection();
            }
        });

    }
    public void showSelection(){
        int checked=rg.getCheckedRadioButtonId();
        rbt= findViewById(checked);
        cb=findViewById(R.id.checkBox);
        String text=rbt.getText().toString();
        if(cb.isChecked()){
            text+= " "+ cb.getText().toString();
        }
        cb=findViewById(R.id.checkBox2);
        if(cb.isChecked()){
            text+= " "+ cb.getText().toString();
        }
        cb=findViewById(R.id.checkBox3);
        if(cb.isChecked()){
            text+= " "+ cb.getText().toString();
        }
        cb=findViewById(R.id.checkBox4);
        if(cb.isChecked()){
            text+= " "+ cb.getText().toString();
        }

        //tw.setText(text);
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("text".toString(),text);
        startActivity(intent);
    }

}