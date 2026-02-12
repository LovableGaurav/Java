package io;

import FilehandingFile.Filepaths;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FolderOperation {
    public static void main() {
        File path =new File(Filepaths.SAMPLE_FOLDER_ABSOLUTE_PATH);

        if(path.exists()){
            System.out.println("File Exists");
            System.out.println("Folder ?" +path.isDirectory());
            System.out.println(path.isFile());

//            System.out.println("Absolute Path : " +file.getAbsolutePath());
//            System.out.println("Name :" +file.getName());
//            System.out.println("Parent :"+ file.getParent());
//            System.out.println("Length In Byte : "+ file.length());
//            System.out.println("Read ?" + file.canRead() );
//            System.out.println("Write ? "+file.canWrite());
//            System.out.println("Execute ? " + file.canExecute());
//            System.out.println("Last Modifiled : "+file.lastModified());
            System.out.println(Arrays.toString(path.list()));           }
    }
}
