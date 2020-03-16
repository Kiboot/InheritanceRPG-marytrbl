package sanoy.mcm.edu.ph.example.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent mainact = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainact);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
