package com.example.logandmess;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button btnOk;
    Button btnCancel;

    private static String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG, "найдём наши вьюшки");
        textView = (TextView) findViewById(R.id.textView1);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        Log.d(TAG, "скармилваем нашему слушателю обьект которые будет выполнять действия после нажатия");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnOk:
                Log.i(TAG, "Нажата кнопка ок");
                Toast.makeText(this, "Дядя, нажата кнопка ОК!", Toast.LENGTH_SHORT).show();
                textView.setText("Нажата кнопка ОК");
                break;
            case R.id.btnCancel:
                Toast.makeText(this, "Дядя, нажата кнопка кенцел!", Toast.LENGTH_LONG).show();
                        textView.setText("Нажата кнопка канцел");
                break;

        }

    }

}
