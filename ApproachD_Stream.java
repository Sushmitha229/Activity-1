import java.nio.file.*;
import java.util.stream.Stream;

public class ApproachD_Stream {
    public static void main(String[] args) throws Exception {
        try (Stream<String> lines = Files.lines(Paths.get("employees.csv"))) {
            long count = lines.count();
            System.out.println("Lines read: " + count);
        }
    }
}

