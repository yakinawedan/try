import java.util.ArtimeticException;
import java.util.Scanner;



public class NewClass {
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    int x=input.nextInt();
    if (x=0){
try {
 throw new ArtimeticException("connection failed");
}
catch(ArtimeticException ex ) {
 
    System.out.println("good bye");
}

}    
    
}
}
