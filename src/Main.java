import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song=new Song();
        FileWriter fileWriter=new FileWriter("Song.txt");
        fileWriter.write("XXTENTATION\n");
        fileWriter.write("Moonlight\n");
        fileWriter.write("So close, no matter how far\n");
        fileWriter.write("Couldn't be much more from the heart\n");
        fileWriter.write("Forever trusting who we are\n");
        fileWriter.write("And nothing else matters\n");
        fileWriter.write("Never opened myself this way\n");
        fileWriter.write("Life is ours, we live it our way\n");
        fileWriter.write("All these words I don't just say\n");
        fileWriter.write("And nothing else matters");

        fileWriter.close();
        FileReader fileReader=new FileReader("Song.txt");
        Scanner scanner=new Scanner(fileReader);
        StringBuilder stringBuilder=new StringBuilder();
        song.setAuthor(scanner.nextLine());
        song.setTitle(scanner.nextLine());
        while(scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()+"\n");
        }

       song.setText(String.valueOf(stringBuilder));

        fileReader.close();
        System.out.println(song);
    }
}