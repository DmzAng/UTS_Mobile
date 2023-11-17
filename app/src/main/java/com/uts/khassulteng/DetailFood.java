package com.uts.khassulteng;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailFood extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        ImageView photo = findViewById(R.id.imgDetail);
        TextView name = findViewById(R.id.DetailName);
        TextView desc = findViewById(R.id.DetailDesc);

        Bundle bundle = getIntent().getExtras();
        photo.setImageResource(bundle.getInt("photo"));
        name.setText(bundle.getString("name"));
        desc.setText(bundle.getString("desc"));
    }
}
