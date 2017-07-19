package test.interview.com.interviewtest;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import test.interview.com.interviewtest.adapter.RecyclerDataAdapter;

public class SecondScreen extends BaseActivity {
    private RecyclerView mRecyclerView;
    private RecyclerDataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initilizeRecyclerView();

    }

    private void initilizeRecyclerView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        loadRecyclerView();
    }

    private void loadRecyclerView() {
        if (mDataModelArrayList != null) {
            mAdapter = new RecyclerDataAdapter(mDataModelArrayList);
            mRecyclerView.setAdapter(mAdapter);
        }
    }

}

