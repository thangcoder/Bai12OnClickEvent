package com.thangcoder.bai12onclickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnResult;
    private EditText edtNumberA;
    private EditText edtNumberB;
    private  int numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button) findViewById(R.id.btn_result);
        edtNumberA = (EditText) findViewById(R.id.edt_numberA);
        edtNumberB = (EditText) findViewById(R.id.edt_numberB);

        btnResult.setOnClickListener(this);
//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!edtNumberA.getText().toString().isEmpty() && !edtNumberB.getText().toString().isEmpty()){
//                    numberA = Integer.parseInt(edtNumberA.getText().toString());
//                    numberB = Integer.parseInt(edtNumberB.getText().toString());
//
//                    Toast.makeText(MainActivity.this, "Kết quả của "+numberA +" + "+numberB+" là :" +(numberA+numberB),
//                            Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập vào số hợp lệ", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Đây là sự kiện LongClickListener", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_result:
                if(!edtNumberA.getText().toString().isEmpty() && !edtNumberB.getText().toString().isEmpty()){
                    numberA = Integer.parseInt(edtNumberA.getText().toString());
                    numberB = Integer.parseInt(edtNumberB.getText().toString());

                    Toast.makeText(MainActivity.this, "Kết quả của "+numberA +" + "+numberB+" là :" +(numberA+numberB),
                            Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập vào số hợp lệ", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;

        }
    }
}
