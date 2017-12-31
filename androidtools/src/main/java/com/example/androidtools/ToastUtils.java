package com.example.androidtools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by admin on 2017/12/30.
 */

public class ToastUtils {
    private static Toast TOAST;
    private static final String TAG = "ToastUtil";


    public static void show(Context context, int resourceID) {
        show(context, resourceID, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, String text) {
        show(context, text, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, Integer resourceID, int duration) {
        String text = context.getResources().getString(resourceID);
        show(context, text, duration);
    }

    public static void show(final Context context, final String text, final int duration) {
        if (TOAST == null) {
            TOAST = Toast.makeText(context, text, duration);
        } else {
            TOAST.setText(text);
            TOAST.setDuration(duration);
        }
        TOAST.show();
    }

}
