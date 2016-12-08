package com.appbuilder.rockband4statistics;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button whats1 = (Button)findViewById(R.id.t1);
        Button whats2 = (Button)findViewById(R.id.t2);

        whats1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WhatsApp what = new WhatsApp();
                what.sendMessage("Te amo", Splash.this);
            }
        });
    }

    public void sendWhatsAppMessage( String messsage ) {}
}
