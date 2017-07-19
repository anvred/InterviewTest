package test.interview.com.interviewtest;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import test.interview.com.interviewtest.model.DataModel;

/**
 * Created by ashishkarnay on 7/19/17.
 */

public class BaseActivity extends AppCompatActivity {
    public static ArrayList<DataModel> mDataModelArrayList;

    public ArrayList<DataModel> getmDataModelArrayList() {
        return mDataModelArrayList;
    }

    public void setmDataModelArrayList(ArrayList<DataModel> mDataModelArrayList) {
        this.mDataModelArrayList = mDataModelArrayList;
    }
}