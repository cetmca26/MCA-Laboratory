
import java.io.File;
import java.util.Scanner;

class DirectoryListing {

    static boolean fileFound = false;
    static String filePath = null;

    static void listFilesAndDirectories(File directory) {
        if (directory.isDirectory()) {
            System.out.println("Files under " + directory.getName());
            File[] contents = directory.listFiles();
            for (File file : contents) {
                System.out.println(file.getName());
                listFilesAndDirectories(file);
            }
        }
    }

    static void searchFile(File directory, String filename) {
        if (directory.isDirectory() && !fileFound) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(filename)) {
                        fileFound = true;
                        filePath = file.getAbsolutePath();
                        return;
                    }
                }
            }
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFile(file, filename);
                }
            }
        }
    }
}

public class SubDirAndFiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path:");
        String dirpath = scanner.next();
        File directory = new File(dirpath);
        if (directory.isDirectory()) {
            System.out.println("Files and directories");
            DirectoryListing.listFilesAndDirectories(directory);
            System.out.println("Enter filename to be searched");
            String fileName = scanner.next();
            DirectoryListing.searchFile(directory, fileName);
            if (DirectoryListing.fileFound) {
                System.out.println("File Path=" + DirectoryListing.filePath);
            } else {
                System.out.println("File Not found");
            }
        } else {
            System.out.println("Not a valid directory");
        }
    }
}
