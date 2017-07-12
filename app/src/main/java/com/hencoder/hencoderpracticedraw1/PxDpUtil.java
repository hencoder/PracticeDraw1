package com.hencoder.hencoderpracticedraw1;

import android.content.Context;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-11  15:18
 */

public class PxDpUtil {

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
