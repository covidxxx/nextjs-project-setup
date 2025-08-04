package com.bankingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    
    private LinearLayout scanButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Initialize the UI components
        initializeViews();
        setupClickListeners();
    }
    
    private void initializeViews() {
        // Find the scan button in bottom navigation
        scanButton = findViewById(R.id.scan_tab);
    }
    
    private void setupClickListeners() {
        // Set click listener for scan button
        if (scanButton != null) {
            scanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open scan activity
                    Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        // App is visible to user
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        // App is not visible to user
    }
}
