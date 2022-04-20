
import java.io.*;

/**
 * This class lets you communicate with the files in the src-folder.
 *
 * Method addToFile writes inn the WriteToMe.txt File
 *
 * Method ReadFile Reads the file you put in as a parameter-value.
 */
public class FileCommunication {

    /**
     * @param input - What you want to write in the file.
     * @return - returns boolean success status. success == true (no exceptions catched) | success == false (error)
     * @throws IOException - FileNotFound exception.
     */
    public boolean addToFile(String input) throws IOException {
        boolean success = false;
        try(FileWriter fw = new FileWriter("WriteToMe.txt")) {
            fw.write(input);
            success = true;

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            success = false;
        }
        catch (IOException e) {
            System.err.println(e);
            success = false;
        }
        finally {
            System.out.println("Success Status: "+success);
        }
        return success;
    }

    /**
     * @param filename - filename of the file you want to read.
     * @return - returns boolean success status. success == true (no exceptions caught) | success == false (error)
     * @throws IOException - FileNotFound exception.
     */
    public boolean readFile(String filename) throws IOException {
        boolean success = false;
        try {
            FileReader reader = new FileReader(filename);
            success = true;
            int i;
            while((i=reader.read()) != -1){
                System.out.print((char)i);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            success = false;
            System.err.println("File not found: " + e);
        } catch (IOException e) {
            success = false;
            System.err.println(e);
        }
        finally{
            System.out.println("Success Status: " + success);
        }
        return success;
    }
}
