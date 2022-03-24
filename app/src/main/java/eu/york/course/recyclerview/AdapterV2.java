package eu.york.course.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import eu.york.course.R;

public class AdapterV2 extends ListAdapter<String, BaseHolder> {

    protected AdapterV2() {
        super(new DiffUtilsItem());
    }

    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        switch (viewType) {
            case R.layout.holder_item: {
                return new Holder(view);
            }
            case R.layout.holder_item_v2: {
                return new Holderv2(view);
            }
            default: {
                return new Holder(view);
            }
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {
        String item = getItem(position);
        holder.bind(item);
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 4 == 0) {
            return R.layout.holder_item;
        } else {
            return R.layout.holder_item_v2;
        }
    }
}
