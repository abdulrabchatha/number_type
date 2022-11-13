package com.example.number_type;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rand_num ;
    TextView rand_txt = (TextView) findViewById(R.id.Random_num);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate_rand_no();
    }

    private void generate_rand_no()
    {
        Random rand = new Random();
        rand_num = rand.nextInt(50);
        rand_txt.setText(Integer.toString(rand_num));

    }
}