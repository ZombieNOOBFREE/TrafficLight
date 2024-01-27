package ru.example.trafficlight;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout b_1, b_2, b_3;
    private Button btn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1 = findViewById(R.id.bulb_1);
        b_2 = findViewById(R.id.bulb_2);
        b_3 = findViewById(R.id.bulb_3);
        btn = findViewById(R.id.btnStr);
    }

    public void onClickStr(View view) {
    }
}