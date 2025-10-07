package com.example.fooddelivery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.card.MaterialCardView;

public class ProfileActivity extends AppCompatActivity {
    private MaterialCardView cardHistory, cardPayment, cardOffers;
    private Button btnUpdate;
    private TextView tvChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ----- Toolbar -----
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
        }
        toolbar.setNavigationOnClickListener(v -> finish());

        cardHistory = findViewById(R.id.cardHistory);
        cardPayment = findViewById(R.id.cardPayment);
        cardOffers  = findViewById(R.id.cardOffers);
        btnUpdate   = findViewById(R.id.btnUpdate);
        tvChange    = findViewById(R.id.tvChange);

        // ----- Set Click Events -----

        // 1. Chuyển sang màn Lịch sử đặt hàng
        cardHistory.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 2. Các card khác (chưa có màn thì để trống hoặc toast)
        cardPayment.setOnClickListener(v -> {
            // TODO: mở màn phương thức thanh toán
        });

        cardOffers.setOnClickListener(v -> {
            // TODO: mở màn ưu đãi
        });

        // 3. Nút cập nhật thông tin
        btnUpdate.setOnClickListener(v -> {
            // TODO: mở màn cập nhật thông tin cá nhân
        });

        // 4. Thay đổi thông tin
        tvChange.setOnClickListener(v -> {
            // TODO: mở màn thay đổi mật khẩu hoặc thông tin
        });
    }
}