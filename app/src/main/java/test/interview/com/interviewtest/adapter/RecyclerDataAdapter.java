package test.interview.com.interviewtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import test.interview.com.interviewtest.R;
import test.interview.com.interviewtest.model.DataModel;

/**
 * Created by ashishkarnay on 7/19/17.
 */

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.ViewHolder> {

    private ArrayList<DataModel> mUserDataList;

    public RecyclerDataAdapter(ArrayList<DataModel> androidList) {
        mUserDataList = androidList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.userName.setText(mUserDataList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mUserDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView userName, mTvVersion, mTvApi;

        public ViewHolder(View view) {
            super(view);

            userName = (TextView) view.findViewById(R.id.userName);

        }
    }
}
