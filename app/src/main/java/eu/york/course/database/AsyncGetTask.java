package eu.york.course.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import java.util.List;

public class AsyncGetTask extends AsyncTask<String, Void, List<UserEntity>> {

    interface Listener {
        public void onResult(List<UserEntity> users);
    }

    private Context context;
    private Listener listener;

    public AsyncGetTask(Context context, Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    @Override
    protected List<UserEntity> doInBackground(String... voids) {

        AppInstance db = Room.databaseBuilder(context,
                AppInstance.class, "database-name").build();

        List<UserEntity> users = db.getUserDao().get();
        return users;
    }

    @Override
    protected void onPostExecute(List<UserEntity> userEntities) {
        super.onPostExecute(userEntities);
        listener.onResult(userEntities);
    }
}
