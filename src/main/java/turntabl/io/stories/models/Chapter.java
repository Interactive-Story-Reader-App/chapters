package turntabl.io.stories.models;

import java.util.Arrays;

public class Chapter {
    private String _id;
    private String _rev;
    private String story_id;
    private String chapter_title;
    private String chapter_content;
    private String[] candidates;
    private Choice[] choices;

    public Chapter() {

    }

    public Chapter(String _id, String _rev, String story_id, String chapter_title, String chapter_content, String[] candidates, Choice[] choices) {
        this._id = _id;
        this._rev = _rev;
        this.story_id = story_id;
        this.chapter_title = chapter_title;
        this.chapter_content = chapter_content;
        this.candidates = candidates;
        this.choices = choices;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
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

    public String[] getCandidates() {
        return candidates;
    }

    public void setCandidates(String[] candidates) {
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
            ", story_id='" + story_id + '\'' +
            ", chapter_title='" + chapter_title + '\'' +
            ", chapter_content='" + chapter_content + '\'' +
            ", candidates=" + Arrays.toString(candidates) +
            '}';
    }
}
