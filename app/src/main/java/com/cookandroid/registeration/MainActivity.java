package com.cookandroid.registeration;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticeListView=(ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        noticeList.add(new Notice("공지사항입니다.","수현이", "2019-12-08"));
        adapter = new NoticeListAdapter(getApplicationContext(), noticeList);
        noticeListView.setAdapter(adapter);

        final Button courseButton=(Button) findViewById(R.id.courseButton);
        final Button statisticButton=(Button) findViewById(R.id.statisticButton);
        final Button scheduleButton=(Button) findViewById(R.id.shceduleButton);
        final LinearLayout notice=(LinearLayout)findViewById(R.id.notice);

        courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);//공지사항부분이 보이지 않도록, fragment로 바꿔줄수 있게
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CourseFragment());
                fragmentTransaction.commit();
            }
        });

        statisticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);//공지사항부분이 보이지 않도록, fragment로 바꿔줄수 있게
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new StatisticFragment());
                fragmentTransaction.commit();
            }
        });

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);//공지사항부분이 보이지 않도록, fragment로 바꿔줄수 있게
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ScheduleFragment());
                fragmentTransaction.commit();
            }
        });
    }
}
