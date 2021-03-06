package com.example.rahulthapar.e_qual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity8 extends AppCompatActivity {

    Button save_next_act8;
    RadioGroup radio1, radio2;
    RadioButton a1, b1,c1,a2,b2,c2;
    String data, choice1, choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");

        setContentView(R.layout.activity_8);
        
        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);

        a1 = (RadioButton) findViewById(R.id.answer1A_act8);
        b1 = (RadioButton) findViewById(R.id.answer1B_act8);
        c1 = (RadioButton) findViewById(R.id.answer1C_act8);

        a2 = (RadioButton) findViewById(R.id.answer2A_act8);
        b2 = (RadioButton) findViewById(R.id.answer2B_act8);
        c2 = (RadioButton) findViewById(R.id.answer2C_act8);
        
        save_next_act8 = (Button)findViewById(R.id.save_next_act8);
        save_next_act8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                saveChoice2();
                data = data + "#"+ choice1 + "#" + choice2;
                Toast.makeText(Activity8.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity8.this,Activity9.class);
                i.putExtra("data", data);

                startActivity(i);
            }
        });
    }
    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act8:
                choice1 = "1";
                break;
            case R.id.answer1B_act8:
                choice1 = "2";

                break;
            case R.id.answer1C_act8:

                choice1 = "3";
                break;

            
        }

    }
    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act8:
                choice2 = "1";
                break;
            case R.id.answer2B_act8:
                choice2 = "2";

                break;
            case R.id.answer2C_act8:

                choice2 = "3";
                break;

         
        }

    }
}
