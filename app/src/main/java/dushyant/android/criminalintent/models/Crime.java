package dushyant.android.criminalintent.models;

import java.util.UUID;

/**
 * Created by Dushyant Singh Shekhawat on 19-06-2016.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate Unique Identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {

        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
