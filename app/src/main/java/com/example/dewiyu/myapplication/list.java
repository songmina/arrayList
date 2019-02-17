package com.example.dewiyu.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class list extends AppCompatActivity {
    TextView textView[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        PrintView();

    }

        public void PrintView(){

            TableLayout tableLayout = (TableLayout) findViewById(R.id.Table_Layout);

            textView = new TextView[Global_variable.Student.size()];
            for (int i = 0; i < Global_variable.Student.size(); i++) {

                textView[i] = new TextView(this);
                textView[i].setText(i+1+"              " + Global_variable.Student.get(i).getName());
                textView[i].setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.MATCH_PARENT
                ));
                tableLayout.addView(textView[i]);
            }
        }
    }
