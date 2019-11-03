package com.hencoder.hencoderpracticedraw1;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Utils {
    public static float dp2px(int value) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, Resources.getSystem().getDisplayMetrics());
    }

    public static int getScreenWidth() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return displayMetrics.widthPixels;
    }
}
