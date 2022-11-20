package chapters.chapter12.listings;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hsnny\\workspace");
        listFile(file);
    }

    private static void listFile(File file) {
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFile(f);
                }
            }
        }
    }
}
