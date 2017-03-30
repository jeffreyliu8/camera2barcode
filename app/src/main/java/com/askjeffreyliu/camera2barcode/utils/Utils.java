package com.askjeffreyliu.camera2barcode.utils;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.google.android.gms.common.images.Size;

import java.util.ArrayList;

public class Utils {

    public static int getScreenHeight(Context c) {
        WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.y;
    }

    public static int getScreenWidth(Context c) {
        WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }

    public static float getScreenRatio(Context c) {
        DisplayMetrics metrics = c.getResources().getDisplayMetrics();
        return ((float) metrics.heightPixels / (float) metrics.widthPixels);
    }

    public static int getScreenRotation(Context c) {
        WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getRotation();
    }


    public static Size[] sizeToSize(android.util.Size[] sizes) {
        Size[] size = new Size[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            size[i] = new Size(sizes[i].getWidth(), sizes[i].getHeight());
        }
        return size;
    }

    public static Rect createRect(ArrayList<Point> list, boolean isQRcode) {
        if (list == null || list.size() < 3)
            return null;
        int left = list.get(0).x;
        int right = list.get(0).x;
        int top = list.get(0).y;
        int bottom = list.get(0).y;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).x < left) {
                left = list.get(i).x;
            }
            if (list.get(i).x > right) {
                right = list.get(i).x;
            }
            if (list.get(i).y < top) {
                top = list.get(i).y;
            }
            if (list.get(i).y > bottom) {
                bottom = list.get(i).y;
            }
        }

        if (isQRcode) {
            float scaleFactor = 1.5f;
            int midHoz = (right + left) / 2;
            int distanceHozHalf = (right - left) / 2;
            int midVer = (bottom + top) / 2;
            int distanceVerHalf = (top - bottom) / 2;
            right = midHoz + (int) (distanceHozHalf * scaleFactor);
            left = midHoz - (int) (distanceHozHalf * scaleFactor);
            top = midVer + (int) (distanceVerHalf * scaleFactor);
            bottom = midVer - (int) (distanceVerHalf * scaleFactor);
        }
        Rect result = new Rect(left, top, right, bottom);
        result.bottom = bottom;
        result.top = top;
        result.left = left;
        result.right = right;
        return result;
    }
}