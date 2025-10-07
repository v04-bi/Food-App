package com.example.fooddelivery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ----- Toolbar -----
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(""); // tiêu đề đang là TextView trong XML
        }
        // nút back trên toolbar
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onBackPressed(); // hoặc finish();
            }
        });

        // ----- Button “Bắt đầu đặt hàng” -----
        Button btnStartOrder = findViewById(R.id.btnStartOrder);
        btnStartOrder.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                // TODO: chuyển tới màn chọn món / trang chủ đặt hàng của bạn
                // Ví dụ: ProductListActivity (đổi bằng activity thực tế của bạn)
                // startActivity(new Intent(OrderActivity.this, ProductListActivity.class));

                // Tạm thời quay lại màn trước nếu chưa có màn chọn món
                finish();
            }
        });

    }
}