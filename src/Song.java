import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Song {
    private String title;
    private String author;
    private String text;

    public Song(String title, String author) {
        this.title = title;
        this.author = author;

    }


    public void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("Nothing else matters.txt");
        fileWriter.write(
                "Metallica" +
                        "So close,no matter how far" +
                        "Couldn't be much more from the heart" +
                        "Forever trusting who we are" +
                        "And nothing else matters" +
                        "Never opened myself this way" +
                        "Live is ours, we live it our way" +
                        "All these words I don't just say" +
                        "And nothing else matters" +
                        "");
        fileWriter.close();
    }

    public void fileReader() {
        try {
            FileReader fileReader = new FileReader("Nothing else matters.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
