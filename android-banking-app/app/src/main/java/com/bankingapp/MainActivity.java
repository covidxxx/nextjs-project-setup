package com.bankingapp;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Initialize the UI components
        initializeViews();
    }
    
    private void initializeViews() {
        // This method can be used to initialize any UI components
        // For now, we're keeping it simple with just the static layout
        
        // Future enhancements can be added here:
        // - Click listeners for buttons
        // - Dynamic balance updates
        // - Navigation between sections
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
