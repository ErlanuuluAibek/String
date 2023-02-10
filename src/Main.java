import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song=new Song();
        FileWriter fileWriter=new FileWriter("Song.txt");
        fileWriter.write("XXTENTATION\n");
        fileWriter.write("Moonlight\n");
        fileWriter.write("Spotlight, uh, moonlight, uh Spotlight, uh");
        fileWriter.close();
        FileReader fileReader=new FileReader("Song.txt");
        Scanner scanner=new Scanner(fileReader);
        while(scanner.hasNextLine()){
            song.setAuthor(scanner.nextLine());
            song.setTitle(scanner.nextLine());
            song.setText(scanner.nextLine());
        }
        fileReader.close();
        System.out.println(song);
    }
}