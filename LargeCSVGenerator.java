import java.io.*;
import java.util.Random;

public class LargeCSVGenerator {
    public static void main(String[] args) throws IOException {
        String[] departments = {"HR", "Engineering", "Marketing", "Finance"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("employees.csv"));
        writer.write("ID,Name,Department,Salary,Email,Address\n");

        Random rand = new Random();
        for (int i = 1; i <= 1_000_000; i++) {
            String line = i + "," +
                          "Employee" + i + "," +
                          departments[rand.nextInt(departments.length)] + "," +
                          (30000 + rand.nextInt(70000)) + "," +
                          "employee" + i + "@example.com," +
                          "1234 Some Street, City, Country\n";
            writer.write(line);
        }
        writer.close();
        System.out.println("employees.csv generated!");
    }
}
