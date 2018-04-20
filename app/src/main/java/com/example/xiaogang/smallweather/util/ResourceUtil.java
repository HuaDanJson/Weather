package com.example.xiaogang.smallweather.util;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;

public class ResourceUtil {

    public static int getColor(int colorResId) {
        return ContextCompat.getColor(BaseApplication.getmAppContext(), colorResId);
    }

    public static int getDimensionPixelSize(int dimenRes) {
        return BaseApplication.getmAppContext().getResources().getDimensionPixelSize(dimenRes);
    }

    public static String getString(int strResId) {
        return BaseApplication.getmAppContext().getString(strResId);
    }

    public static String getString(int strResId, Object... objects) {
        return String.format(getString(strResId), objects);
    }

    @Nullable
    public static Drawable getDrawable(int drawableResId) {
        if (drawableResId == 0) {
            return null;
        } else {
            return ContextCompat.getDrawable(BaseApplication.getmAppContext(), drawableResId);
        }
    }

    /**
     * 兼容5.0以下SVG显示在其他View上
     *
     * @param drawableResId
     */
    public static Drawable getSVGDrawable(int drawableResId) {
        Resources resources = BaseApplication.getmAppContext().getResources();
        Resources.Theme theme = BaseApplication.getmAppContext().getTheme();
        return VectorDrawableCompat.create(resources, drawableResId, theme);

    }

}
