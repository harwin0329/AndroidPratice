package util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Utils {

    //获得手机像素密度
    public static float getSystemDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    //根据手机的像素密度 将 dp 转为 px
    public static int dp2px(Context context, float dp) {
        // 获取当前手机的像素密度
        return (int) (Utils.getSystemDensity(context) * dp + 0.5f);
    }

    //根据手机像素密度 将 px 转为 dp
    public static int px2dp(Context context, float px) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (px / Utils.getSystemDensity(context) + 0.5);
    }

    // 获得屏幕像素密度
    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    // 获得显示的逻辑密度。
    public static float getScreenDensity(Context context) {
        return Utils.getDisplayMetrics(context).density;
    }

    // 获得可用显示大小的绝对宽度(以像素为单位)。
    public static float getScreenWidthPixels(Context context) {
        return Utils.getDisplayMetrics(context).widthPixels;

    }

    // 获得可用显示大小的绝对高度(以像素为单位)。
    public static float getScreenHeightPixels(Context context) {
        return Utils.getDisplayMetrics(context).heightPixels;

    }


}
