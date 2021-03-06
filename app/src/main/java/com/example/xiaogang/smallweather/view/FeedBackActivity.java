package com.example.xiaogang.smallweather.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xiaogang.smallweather.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FeedBackActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_feed_back_activity) ImageView mBack;
    @BindView(R.id.edtFeedbackActivityFeedback) EditText mEditText;
    @BindView(R.id.textView) TextView mSubmit;
    private String feedbackValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_feed_back_activity)
    public void backClick() {
        finish();
    }

    @OnClick(R.id.llFeedbackActivityCommit)
    public void submitClick() {
        feedbackValue = mEditText.getText().toString();
        Intent mIntent = new Intent(Intent.ACTION_VIEW);
        mIntent.putExtra("address", "18800176200");
        mIntent.putExtra("sms_body", feedbackValue);
        mIntent.setType("vnd.android-dir/mms-sms");
        startActivity(mIntent);
    }
}
