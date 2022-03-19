package eu.york.course.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ChannelJson {
    @SerializedName("shows") private List<ShowJson> movies;
    private String channelName;

    public List<ShowJson> getMovies() {
        return movies;
    }

    public void setMovies(List<ShowJson> movies) {
        this.movies = movies;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelJson that = (ChannelJson) o;
        return Objects.equals(movies, that.movies) && Objects.equals(channelName, that.channelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movies, channelName);
    }

    @Override
    public String toString() {
        return "ChannelJson{" +
                "movies=" + movies +
                ", channelName='" + channelName + '\'' +
                '}';
    }
}
