package com.lansum.lansumhh.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lansum.lansumhh.R;
import com.lansum.lansumhh.http.Constants;
import com.lansum.lansumhh.webview.WebViewController;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    @BindView(R.id.login_web_view)
    WebViewController loginWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        Log.e(TAG, "onCreate: ffffff" );
        loginWebView.loadUrl(Constants.urlHostBase + Constants.urlLogIn);
    }
}
