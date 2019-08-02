package com.example.aplikasikaroseribis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText ePemesan;
    private EditText eJenis;
    private EditText eBody;
    private EditText eJumlah;
    private Button bCetak;
    private TextView tOutputpemesan;
    private TextView tOutputjenis;
    private TextView tOutputbody;
    private TextView tOutputjumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePemesan = findViewById(R.id.idpemesan);
        eJenis = findViewById(R.id.idjenis);
        eBody = findViewById(R.id.idbody);
        eJumlah = findViewById(R.id.idjumlah);
        bCetak = findViewById(R.id.idcetak);
        tOutputpemesan = findViewById(R.id.idoutputpemesan);
        tOutputjenis = findViewById(R.id.idoutputjenissasis);
        tOutputbody = findViewById(R.id.idoutputbody);
        tOutputjumlah = findViewById(R.id.idoutputjumlah);



        bCetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputPemesan = ePemesan.getText().toString();
        String inputJenis = eJenis.getText().toString();
        String inputBody = eBody.getText().toString();
        String inputJumlah = eJumlah.getText().toString();

        if (inputPemesan.length() == 0) {
            ePemesan.setError("Data tidak boleh kosong");
        } else {
            tOutputpemesan.setText(inputPemesan);
        }
        if (inputJenis.length() == 0) {
            eJenis.setError("Data tidak boleh kosong");
        } else {
            tOutputjenis.setText(inputJenis);
        }
        if (inputBody.length() == 0) {
            eBody.setError("Data tidak boleh kosong");
        } else {
            tOutputbody.setText(inputBody);
        }
        if (inputJumlah.length() == 0) {
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputjumlah.setText(inputJumlah);
        }
    }
}