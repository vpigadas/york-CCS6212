package eu.york.course.mvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.ArrayList;
import java.util.List;

public class MvvmViewmodel extends AndroidViewModel {

    private List<MVVMModel> arrayData = new ArrayList<>();
    private MvvmAdapter adapter;
    private MutableLiveData<MvvmAdapter> streamAdapter;

    public MvvmViewmodel(@NonNull Application application) {
        super(application);
        adapter = new MvvmAdapter(arrayData);
        streamAdapter = new MutableLiveData<>();
    }

    public void observeStream(LifecycleOwner owner, Observer<MvvmAdapter> observer) {
        streamAdapter.observe(owner, observer);
    }

    public void removeObservers(LifecycleOwner owner) {
        streamAdapter.removeObservers(owner);
    }

    public void populate() {
        arrayData.add(new MVVMModel("Vassilis", 100));
        arrayData.add(new MVVMModel("Markos", 100));
        arrayData.add(new MVVMModel("Vassilis", 100));
        arrayData.add(new MVVMModel("Markos", 100));
        arrayData.add(new MVVMModel("Markos", 100));

        adapter = new MvvmAdapter(arrayData);
        streamAdapter.postValue(adapter);
    }

    public void clearList() {
        arrayData.clear();

        adapter = new MvvmAdapter(arrayData);
        streamAdapter.postValue(adapter);
    }
}
