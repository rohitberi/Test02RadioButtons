package com.example.roberi.test02radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkbox1;
    CheckBox chkbox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkbox1 = (CheckBox) findViewById(R.id.chkBox1);
        chkbox2 = (CheckBox) findViewById(R.id.chkBox2);

        chkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkbox1.isChecked()){
                    Toast.makeText(MainActivity.this, "check box 1 CHECKED", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "check box 1 not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkbox2.isChecked()){
                    Toast.makeText(MainActivity.this, "check box 2 CHECKED", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "check box 2 not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
