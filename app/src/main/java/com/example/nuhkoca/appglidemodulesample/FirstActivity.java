package com.example.nuhkoca.appglidemodulesample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.nuhkoca.appglidemodulesample.databinding.ActivityFirstBinding;
import com.example.nuhkoca.appglidemodulesample.module.GlideApp;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityFirstBinding activityFirstBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityFirstBinding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        final String url = "https://source.unsplash.com/random";

        GlideApp.with(this)
                .asBitmap()
                .load(url)
                .into(activityFirstBinding.ivImage1);

        activityFirstBinding.ivImage1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Activity First is active", Toast.LENGTH_LONG).show();
    }
}
