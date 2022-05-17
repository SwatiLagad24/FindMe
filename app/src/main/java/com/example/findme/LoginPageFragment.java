package com.example.findme;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginPageFragment extends Dialog {




    private Button btnSignIn;
    private EditText edtUsername;
    private EditText edtPassword;

    LoginPageFragment(Context context) {
        super(context);

        setContentView(R.layout.login_fragment);


        edtUsername=(EditText)findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        //edtPassword=(EditText).findViewById(R.id.edtPassword);
        btnSignIn=(Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edtUsername.getText().toString().equals("swati")&& edtPassword.getText().toString().equals("123"))
                {
                    Toast.makeText(getContext(), "Login Succesful", Toast.LENGTH_SHORT).show();
                    dismiss();                }
                else
                {
                    Toast.makeText(getContext(), "Login Failed", Toast.LENGTH_SHORT).show();

                }


            }
        });


    }
}
