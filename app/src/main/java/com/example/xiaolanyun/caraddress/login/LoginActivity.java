package com.example.xiaolanyun.caraddress.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.xiaolanyun.caraddress.R;
import com.example.xiaolanyun.caraddress.utils.ViewUtils;

/**
 * AUTHOR: Dream
 * DATE:  2018/1/18
 * FUNC: 用户登陆View层
 */

public class LoginActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewUtils.setStatusBar(this, getResources().getColor(R.color.toolBar));
        setContentView(R.layout.activity_login);
    }


}
