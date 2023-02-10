public class Song {
    private String author;
    private String text;
    private String title;

    public Song(String author, String text, String title) {
        this.author = author;
        this.text = text;
        this.title = title;
    }

    public Song() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "author='" + author + '\'' + '\'' +
                ", title='" + title + '\'' +" + text "+text+
                '}';
    }
}
