import java.util.Scanner;
/**
 * ExpressingGratitude08
 */
public class ExpressingGratitude08 {
    public static String getGreetingRecipient(){
        Scanner input08 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input08.nextLine();
        input08.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+ name +" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void sayAdditionalGreetings() {
        System.out.println("Thank you for all the lessons and knowledge that have been given.");
    }

    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings();
    }
}