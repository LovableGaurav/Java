package JAVA_TEST_3;

import java.io.*;

class PersonalDiary {

    public static void main(String[] args) {
        JAVA_TEST_3.PersonaDiary diary = new JAVA_TEST_3.PersonaDiary();

        diary.writeNote("my_diary.txt", "Today I started learning Java File I/O.");
        diary.writeNote("my_diary.txt", "It was a bit confusing, but I'm getting the hang of it.");
        diary.writeNote("my_diary.txt", "I successfully created and copied a file!");

        diary.createBackup("my_diary.txt", "diary_backup.txt");
    }

    public void writeNote(String fileName, String note) {
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(note);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error: Could not save note.");
        }
    }

    public void createBackup(String sourceFile, String backupFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(backupFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: Could not create backup.");
        }
    }
}