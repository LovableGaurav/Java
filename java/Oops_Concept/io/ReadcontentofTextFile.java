package io;

import FilehandingFile.Filepaths;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadcontentofTextFile {
   public static void main() {
       File path = new File(Filepaths.SAMPLE_FILE_ABSOLUTE_PATH);
       if(path.exists() && path.isFile()){
           try(FileInputStream fis  = new FileInputStream(path);){
                int num;


               while((num=fis.read()) !=-1){

                   System.out.print((char)num);
               }
//               sc.close();
           }catch (IOException e){
               throw new RuntimeException(e);
           }
       } else {
           System.out.println();
       }
    }
}
