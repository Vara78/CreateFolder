package pack1;
import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        boolean running = true;

        do {

            System.out.println("------------------------------------------");
            System.out.print("Name your file: ");
            name = "D:\\Development\\Projects\\" + input.next();

            try {
                File newFile = new File(name);

                if (newFile.exists()) {
                    System.out.printf("File already exists in path:\n%s \n", name);

                } else {
                    newFile.mkdir();
                    System.out.printf("You have created a new folder in path: \n%s \n", name);
                }
            } catch (Exception e) {
                System.out.println("You did not create a file");
            }
        } while(running);
    }
}
