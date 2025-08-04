package com.bankingapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ScanActivity extends Activity {
    
    private LinearLayout payButton;
    private LinearLayout receiveButton;
    private TextView payText;
    private TextView receiveText;
    private Button showQrButton;
    private LinearLayout scanFromGalleryButton;
    private View closeButton;
    
    // Content areas
    private RelativeLayout cameraArea;
    private View receiveArea;
    
    // Receive mode buttons
    private Button shareButton;
    private Button enterAmountButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        
        initializeViews();
        setupClickListeners();
        
        // Start in PAY mode by default
        selectPayMode();
    }
    
    private void initializeViews() {
        // Toggle buttons
        payButton = findViewById(R.id.pay_button);
        receiveButton = findViewById(R.id.receive_button);
        
        // Get text views inside the buttons for styling
        payText = (TextView) payButton.getChildAt(0);
        receiveText = (TextView) receiveButton.getChildAt(0);
        
        // Other controls
        showQrButton = findViewById(R.id.show_qr_button);
        scanFromGalleryButton = findViewById(R.id.scan_from_gallery);
        closeButton = findViewById(R.id.close_button);
        
        // Content areas
        cameraArea = findViewById(R.id.camera_area);
        receiveArea = findViewById(R.id.receive_area);
        
        // Receive mode buttons
        shareButton = findViewById(R.id.share_button);
        enterAmountButton = findViewById(R.id.enter_amount_button);
    }
    
    private void setupClickListeners() {
        // Close button - go back to main activity
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close this activity and return to MainActivity
            }
        });
        
        // Pay button - switch to pay mode
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPayMode();
            }
        });
        
        // Receive button - switch to receive mode
        receiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectReceiveMode();
            }
        });
        
        // Show QR Code button (placeholder functionality)
        if (showQrButton != null) {
            showQrButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Placeholder - could show user's QR code
                }
            });
        }
        
        // Scan from Gallery button (placeholder functionality)
        if (scanFromGalleryButton != null) {
            scanFromGalleryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Placeholder - could open gallery to select QR image
                }
            });
        }
        
        // Receive mode buttons
        if (shareButton != null) {
            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Placeholder - could share QR code
                }
            });
        }
        
        if (enterAmountButton != null) {
            enterAmountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Placeholder - could open amount entry screen
                }
            });
        }
    }
    
    private void selectPayMode() {
        // Update button appearance to show PAY is selected
        payButton.setBackgroundColor(getResources().getColor(android.R.color.white));
        receiveButton.setBackgroundColor(getResources().getColor(R.color.background_light_gray));
        
        // Update text colors
        if (payText != null) {
            payText.setTextColor(getResources().getColor(R.color.text_black));
        }
        if (receiveText != null) {
            receiveText.setTextColor(getResources().getColor(R.color.text_gray));
        }
        
        // Show camera area, hide receive area
        cameraArea.setVisibility(View.VISIBLE);
        receiveArea.setVisibility(View.GONE);
    }
    
    private void selectReceiveMode() {
        // Update button appearance to show RECEIVE is selected
        receiveButton.setBackgroundColor(getResources().getColor(android.R.color.white));
        payButton.setBackgroundColor(getResources().getColor(R.color.background_light_gray));
        
        // Update text colors
        if (receiveText != null) {
            receiveText.setTextColor(getResources().getColor(R.color.text_black));
        }
        if (payText != null) {
            payText.setTextColor(getResources().getColor(R.color.text_gray));
        }
        
        // Show receive area, hide camera area
        cameraArea.setVisibility(View.GONE);
        receiveArea.setVisibility(View.VISIBLE);
    }
}
