package a20180322.criminalintent;

import android.util.Log;

import java.util.Date;
import java.util.UUID;

/**
 * Created by WHY on 2018/3/22.
 */

public class Crime {
    private static final String TAG = "---Crime";
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        Log.d(TAG, "Crime() called");
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        Log.d(TAG, "getDate() called");
        return mDate;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public void setTitle(String title) {
        Log.d(TAG, "setTitle() called with: title = [" + title + "]");
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
