package com.example.findme;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {

  //  private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
              //  WindowManager.LayoutParams.FLAG_FULLSCREEN);

       // View decorView = getWindow().getDecorView();
        // Hide the status bar.
       // int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
      //  decorView.setSystemUiVisibility(uiOptions);

/*        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        final ProgressBar progressBar=new ProgressBar(this);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout linearLayout=findViewById(R.id.splashLayout);

        if(linearLayout!=null)
        {
            linearLayout.addView(progressBar);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int visible=(progressBar.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
                progressBar.setVisibility(visible);

        Intent intent=new Intent(splashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
            }
        }, 3000);

*/
        //hiding action bar and status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    // final  progressBar=findViewById(R.id.progressBar);
         ProgressBar progressBar=(ProgressBar)findViewById(R.id.progressBar);
         progressBar.setVisibility(View.VISIBLE);

        new loginTask().execute();
    }
    /*private class loginTask implements View.OnSystemUiVisibilityChangeListener{

        @Override
        public void onSystemUiVisibilityChange(int visibility) {

        }

        public void execute() {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    LoginActivity loginActivity=new LoginActivity(splashScreen.this);
                    loginActivity.show();

                }
            }, 3000);

            LoginActivity loginActivity=new LoginActivity(splashScreen.this);
            loginActivity.show();
        }
    }*/
   private class loginTask extends AsyncTask<Void,Void,Void>
    {



       // getSupportActionBar().hide();

        @Override
        protected void onPreExecute() {



        }

        @Override
        protected Void doInBackground(Void... voids) {



            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                   // LoginActivity loginActivity=new LoginActivity(splashScreen.this);
                    //loginActivity.show();
                    Intent intent=new Intent(splashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();



                }
            }, 3000);


        }
    }
}