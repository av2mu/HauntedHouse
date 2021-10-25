import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rooms {
    public static final Scanner CONSOLE = new Scanner(System.in);
    static boolean choice = true;
    static boolean silverBullet = false;
    static int hurryCount = 0;

    public static void print(String input){
        String parsedStr = input.replaceAll("(.{100})", "$1\n");
        System.out.println(parsedStr);
    }
    public static void yesOrNo(String ansYes, String ansNo){
        String input = CONSOLE.nextLine();
        if (input.equalsIgnoreCase("y")){
            print(ansYes);
            choice = true;
        } else if(input.equalsIgnoreCase("n")){
            print(ansNo);
            choice = false;
        }
    }

    static void enterGame(){
      kitchen();
    }

    static void kitchen(){
        print("You wake up in a rancid smelling kitchen, it’s dark and the air is damp. You get up from the dinner table you were at and see a door to your left and a lone and rusty fridge to your right.");
        print(" ");
        print("Would you like to open the fridge to your right (y) or the door to your left (n) ?");
        String kitchenYes = "You put your hand on the fridge door and it slams open and launches you back and down onto the ground. A green and gross and slimy ghost materializes from out of fridge and ";
        String kitchenNo = "You decide to walk up to the door and give it a try. You grab onto the hand and yank it open with incredible confidence and nothing happens. You walk through the door and close it behind you entering the hallway.";
        yesOrNo(kitchenYes,kitchenNo);
        if (choice) {
            for(int i = 0; i<3; i++){
                System.out.println("*creak*");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
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
        String hallwayNo = "As you slowly approach the eyes you start to make out its silhouette. And it looks kind of like a dog. As you approach the doggy it stands up and starts growling and barking at you. You stop and start to step back but it’s too late. The dog has lunged at you and started mauling on your face";
        while (hurryCount < 3){
            print("HURRY");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hurryCount++;
        }
        yesOrNo(hallwayYes,hallwayNo);
        if (choice){
            basement();
        } else {
            badEnding();
        }

    }

    static void basement(){
            print("You stand up from the rubble and hear a barking from above. You stumble around in the dark eventually finding two switches on the wall");
            print(" ");
            print("Do you flip the switch on the left (y) or the right (n) ?");
            String basementYes = "A booming voice says, ”YOU FOOL! YOU’VE RELEASED THE SNAKES”. You are swiftly murdered by the snakes.";
            String basementNo = "The lights flicker on after a moment and blind you. It gives you plenty of light to see the stairs out of the basement. As you leave up the creaky stairs you notice chains and huge scratch marks are all over the floor and walls. You quickly exit this creepy basement and enter the den";
            yesOrNo(basementNo,basementYes);
        if (choice){
            den();
        } else {
            badEnding();
        }
    }

    static void den(){
        print("You enter a modest and well kept den. The walls are lined from ceiling to floor with bookshelves in the middle of each wall are  huge armoured statues holding giant battle axes. A seemingly untouched velvet couch sits in the middle of the room next to a very fancy coffee table. Looking to the other end of the room you see a messy desk with drawers and a door right next to it.");
        print(" ");
        print("Would you like to sit on the fancy couch (1) or search the desk (2) or head straight for the door (3) ?");
        String den1 = "You decide to rest your tired and sorry self on the pretty velvet couch and the moment you sit on it you hear a click and the massive battle axes drop from the statues and dice you up like a tomato.";
        String den2 = "You walk over to the desk and start rummaging through the papers and drawers to try and find anything to help you get out of this awful place. In one of the drawers you find a single silver bullet. You quickly pocket it hoping that it won't have to use it and head through the door next to the desk.";
        String den3 = "Deciding that you just want to get out of here as quickly as possible, you swiftly dart to the door being very careful to not bump or touch anything.";
        String input = CONSOLE.nextLine();
        if (input.equalsIgnoreCase("1")){
            print(den1);
            badEnding();
        } else if(input.equalsIgnoreCase("n")){
            print(den2);
            silverBullet = true;
            bedroom();
        } else if(input.equalsIgnoreCase("3")){
            print(den3);
            bedroom();
        }
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
