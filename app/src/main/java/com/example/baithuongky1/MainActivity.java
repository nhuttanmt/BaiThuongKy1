package com.example.baithuongky1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtten,edtmk;
    Button btndn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertdialog();
            }
        });


        }
    private void Anhxa(){
        edtten = (EditText) findViewById(R.id.editText);
        edtmk = (EditText) findViewById(R.id.editText2);
        btndn = (Button) findViewById(R.id.button);
    }
    private void alertdialog(){
        AlertDialog.Builder al = new AlertDialog.Builder(this);
        al.setTitle("Thông báo");
        al.setMessage("Bạn có muốn đăng nhập không");
        al.setPositiveButton("có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
            }
        });
        al.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Bạn đã chọn không đăng nhập", Toast.LENGTH_SHORT).show();
            }
        });
        al.show();
    }
}
