import java.util.*;

public class Inputs {
    static Scanner scan = new Scanner(System.in);
    static ArrayList <String> userName = new ArrayList <String> ();
    static ArrayList <String> userPass = new ArrayList <String> ();
    static ArrayList <String> messages = new ArrayList <String> ();
    String user, password;
    int userpick;

    public void mainMenu(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\n           Hello, Welcome to message4u!\n");
        System.out.println("1. Sign In\n2. Sign Up\n3. Exit");
        System.out.print("Choose: ");
        userpick = scan.nextInt();

        switch(userpick){
            case 1: SignIn();
            break;
            case 2: SignUp();
            break;
            case 3: 
            System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
            System.exit(0);
            break;
            default: 
            System.out.println("\nWrong Input!");
            mainMenu();
        }
    }

    public void SignIn(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\nSign In");
        System.out.print("\nEnter Username: ");
        user = scan.next();
        System.out.print("Enter Password: ");
        password = scan.next();
        
        for(String names : userName){
            if(names.equals(user)){
                System.out.println("\nWe Found, " + user);
                break;
            }
            else{
            System.out.println("\nNo Account Matched");
            mainMenu();
            }
        }
        for(String passcodes : userPass){
            if(passcodes.equals(password)){
                System.out.println("Welcome, " + user);
                premium();
                break;
            }
            else{
            System.out.println("\nNo Account Matched");
            mainMenu();
            }
        }      
    }

    public void SignUp(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\nSign Up");
        System.out.print("\nEnter Username: ");
        userName.add(scan.next());
        System.out.print("Enter Password: ");
        userPass.add(scan.next());
        System.out.println("\nAccount Created Succesfully!");
        mainMenu();
    }

    public void premium(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\nAccount: " + user);
        System.out.println("\n1. Compose Message\n2. Archive\n3. Sign Out");
        System.out.print("Choose: ");
        userpick = scan.nextInt();

        switch(userpick){
            case 1: compose();
            break;
            case 2: archive();
            break;
            case 3: 
            System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
            System.out.println("\nAccount Signed Out");
            mainMenu();
            break;
            default:
            System.out.println("\nWrong Input!");
            premium();
        }
    }

    public void compose(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\nCompose Message");
        System.out.println("Note: Use underscore as an alternative for space bar\n");
        System.out.print("Message: ");
        messages.add(scan.next());
        System.out.println("\nMessage saved!");
        premium();
    }

    public void archive(){
        System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("\nArchives\n");

        for(String notes : messages ){
            System.out.println("[ "+notes+" ]" + "\n");
        }
        premium();
    }
}
