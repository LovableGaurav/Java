package io;

import FilehandingFile.Filepaths;

import java.io.File;
import java.io.IOException;

public class FileOperationCreateDelete {
    public static void main() {
        File file = new File ("src.main/resources/sample2.txt");
        if(!file.exists()){
            System.out.println("FIle exists");
            try{
                boolean newFile = file.createNewFile();
                System.out.println("New File/Folder created ?? "+ newFile);
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Not Existing so deleting it");
            boolean deleteStatus = file.delete();
        }
    }
}
