package dushyant.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Dushyant Singh Shekhawat
 * on 20-06-2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
