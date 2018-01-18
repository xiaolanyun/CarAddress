package com.example.xiaolanyun.caraddress.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.example.xiaolanyun.caraddress.R;

/**
 * AUTHOR: Dream
 * DATE:  2018/1/18
 * FUNC: View工具类
 */

public class ViewUtils {

    /**
     * 通过添加占位View的方式设置沉浸式状态栏，本方法在setContentView()前调用
     * @param activity 当前活动
     * @param color 颜色值
     */
    public static void setStatusBar(Activity activity,int color){
        ViewGroup contentView = activity.findViewById(android.R.id.content);
        View statusBar = new View(activity);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,getStatusBarHeight(activity));
        statusBar.setBackgroundColor(color);
        contentView.addView(statusBar,layoutParams);

    }

    /**
     * 求得当前系统状态栏高度
     * @param activity 当前活动
     * @return 当前状态栏高度
     */
    public static int getStatusBarHeight(Activity activity){
        int result =0;
        int resourseId = activity.getResources().getIdentifier("status_bar_height","dimen","android");
        if(resourseId > 0){
            result = activity.getResources().getDimensionPixelSize(resourseId);
        }
        return  result;
    }
}
