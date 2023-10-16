package com.example.lab2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] sendData = new String[]{"Проверка", "передачи", "информации", "в", "вторую активность"};


    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, list_activity.class);
        Button button1 = findViewById(R.id.button);
        Bundle data = new Bundle();
        data.putStringArray("key", sendData);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtras(data);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ON PAUSE", "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ON RESUME", "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ON DESTROY", "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ON STOP", "Stop");
    }
}