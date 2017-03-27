package com.askjeffreyliu.camera2barcode;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

public class PermissionCheckActivity extends AppCompatActivity {

    private static final String REQUESTED_PERMISSION = Manifest.permission.CAMERA;
    private static final int MY_PERMISSIONS_REQUEST_READ_WIFI_ACCESS_POINT = 22; // A random number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_check);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tryGetPermissionAndExecuteTask();
    }

    private void tryGetPermissionAndExecuteTask() {
        // check if we have the permission
        if (ContextCompat.checkSelfPermission(this,
                REQUESTED_PERMISSION)
                != PackageManager.PERMISSION_GRANTED) {

            showSystemPermissionRequestWindow();
        } else { // we already have permission
            havePermissionAndContinue();
        }
    }

    private void showSystemPermissionRequestWindow() {
        // Should we show an explanation?
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                REQUESTED_PERMISSION)) {

            //textView.setText("Got rejected the first time, and now we need this permission again");
            // Show an explanation to the user *asynchronously* -- don't block
            // this thread waiting for the user's response! After the user
            // sees the explanation, try again to request the permission.
        }

        ActivityCompat.requestPermissions(this,
                new String[]{REQUESTED_PERMISSION},
                MY_PERMISSIONS_REQUEST_READ_WIFI_ACCESS_POINT);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_READ_WIFI_ACCESS_POINT: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                    // add your logic here
                    havePermissionAndContinue();
                }
            }
        }
    }

    private void havePermissionAndContinue() {
        startActivity(new Intent(this, CameraActivity.class));
        finish();
    }
}
