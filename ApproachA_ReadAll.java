import java.nio.file.*;
import java.util.*;

public class ApproachA_ReadAll {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("employees.csv"));
        System.out.println("Lines read: " + lines.size());
    }
}
