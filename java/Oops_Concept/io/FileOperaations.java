package io;

import FilehandingFile.Filepaths;

import java.io.File;

public class FileOperaations {
    public static void main() {
        File file =new File(Filepaths.SAMPLE_FILE_ABSOLUTE_PATH);

                if(file.exists()){
                    System.out.println("File Exists");
                    System.out.println("Folder ?" + file.isDirectory());
                    System.out.println("File ?" + file.isFile());

                    System.out.println("Absolute Path : " +file.getAbsolutePath());
                    System.out.println("Name :" +file.getName());
                    System.out.println("Parent :"+ file.getParent());
                    System.out.println("Length In Byte : "+ file.length());
                    System.out.println("Read ?" + file.canRead() );
                    System.out.println("Write ? "+file.canWrite());
                    System.out.println("Execute ? " + file.canExecute());
                    System.out.println("Last Modifiled : "+file.lastModified());
                    System.out.println(file.list());           }
    }
}
