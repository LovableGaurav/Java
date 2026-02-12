package io;

import FilehandingFile.Filepaths;

import java.io.*;

public class DeSerilization {
    public static void main() {
        File path =new File(Filepaths.SAMPLE_FILE_ABSOLUTE_PATH);
        if(path.exists() && path.isFile()){
            try(FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                Student st = (Student) ois.readObject();
                System.out.println(st);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Invalid Path");
        }
    }
}
