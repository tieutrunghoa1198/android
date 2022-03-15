package com.example.shoeapp;

import android.content.Intent;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.shoeapp.R;
import com.example.shoeapp.login.Register;
import com.example.shoeapp.login.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tvRegister;
    Button btnSignIn;
    private List<User> listUsers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.listUsers.add(new User("tieuhoa", "tieuhoa"));
        this.listUsers.add(new User("tieuhoa2", "tieuhoa"));
        this.listUsers.add(new User("tieuhoa3", "tieuhoa"));
        this.listUsers.add(new User("tieuhoa4", "tieuhoa"));
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        this.btnSignIn = findViewById(R.id.btnSignIn);
        tvRegister = findViewById(R.id.tvRegister);

        /*
         * =============== START OF INTERACTING FUNCTIONS ===============
         *
         * */

        this.btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
                System.out.println("vao day nhe");
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "textt view component has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
                System.out.println("vao day nhe");
            }
        });

        /*
         * =============== END OF INTERACTING FUNCTIONS ===============
         *
         * */
    }
}



