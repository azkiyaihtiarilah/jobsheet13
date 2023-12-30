import java.util.Scanner;

/**
 * Gratitude08
 */
public class Gratitude08 {
    public static void sayThankyou() {
        System.out.println("Thankyou for being the best teacher in the world.\n"+ 
        "You inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }

    public static String getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+ name +" May the force be with you!");
   
    }
}