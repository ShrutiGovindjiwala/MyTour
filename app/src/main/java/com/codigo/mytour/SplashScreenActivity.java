package com.codigo.mytour;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView img;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        img=findViewById(R.id.main_logo);
        //   img=findViewById(R.id.start);
//    InputStream stream=null;
//        try {
//            stream=getAssets().open("animation.gif");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        GifWebView view=
        handler=new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {
        finish();
//        startActivity(new Intent(com.example.neeteducator.SplashScreenActivity.this,LoginActivity.class));
    }
},3000);
    }
}