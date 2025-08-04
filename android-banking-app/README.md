# MAE Banking App

A simple Android banking app interface built in Java that replicates the MAE Wallet design.

## Features

- **Header Section**: User greeting with profile, settings, notification, and login button
- **Wallet Card**: Displays MAE Wallet with phone number and balance
- **Quick Actions**: 8 banking service buttons (Secure2u, Insurance, Pay Bills, Transfer, etc.)
- **Featured Section**: Investment options with "NEW" badges
- **Bottom Navigation**: 5-tab navigation (Home, Accounts, Scan, Expenses, Apply)

## Project Structure

```
android-banking-app/
├── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── app/
    ├── build.gradle
    └── src/main/
        ├── java/com/bankingapp/
        │   └── MainActivity.java
        └── res/
            ├── drawable/
            │   └── ic_launcher.xml
            ├── layout/
            │   ├── activity_main.xml
            │   ├── header_section.xml
            │   ├── wallet_card.xml
            │   ├── quick_actions.xml
            │   ├── featured_section.xml
            │   └── bottom_navigation.xml
            └── values/
                ├── colors.xml
                ├── strings.xml
                └── styles.xml
```

## How to Build in AIDE

1. **Open AIDE app** on your Android device
2. **Create New Project** → Select "Android App"
3. **Replace the generated files** with the files from this project
4. **Build & Run** the project

### Alternative Method:
1. Copy the entire `android-banking-app` folder to your device
2. Open AIDE and select "Open Folder"
3. Navigate to the `android-banking-app` folder
4. Build and run the project

## Customization

### To Change the Balance:
Edit the balance in `app/src/main/res/values/strings.xml`:
```xml
<string name="balance">RM 73.13</string>
```

### To Change User Name:
Edit the user name in `app/src/main/res/values/strings.xml`:
```xml
<string name="user_name">Ayie</string>
```

### To Change Colors:
Modify colors in `app/src/main/res/values/colors.xml`:
```xml
<color name="primary_yellow">#FFD700</color>
```

## Technical Details

- **Minimum SDK**: Android 4.1 (API 16)
- **Target SDK**: Android 11 (API 30)
- **Language**: Java
- **Build Tool**: Gradle
- **Compatible with**: AIDE Android IDE

## Adding Custom Icons

### App Launcher Icon:
To add your custom app icon, place your PNG files in these folders:
```
app/src/main/res/
├── mipmap-mdpi/ic_launcher.png     (48x48 pixels)
├── mipmap-hdpi/ic_launcher.png     (72x72 pixels)
├── mipmap-xhdpi/ic_launcher.png    (96x96 pixels)
├── mipmap-xxhdpi/ic_launcher.png   (144x144 pixels)
└── mipmap-xxxhdpi/ic_launcher.png  (192x192 pixels)
```

**Icon Design Tips for Banking App:**
- Use yellow/gold colors to match the app theme
- Banking symbols work well (wallet, bank, currency)
- Keep design simple and readable at small sizes
- Square format with centered important elements

See `ICON_GUIDE.md` for detailed instructions.

## Notes

- This is a static UI implementation with no backend functionality
- All buttons and interactions are visual only
- The app is designed to match the original MAE Wallet interface
- Easy to customize and extend with additional features
- Icon folders are pre-created for easy customization

## Future Enhancements

- Add click listeners for buttons
- Implement navigation between sections
- Add animations and transitions
- Connect to backend services
- Add user authentication
