package sg.edu.nus.iss.day13workshop.services;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day13workshop.models.Contact;

@Service
public class DatabaseService {

    private File dataDir = new File("some directory");

    public File getDataDir() {
        return dataDir;
    }

    public void setDataDir(File dataDir) {
        this.dataDir = dataDir;
    }

    // dir location for MAC OS / Users/<Username>/data
    // home/data
    public boolean isDataDirValid() {
        return dataDir.exists() && dataDir.isDirectory() && dataDir.canWrite();
    }

    public boolean save(final Contact contact) {
        File f = new File(this.dataDir, contact.getId());

        try (OutputStream out = new FileOutputStream(f)) {

            PrintWriter pw = new PrintWriter(out);
            pw.println(contact.getId());
            pw.println(contact.getName());
            pw.println(contact.getEmail());
            pw.println(contact.getPhone());
            pw.flush(); // flush = the end
            return true;

        } catch (IOException e) {

            System.err.printf("Error: %s", e.getMessage());
            e.printStackTrace();
            return false;

        }

    }

    public Contact read(String fileID) {
        try {
           // File f = new File(this.dataDir, fileID);
           // Scanner myReader = new Scanner(f);
           // while (myReader.hasNextLine()) {
            //    System.out.println(myReader.nextLine());
           // }
           // myReader.close();

            Contact contact = new Contact();
            Path filePath = new File(this.dataDir, fileID).toPath();
            Charset charset = Charset.forName("utf-8");
            List<String> stringVal = Files.readAllLines(filePath, charset);

            contact.setName(stringVal.get(1)); // starts at 01 due to id being saved at index 00
            contact.setEmail(stringVal.get(2));
            contact.setPhone(stringVal.get(3));
            
            return contact;

        } catch (IOException e) {

            System.err.printf("Error: %s", e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

}
