package com.anyitrecruitment.vectorassets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivPic, ivPic1, ivPic2, ivPic3;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPic = findViewById(R.id.ivPic);
        ivPic1 = findViewById(R.id.ivPic1);
        ivPic2 = findViewById(R.id.ivPic2);
        ivPic3 = findViewById(R.id.ivPic3);

        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivPic.setImageResource(R.drawable.hand);
            }
        });

        ivPic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivPic.setImageResource(R.drawable.beach);
            }
        });

        ivPic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivPic.setImageResource(R.drawable.hand);
            }
        });

        ivPic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivPic.setImageResource(R.drawable.smile);
            }
        });
    }
}