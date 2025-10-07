package com.example.fooddelivery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ----- Toolbar -----
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(""); // tiêu đề ở giữa đã là TextView trong XML
        }
        // nút back trên toolbar -> quay lại ProfileActivity
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onBackPressed(); // hoặc finish();
            }
        });

        // ----- Nút bắt đầu đặt hàng -----
        Button btnStartOrder = findViewById(R.id.btnStartOrder);
        btnStartOrder.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                // TODO: mở màn tạo đơn nếu có (CreateOrderActivity)
                // startActivity(new Intent(MainActivity.this, CreateOrderActivity.class));
                // Tạm thời quay lại Profile:
                finish();
            }
        });
    }
}