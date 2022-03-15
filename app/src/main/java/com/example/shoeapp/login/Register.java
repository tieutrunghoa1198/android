package com.example.shoeapp.login;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.shoeapp.R;
import com.example.shoeapp.login.model.ProductDAO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Register extends AppCompatActivity {
    Button btnRegister;
    TextView tvResult;
    EditText etUsername;
    EditText etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerDays);
        Spinner spinnerMonths = (Spinner) findViewById(R.id.spinnerMonths);
        Spinner spinnerYears = (Spinner) findViewById(R.id.spinnerYears);

        this.tvResult = findViewById(R.id.tvTestConnect);
        this.btnRegister = findViewById(R.id.btnRegister);
        this.etUsername = findViewById(R.id.etEmail);
        this.etPassword = findViewById(R.id.etPassword);

        this.btnRegisterHandler(btnRegister, etUsername, etPassword);
        this.initDropDown(spinner, spinnerMonths, spinnerYears);
    }

    /*
    * =============== INTERACTING FUNCTIONS ===============
    *
    * */

    private void btnRegisterHandler(Button btn, EditText etUsername, EditText etPassword){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Username: " + etUsername);
                System.out.println("Password: " + etPassword);
            }
        });
    }

//    private void createRequestProduct() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://linken.tranduydat.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        LogInService service = retrofit.create(LogInService.class);
//        /*
//         * @param id
//         *
//         * */
//        Call<List<ProductDAO>> call = service.getOneProduct("1");
//        call.enqueue(new Callback<List<ProductDAO>>() {
//            @Override
//            public void onResponse(Call<List<ProductDAO>> call, Response<List<ProductDAO>> response) {
//                if(!response.isSuccessful()) {
//                    System.out.println(response.code());
//                    return;
//                }
//
//                List<ProductDAO> listProduct = response.body();
//                for (ProductDAO product : listProduct) {
//                    System.out.println(product.getImage());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<ProductDAO>> call, Throwable t) {
//                tvResult.setText(t.getMessage());
//                System.out.println("fail");
//            }
//        });
//    }

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