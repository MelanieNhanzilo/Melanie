package mz.ac.isutc.i32.mt2.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdaptar extends FragmentPagerAdapter {
    private final List <Fragment> fragments;
    public PageAdaptar(@NonNull FragmentManager fm, List fragments) {
        super(fm);
        this.fragments=fragments;
    }

    //   @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_page_adaptar);
//    }

    @NonNull
  //  @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}