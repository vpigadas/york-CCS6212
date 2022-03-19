package eu.york.course.json;

import java.util.List;
import java.util.Objects;

public class ResponseJson {
    private List<ChannelJson> channels;

    public List<ChannelJson> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelJson> channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseJson that = (ResponseJson) o;
        return Objects.equals(channels, that.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channels);
    }

    @Override
    public String toString() {
        return "ResponseJson{" +
                "channels=" + channels +
                '}';
    }
}
