package com.haley.test.mywebtoon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View v) {
        Intent intent;
        String webtoon_url = null;

        switch(v.getId()) {
            case R.id.bt_daum_webtoon:
                webtoon_url = "http://m.webtoon.daum.net";
                break;
            case R.id.bt_naver_webtoon:
                webtoon_url = "http://m.comic.naver.com/webtoon/weekday.nhn";
                break;
        }

        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webtoon_url));
        startActivity(intent);

    }
}
