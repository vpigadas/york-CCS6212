package eu.york.course.json;

import java.util.Objects;

public class ShowJson {
    private int endTime;
    private String title;
    private int startTime;
    private String endTimeCaption;
    private String startTimeCaption;

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getEndTimeCaption() {
        return endTimeCaption;
    }

    public void setEndTimeCaption(String endTimeCaption) {
        this.endTimeCaption = endTimeCaption;
    }

    public String getStartTimeCaption() {
        return startTimeCaption;
    }

    public void setStartTimeCaption(String startTimeCaption) {
        this.startTimeCaption = startTimeCaption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowJson showJson = (ShowJson) o;
        return endTime == showJson.endTime && startTime == showJson.startTime && Objects.equals(title, showJson.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, title, startTime);
    }

    @Override
    public String toString() {
        return "ShowJson{" +
                "endTime=" + endTime +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTimeCaption='" + endTimeCaption + '\'' +
                ", startTimeCaption='" + startTimeCaption + '\'' +
                '}';
    }
}
