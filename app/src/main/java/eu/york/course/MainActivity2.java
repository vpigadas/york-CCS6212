package eu.york.course;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import eu.york.course.json.ResponseJson;

public class MainActivity2 extends AbstractActivity {
    private String TAG = "MainActivity2";

    @Override
    int getLayoutReference() {
        return R.layout.activity_main2;
    }

    @Override
    void startOperations() {

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        String url = "https://tv-zapping.herokuapp.com/v2/tv";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, response);

                ResponseJson json = new Gson().fromJson(response, ResponseJson.class);

                if (json == null) {
                    Log.d(TAG, "empy esponse");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, error.getLocalizedMessage());
            }
        });

        requestQueue.add(stringRequest);


    }
}