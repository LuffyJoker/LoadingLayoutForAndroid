package com.peng.loadinglayoutforandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.peng.loadinglib.LoadingLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LoadingLayout loadingLayout = findViewById(R.id.loading_layout);

        // 通过这一行代码设置LoadingLayout的显示状态
//        loadingLayout.setViewState(LoadingLayout.VIEW_STATE_LOADING);

        // 点击重试，为默认提供的错误视图重试按钮点击事件，不使用默认视图，该监听无效
        loadingLayout.setOnRetryClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "123", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
