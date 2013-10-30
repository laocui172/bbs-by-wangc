package com.example.bbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.bbs.zol.IndexZolActivity;

public class IndexActivity extends Activity {
    /** Called when the activity is first created. */

    EditText editText;
    int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        editText = (EditText) findViewById(R.id.editText);

        /*//第一种方式的监听
        Button btType = (Button) findViewById(R.id.btZol);
        btType.setOnClickListener(listener);*/
    }

    /*//第一种方式监听
    Button.OnClickListener listener = new Button.OnClickListener(){//创建监听对象
        public void onClick(View v){
            i++;
            String strTmp = "第"+i+"次点击了Button";
            editText.setText(strTmp);
        }
    };*/


    //第二种方式的监听 在mail.xml注册监听事件
    public void btZolOnClick(View v){
        i++;
        String strTmp = "第"+i+"次点击了Button(zol)";
        editText.setText(strTmp);

        Intent intent = new Intent();
        intent.putExtra("键值对名","要传的值");//向目的Activity传值，不传值时不用写
        intent.setClass(IndexActivity.this, IndexZolActivity.class);
        IndexActivity.this.startActivity(intent);
//        this.finish();//注销第一页，可以不用

    }

    //在twoActivity中取值：
    //Intent intent = getIntent();
    //String value = intent.getStringExtra("键值对名");

    //第二种方式的监听 在mail.xml注册监听事件
    public void btFengNiaoOnClick(View v){
        i++;
        String strTmp = "第"+i+"次点击了Button(fengniao)";
        editText.setText(strTmp);
    }
}
