package com.leo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.leo.databinding.ActivityShapeBinding;

public class ShapeActivity extends AppCompatActivity {
    ActivityShapeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_shape);
        binding.ShadowLayoutImage.setOnClickListener(v -> {
            binding.ShadowLayoutImage.setSelected(!binding.ShadowLayoutImage.isSelected());
        });
        binding.shadowLayoutBarLeft.setOnClickListener(v -> {
            finish();
        });

        binding.shadowLayoutSelect.setOnClickListener(v -> {
            binding.shadowLayoutSelect.setSelected(!binding.shadowLayoutSelect.isSelected());
        });

        binding.shadowLayoutBindView.setOnClickListener(v -> {
            binding.shadowLayoutBindView.setSelected(!binding.shadowLayoutBindView.isSelected());
        });
    }
}
