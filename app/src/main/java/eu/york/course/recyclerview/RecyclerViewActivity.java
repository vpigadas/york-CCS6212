package eu.york.course.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import eu.york.course.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<String> dataList = new ArrayList<>();
    private AdapterV2 adapter = new AdapterV2();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        dataList.add("");

        RecyclerView view = findViewById(R.id.recyclerView);
        view.setAdapter(new Adapter(dataList, this));

        dataList.add("");

        view.setAdapter(adapter);

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        List data = new ArrayList<String>();
        data.add("");

        adapter.submitList(data);
    }
}