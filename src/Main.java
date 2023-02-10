import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song=new Song();
        FileWriter fileWriter=new FileWriter("Song.txt");
        fileWriter.write("XXTENTATION\n");
        fileWriter.write("Moonlight\n");
        fileWriter.write("Spotlight, uh, moonlight, uh Spotlight, uhSpotlight, uh, moonlight, uh" +
                "Nigga, why you trippin’? Get your mood right, uh" +
                "Shawty look good in the moonlight" +
                "All these pussy niggas so bad mind" +
                "Spotlight, moonlight" +
                "Nigga, why you trippin’? Get your mood right" +
                "Shawty look good in the moonlight" +
                "All these pussy niggas so bad mind" +
                "Spotlight, uh, moonlight" +
                "Nigga, why you trippin’? Get your mood right, uh" +
                "Shawty look good in the moonlight" +
                "All these pussy niggas so bad mind" +
                "Spotlight, moonlight" +
                "Nigga, why you trippin’? Get your mood right" +
                "Shawty look good in the moonlight");
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