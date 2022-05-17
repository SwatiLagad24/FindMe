package com.example.findme;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends Dialog {


    private Button btnSignIn;
    private EditText edtUsername;
    private EditText edtPassword;
    private ProgressDialog progressDialog;

 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);*/
    public LoginActivity(Context context)
    {
        super(context);
        setContentView(R.layout.login_fragment);


        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnSignIn=findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edtUsername.getText().toString().equals("swati")&& edtPassword.getText().toString().equals("123"))
                {
                    progressDialog=new ProgressDialog(getContext());
                    progressDialog.setTitle("");
                    progressDialog.setProgress(10);
                    progressDialog.setMax(100);
                    progressDialog.setMessage("Loading data");
                    // new ProgressCheck.execute();
                    progressDialog.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progressDialog.dismiss();
                        }
                    }, 4000);





                    dismiss();
                }
                else
                {
                    Toast.makeText(getContext(), "Login Failed", Toast.LENGTH_SHORT).show();

                }


            }
        });




    }
}
