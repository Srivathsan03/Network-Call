package com.srivathsan.testretrofit.view.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.srivathsan.testretrofit.R;
import com.srivathsan.testretrofit.network.response.shows.Response;
import com.srivathsan.testretrofit.network.response.shows.Results;
import com.srivathsan.testretrofit.network.response.shows.Show;
import com.srivathsan.testretrofit.network.rest.ApiClient;
import com.srivathsan.testretrofit.network.rest.ApiInterface;
import com.srivathsan.testretrofit.view.adapter.ShowsAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView rv;

    ShowsAdapter showsAdapter;
    List<Show> showList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        showsAdapter = new ShowsAdapter(showList);
        rv.setAdapter(showsAdapter);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<Response> call = apiInterface.getShows(2, 0);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(@NonNull Call<Response> call, @NonNull retrofit2.Response<Response> response) {
                Response r = response.body();
                Results results = r.getResults();
                showList = results.getShows();
                showsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(@NonNull Call<Response> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
