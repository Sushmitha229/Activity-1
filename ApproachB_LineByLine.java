import java.io.*;

public class ApproachB_LineByLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count++;
        }
        reader.close();
        System.out.println("Lines read: " + count);
    }
}

