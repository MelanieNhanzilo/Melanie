package mz.ac.isutc.i32.mt2.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ViewPage extends AppCompatActivity {
    private View viewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        viewPage=findViewById(R.id.viewpager);
    }
}