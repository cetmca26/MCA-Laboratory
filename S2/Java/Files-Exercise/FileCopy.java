
import java.io.*;

class FileCopy {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Source File path");
            String sourcePath = reader.readLine();
            System.out.println("Enter Destination File path");
            String destinationPath = reader.readLine();
            byte[] buffer = new byte[1024];
            FileInputStream inputStream = new FileInputStream(new File(sourcePath));
            FileOutputStream outputStream = new FileOutputStream(new File(destinationPath));
            buffer = inputStream.readAllBytes();
            outputStream.write(buffer);
            outputStream.close();
            inputStream.close();
            System.out.println("File Copied");

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
