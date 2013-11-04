package com.example.bbs.zol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.example.bbs.R;

/**
 * @author: wangchao
 * Date: 13-10-30 ÏÂÎç4:20
 * Description: 
 */
public class IndexZolActivity  extends Activity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_zol);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        EditText editText = (EditText) findViewById(R.id.textZol);
        editText.setText(str);
    }
}
