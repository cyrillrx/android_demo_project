package com.cyrillrx.android.demo.cards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cyrillrx.android.demo.R;

/**
 * @author Cyril Leroux
 *         Created 11/12/2014.
 */
public class CardGridActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private GridLayoutManager layoutManager;

    private String[] dataSet = new String[]{
            "TOTO", "TATA", "TUTU",
            "TOTO", "TATA", "TUTU",
            "TOTO", "TATA", "TUTU",
            "TOTO", "TATA", "TUTU",
            "TOTO", "TATA", "TUTU",
            "TOTO", "TATA", "TUTU"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        recyclerView = findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // Use a grid manager
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        adapter = new CardAdapter(dataSet, CardAdapter.ScrollType.VERTICAL);
        recyclerView.setAdapter(adapter);
    }
}
