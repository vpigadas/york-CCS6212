package eu.york.course.mvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import eu.york.course.R;

public class MvvmAdapter extends RecyclerView.Adapter<MvvmHolder> {

    private List<MVVMModel> arrayData = new ArrayList<>();

    public MvvmAdapter(List<MVVMModel> arrayData) {
        this.arrayData = arrayData;
    }

    @NonNull
    @Override
    public MvvmHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item, parent, false);

        return new MvvmHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MvvmHolder holder, int position) {
        MVVMModel item = arrayData.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayData.size();
    }
}
