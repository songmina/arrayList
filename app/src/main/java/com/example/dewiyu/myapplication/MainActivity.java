package com.example.dewiyu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText)findViewById(R.id.Name);

        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Student student = new Student(name.getText().toString());
                Global_variable.Student.add(student);

                Intent intent = new Intent(MainActivity.this, list.class);
                startActivity(intent);
            }
        });

    }
}
