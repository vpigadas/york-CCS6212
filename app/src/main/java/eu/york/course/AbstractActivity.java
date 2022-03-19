package eu.york.course;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class AbstractActivity extends AppCompatActivity {

    abstract int getLayoutReference();

    abstract void startOperations();

    protected void stopOperations(){
        Log.d("MESSAGE","");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutReference());
    }

    @Override
    protected void onResume() {
        super.onResume();
        startOperations();
    }

    @Override
    protected void onPause() {
        stopOperations();
        super.onPause();
    }
}
