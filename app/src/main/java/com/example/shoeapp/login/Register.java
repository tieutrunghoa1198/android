package com.example.shoeapp.login;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.shoeapp.R;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Register extends AppCompatActivity {
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerDays);
        Spinner spinnerMonths = (Spinner) findViewById(R.id.spinnerMonths);
        Spinner spinnerYears = (Spinner) findViewById(R.id.spinnerYears);

        this.btnRegister = findViewById(R.id.btnRegister);this.btnRegisterHandler(btnRegister);
        this.btnRegisterHandler(btnRegister);
        this.initDropDown(spinner, spinnerMonths, spinnerYears);
    }

    private void btnRegisterHandler(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    URL url = new URL("https://linken.tranduydat.com/prm/api/v1.0/product/images/?product_id=1");
                    HttpURLConnection con = (HttpURLConnection)url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void initDropDown(Spinner days, Spinner months, Spinner years) {
        // days
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        days.setAdapter(adapter);

        // months
        ArrayAdapter<CharSequence> adapterMonths = ArrayAdapter.createFromResource(this,
                R.array.months, android.R.layout.simple_spinner_item);
        adapterMonths.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        months.setAdapter(adapterMonths);

        // years
        ArrayAdapter<CharSequence> adapterYears = ArrayAdapter.createFromResource(this,
                R.array.years, android.R.layout.simple_spinner_item);
        adapterYears.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        years.setAdapter(adapterYears);
    }
}