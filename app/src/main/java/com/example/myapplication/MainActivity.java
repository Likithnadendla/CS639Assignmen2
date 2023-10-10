package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    TextView textView;
    int[] imageIds = {R.drawable.download, R.drawable.download1, R.drawable.download2};
    int currentIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView );
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imageIds[currentIndex]);
                imageView.setImageBitmap(bitmap);

                textView.setText(new StringBuilder().append("Changed image: ").append(currentIndex).toString());

                currentIndex++;
                if(currentIndex >= imageIds.length){
                    currentIndex = 0;
                }
            }
        });
    }

}