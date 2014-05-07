package com.vaclav.kuba.testing.firstdialog.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showDialog = (Button) findViewById(R.id.showDialog);
        final Activity activity = this;
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HUDRY HUDRY HUDRY", Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("HUDRY");
                builder.setTitle("Party");
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "YOLO FULL SWAG", Toast.LENGTH_LONG).show();
                    }

                });
                builder.show();
            }
        });
    }




}
