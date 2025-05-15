
import java.io.*;
import java.util.Scanner;

class NumWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter source path");
        String srcpath = scanner.next();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcpath));
            BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
            BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"));
            String num = reader.readLine();
            while (num != null) {
                int n = Integer.parseInt(num);
                if (n % 2 == 0) {
                    evenWriter.write(n + "\n");
                } else {
                    oddWriter.write(n + "\n");
                }
                num = reader.readLine();
            }
            evenWriter.close();
            oddWriter.close();
            System.err.println("Files Written");
        } catch (Exception e) {

        }

    }
}
