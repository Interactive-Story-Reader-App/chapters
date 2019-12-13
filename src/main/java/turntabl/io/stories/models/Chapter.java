package turntabl.io.stories.models;

import java.util.Arrays;

public class Chapter {
    private String chapter_id;
    private String story_id;
    private String chapter_title;
    private String chapter_content;
    private Integer[] candidates;
    private Choice[] choices;

    public Chapter() {
    }

    public Chapter(String chapter_id, String story_id, String chapter_title, String chapter_content, Integer[] candidates, Choice[] choices) {
        this.chapter_id = chapter_id;
        this.story_id = story_id;
        this.chapter_title = chapter_title;
        this.chapter_content = chapter_content;
        this.candidates = candidates;
        this.choices = choices;
    }

    public String getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public String getChapter_content() {
        return chapter_content;
    }

    public void setChapter_content(String chapter_content) {
        this.chapter_content = chapter_content;
    }

    public Integer[] getCandidates() {
        return candidates;
    }

    public void setCandidates(Integer[] candidates) {
        this.candidates = candidates;
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapter_id='" + chapter_id + '\'' +
                ", story_id='" + story_id + '\'' +
                ", chapter_title='" + chapter_title + '\'' +
                ", chapter_content='" + chapter_content + '\'' +
                ", candidates=" + Arrays.toString(candidates) +
                '}';
    }
}
