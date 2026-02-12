package io;

import java.io.*;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import static java.lang.System.out;

public class ImageCopyPaste {
    public static void main() {
        String sourcepath = "C:\\Users\\gk812\\Desktop\\java\\java\\Oops_Concept\\io\\images.png";
        String DestinationPath = "C:\\Users\\gk812\\Desktop\\java\\java\\Oops_Concept\\io\\Gaurav.png";

        try(
                InputStream in = new FileInputStream(sourcepath);
                OutputStream out = new FileOutputStream(DestinationPath);
        ) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, read);
            }
            System.out.println("copied");
        } catch(Exception e){
            e.printStackTrace();
        }

        }
    }

