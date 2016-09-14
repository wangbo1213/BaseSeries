package com.sunday.series.baseseries;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.sunday.series.baseseries.fragment.BaseFragment;
import com.sunday.series.baseseries.fragment.FirseFragment;
import com.sunday.series.baseseries.utils.FragmentTabUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @Bind(R.id.main_fragment_ly)
    LinearLayout fragmentLy;
    @Bind(R.id.main_group_ly)
    RadioGroup group;

    private FragmentManager manager;
    private List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initFragment();
    }

    private void initFragment() {
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new BaseFragment());
        fragmentList.add(new FirseFragment());
        new FragmentTabUtils(getSupportFragmentManager(),fragmentList,R.id.main_fragment_ly,group);
    }

}
