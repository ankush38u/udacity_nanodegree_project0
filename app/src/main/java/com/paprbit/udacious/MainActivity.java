package com.paprbit.udacious;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.tv_capstone).setOnClickListener(this);
        findViewById(R.id.tv_libraryapp).setOnClickListener(this);
        findViewById(R.id.tv_scoresapp).setOnClickListener(this);
        findViewById(R.id.tv_spotify).setOnClickListener(this);
        findViewById(R.id.tv_xyz_reader).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.tv_xyz_reader:
                Toast.makeText(this,"Opening XYZ Reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_build_it_bigger:
                Toast.makeText(this,"Opening Build it Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_capstone:
                Toast.makeText(this,"Opening Capstone",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_libraryapp:
                Toast.makeText(this,"Opening Library App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_spotify:
                Toast.makeText(this,"Opening Spotify",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_scoresapp:
                Toast.makeText(this,"Opening Scores App",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
