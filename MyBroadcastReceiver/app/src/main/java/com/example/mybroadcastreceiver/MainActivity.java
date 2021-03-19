package com.example.mybroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Viết xử lý cho button "Kiểm tra trạng thái kết nối internet"
    public void broadcastIntent(View v){
        boolean ret = Myreciever.isConnected();
        String msg;
        if(ret == true){
            msg = "network is connected";
        }else {
            msg =" network isn't connected";
        }
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
