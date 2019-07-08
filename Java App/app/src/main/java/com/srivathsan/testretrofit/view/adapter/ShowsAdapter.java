package com.srivathsan.testretrofit.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srivathsan.testretrofit.R;
import com.srivathsan.testretrofit.network.response.shows.Show;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowsAdapter extends RecyclerView.Adapter<ShowsAdapter.MyViewHolder> {

    private List<Show> showList;

    public ShowsAdapter(List<Show> showList) {
        this.showList = showList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_show, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        Show show = showList.get(i);
        holder.tvShow.setText(show.getShowName());
    }

    @Override
    public int getItemCount() {
        return showList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvShow)
        TextView tvShow;

        public MyViewHolder(@NonNull View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
