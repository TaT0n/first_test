package ru.rsue.test.test;

import android.support.v4.app.Fragment;

/**
 * Created by TaTon on 28.02.2018.
 */

public class CrimeListActivity extends SingleFragmentActiviry {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}