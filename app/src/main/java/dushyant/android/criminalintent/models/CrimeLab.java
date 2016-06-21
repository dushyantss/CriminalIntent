package dushyant.android.criminalintent.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Dushyant Singh Shekhawat
 * on 20-06-2016.
 */
public enum CrimeLab {
    INSTANCE;

    private List<Crime> mCrimes;

    CrimeLab() {
        mCrimes = new ArrayList<>();
    }

    public static CrimeLab get(Context context) {
        return INSTANCE;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime :
                mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    public void addCrime(Crime crime){
        mCrimes.add(crime);
    }
}
