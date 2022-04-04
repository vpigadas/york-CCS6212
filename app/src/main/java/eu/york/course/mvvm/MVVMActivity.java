package eu.york.course.mvvm;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import eu.york.course.R;

public class MVVMActivity extends AppCompatActivity {

    private MvvmViewmodel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvmactivity);

        viewModel = new ViewModelProvider(this).get(MvvmViewmodel.class);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


    }

    @Override
    protected void onResume() {
        super.onResume();

        viewModel.observeStream(this, new Observer<MvvmAdapter>() {
                    @Override
                    public void onChanged(MvvmAdapter mvvmAdapter) {
                        RecyclerView recyclerView = findViewById(R.id.recyclerView);

                        recyclerView.setAdapter(mvvmAdapter);
                    }
                }
        );

        viewModel.populate();

    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.removeObservers(this);
    }
}