package com.example.number_type;

import static com.example.number_type.R.id.Result_View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rand_num ;
    TextView rand_txt, Result_view, right_view, wrong_view,result, wrong, right;
    int random, num;
    Button odd,even,prime;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand_txt = findViewById(R.id.Random_num);
        Result_view = findViewById(Result_View);
        right_view = findViewById(R.id.Right_view);
        wrong_view = findViewById(R.id.Wrong_view);
        result = findViewById(Result_View);
        wrong = findViewById(R.id.EVEN_Score2);
        right = findViewById(R.id.EVEN_Score);
        odd = findViewById(R.id.button);
        odd.setBackgroundColor(Color.RED);
        odd.setTextColor(Color.BLACK);

        right.setTextColor(Color.GREEN);
        wrong.setTextColor(Color.RED);
        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (random % 2 != 0)
                {
                    Result_view.setText("SUCCESS");
                    Result_view.setTextColor(Color.GREEN);
                    Success_Increment();
                }
                else
                {
                    Result_view.setText("FAILURE");
                    Result_view.setTextColor(Color.RED);
                    Failure_Increment();
                }
                generate_rand_no();
            }
        });
        even = findViewById(R.id.button2);
        even.setBackgroundColor(Color.YELLOW);
        even.setTextColor(Color.BLACK);
        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (random % 2 == 0)
                {
                    Result_view.setText("SUCCESS");
                    Result_view.setTextColor(Color.GREEN);
                    Success_Increment();
                }
                else
                {
                    Result_view.setText("FAILURE");
                    Result_view.setTextColor(Color.RED);
                    Failure_Increment();
                }
                generate_rand_no();
            }
        });
        prime = findViewById(R.id.button3);
        prime.setBackgroundColor(Color.GREEN);
        prime.setTextColor(Color.BLACK);
        prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPrime(random))
                {
                    Result_view.setText("SUCCESS");
                    Result_view.setTextColor(Color.GREEN);
                    Success_Increment();
                }
                else
                {
                    Result_view.setText("FAILURE");
                    Result_view.setTextColor(Color.RED);
                    Failure_Increment();
                }
                generate_rand_no();
            }
        });
        generate_rand_no();
    }

    public void Success_Increment()
    {
        num = Integer.parseInt((String) right_view.getText());
        num = num + 1;
        right_view.setText(Integer.toString(num));
    }
    public void Failure_Increment()
    {
        num = Integer.parseInt((String) wrong_view.getText());
        num = num + 1;
        wrong_view.setText(Integer.toString(num));
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }




    @SuppressLint("SetTextI18n")
    public void generate_rand_no()
    {
        Random rand = new Random();
        rand_num = rand.nextInt(50);
        rand_txt.setText(Integer.toString(rand_num));
        random = rand_num;
    }
}