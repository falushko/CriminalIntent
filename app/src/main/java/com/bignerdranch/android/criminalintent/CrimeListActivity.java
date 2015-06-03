package com.bignerdranch.android.criminalintent;

import android.app.Fragment;

/**
 * Created by vladimir on 03.06.15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
