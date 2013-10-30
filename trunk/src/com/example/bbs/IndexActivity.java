package com.example.bbs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IndexActivity extends Activity {
    /** Called when the activity is first created. */

    EditText editText;
    int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        editText = (EditText) findViewById(R.layout.main);

        //第一种方式的监听
        Button btType = (Button) findViewById(R.id.btZol);
        btType.setOnClickListener(listener);
    }

    //第一种方式监听
    Button.OnClickListener listener = new Button.OnClickListener(){//创建监听对象
        public void onClick(View v){
            i++;
            String strTmp = "第"+i+"次点击了Button";
            editText.setText(strTmp);
        }
    };


    //第二种方式的监听 在mail.xml注册监听事件
    public void btFengNiaoOnClick(View v){
        i++;
        String strTmp = "第"+i+"次点击了Button";
        editText.setText(strTmp);
    }
}
