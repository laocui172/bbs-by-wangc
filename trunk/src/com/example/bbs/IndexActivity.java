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

        //��һ�ַ�ʽ�ļ���
        Button btType = (Button) findViewById(R.id.btZol);
        btType.setOnClickListener(listener);
    }

    //��һ�ַ�ʽ����
    Button.OnClickListener listener = new Button.OnClickListener(){//������������
        public void onClick(View v){
            i++;
            String strTmp = "��"+i+"�ε����Button";
            editText.setText(strTmp);
        }
    };


    //�ڶ��ַ�ʽ�ļ��� ��mail.xmlע������¼�
    public void btFengNiaoOnClick(View v){
        i++;
        String strTmp = "��"+i+"�ε����Button";
        editText.setText(strTmp);
    }
}
