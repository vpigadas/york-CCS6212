package eu.york.course.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import eu.york.course.R;

public class Adapter extends RecyclerView.Adapter<Holder> {

    private List<String> arrayData = new ArrayList<>();
    private Context context;

    public Adapter(List<String> arrayData,Context context) {
        this.arrayData = arrayData;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.holder_item,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String item = arrayData.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayData.size();
    }
}
