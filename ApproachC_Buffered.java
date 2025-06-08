import java.io.*;

public class ApproachC_Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("employees.csv"), 64 * 1024); // 64KB buffer
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count++;
        }
        reader.close();
        System.out.println("Lines read: " + count);
    }
}

