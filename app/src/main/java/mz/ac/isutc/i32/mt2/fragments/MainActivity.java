package mz.ac.isutc.i32.mt2.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private PagerAdapter pagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList < Fragment> fragments=new ArrayList<>();
        fragments.add(Fragment.instantiate(this, EsquerdaFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, CentroFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, DireitaFragment.class.getName()));

        pagerAdapter= new PageAdaptar (super.getSupportFragmentManager(),fragments);
        ViewPager viewPager= findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);
    }
}