package com.example.utilizandoabas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import Fragment.EmAltaFragment;
import Fragment.HomeFragment;
import Fragment.IncricoesFragment;

public class MainActivity extends AppCompatActivity {
    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewpager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)

                .add("Home", HomeFragment.class)
                .add("Inscrições", IncricoesFragment.class)
                .add("Em Alta", EmAltaFragment.class)
                .create()

        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager( viewPager);

        /*
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
         */
    }
}