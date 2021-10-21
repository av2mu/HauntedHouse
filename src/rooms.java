import java.util.Scanner;

public class rooms {
    public static final Scanner CONSOLE = new Scanner(System.in);
    static Boolean choice = true;

    public static void print(String input){
        String text = input;
        String parsedStr = text.replaceAll("(.{100})", "$1\n");
        System.out.println(parsedStr);
    }
    public static void yesOrNo(String ansYes, String ansNo){
        String input = CONSOLE.nextLine();
        if (input.equalsIgnoreCase("y")){
            print(ansYes);
            choice = true;
        } else if(input.equalsIgnoreCase("n")){
            print(ansNo);
            choice = true;
        }
    }
    static void kitchen(){
        print("You wake up in a rancid smelling kitchen, it’s dark and the air is damp. You get up from the dinner table you were at and see a door to your left and a lone and rusty fridge to your right.");
        print(" ");
        print("Would you like to open the fridge to your right (y) or the door to your left (n) ?");
        String kitchenYes = "You put your hand on the fridge door and it slams open and launches you back and down onto the ground. A green and gross and slimy ghost materializes from out of fridge and ";
        String kitchenNo = "You decide to walk up to the door and give it a try. You grab onto the hand and yank it open with incredible confidence and nothing happens. You walk through the door and close it behind you entering the hallway.";
        yesOrNo(kitchenYes,kitchenNo);
        if (choice = true) {
            hallway();
        } else {
            badEnding();
        }


    }

    static void hallway(){
        print("As you enter the rickety and old hallway and leave the smelly kitchen behind you notice a pair of glowing eyes at the end of the hall.");
        print(" ");
        print("Would you like to charge at the mysterious figure (y) or would you like to calmly approach it (n) ?");
        String hallwayYes = "Deciding that you've already had enough of this weird place you charge the glowing eyes screaming at the top of your lungs. Not even 5 steps into your sprint you trip on your own foot and crash into the floor breaking the floorboards and fall down into the basement. You are an idiot.";
        String hallwayNo = "As you slowly approach the eyes you start to make out its silhouette. And it looks kind of like a dog. As you approach the doggy it stands up and starts growling and barking at you. You stop and start to backstep but it’s too late. The dog has lunged at you and started mauling on your face";
        yesOrNo(hallwayYes,hallwayNo);

    }

    static void den(){

    }

    static void basement(){

    }

    static void bedroom(){

    }

    static void attic(){

    }

    static void conservatory(){

    }

    static void masterBed(){

    }

    static void graveyard(){

    }

    static void badEnding(){

    }
}
