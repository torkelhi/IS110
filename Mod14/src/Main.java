import java.io.IOException;

/**
 * The Main class lets you uses the FileCommunication objekt to read files in the src-folder.
 * It lets you write to WriteToMe.txt file.
 *
 * Everything can be done through the Command Line Arguments.
 *
 * Argument [0] has to be "Read" or "Write"
 *
 * Read - "filename (if it is in src directory)" || filepath"
 * Write - "Your input sentence" to WriteToMe.txt
 */
public class Main {

    public static void main(String[] args) throws IOException {
        FileCommunication fc = new FileCommunication();

        if(args[0].equals("Read")){
            fc.readFile(args[1]);
        }

        if(args[0].equals("Write")){
            StringBuilder inputString = new StringBuilder();
            for(int i = 1; i <args.length; i++){
                inputString.append(args[i]).append(" ");
            }
            fc.addToFile(inputString.toString());
            fc.readFile("WriteToMe.txt");
        }
    }
}
