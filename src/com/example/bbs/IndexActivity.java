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

        /*//��һ�ַ�ʽ�ļ���
        Button btType = (Button) findViewById(R.id.btZol);
        btType.setOnClickListener(listener);*/
    }

    /*//��һ�ַ�ʽ����
    Button.OnClickListener listener = new Button.OnClickListener(){//������������
        public void onClick(View v){
            i++;
            String strTmp = "��"+i+"�ε����Button";
            editText.setText(strTmp);
        }
    };*/


    //�ڶ��ַ�ʽ�ļ��� ��mail.xmlע������¼�
    public void btZolOnClick(View v){
        i++;
        String strTmp = "��"+i+"�ε����Button(zol)";
        editText.setText(strTmp);

        Intent intent = new Intent();
        intent.putExtra("��ֵ����","Ҫ����ֵ");//��Ŀ��Activity��ֵ������ֵʱ����д
        intent.setClass(IndexActivity.this, IndexZolActivity.class);
        IndexActivity.this.startActivity(intent);
//        this.finish();//ע����һҳ�����Բ���

    }

    //��twoActivity��ȡֵ��
    //Intent intent = getIntent();
    //String value = intent.getStringExtra("��ֵ����");

    //�ڶ��ַ�ʽ�ļ��� ��mail.xmlע������¼�
    public void btFengNiaoOnClick(View v){
        i++;
        String strTmp = "��"+i+"�ε����Button(fengniao)";
        editText.setText(strTmp);
    }
}
