package io;

import FilehandingFile.Filepaths;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextRobust {
    static void main() {
        File path = new File(Filepaths.SAMPLE_FILE_ABSOLUTE_PATH);
        String msg = """
               Be ready for tests on Friday 
               This is Goona fun 
               """;
        if(path.exists() && path.isFile()){
            try(FileOutputStream fos = new FileOutputStream(path,true);){
                // append = true means
                // it will start appending instead of replacing
                fos.write(msg.getBytes());
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        } else {
            System.out.println();
        }
        }
    }

