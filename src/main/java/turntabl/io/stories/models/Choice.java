package turntabl.io.stories.models;

public class Choice {
    private String choice_text;
    private String choice_media;

    public Choice() {
    }

    public Choice(String choice_text, String choice_media) {
        this.choice_text = choice_text;
        this.choice_media = choice_media;
    }

    public String getChoice_text() {
        return choice_text;
    }

    public void setChoice_text(String choice_text) {
        this.choice_text = choice_text;
    }

    public String getChoice_media() {
        return choice_media;
    }

    public void setChoice_media(String choice_media) {
        this.choice_media = choice_media;
    }

    @Override
    public String toString() {
        return "Choices{" +
                "choice_text='" + choice_text + '\'' +
                ", choice_media='" + choice_media + '\'' +
                '}';
    }
}
