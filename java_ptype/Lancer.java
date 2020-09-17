//Prototype java file for customer meeting
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Lancer{
    static BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
    public static void main(String args[]) throws IOException{
        //Intro to Adventure 1        
        //Enter data using BufferReader         
        introScreen();
        char selection = launchMenu();

        while(selection != 'Q'){
            if(selection == 'S'){
                newGame();
                selection = launchMenu();
            } else if(selection == 'T'){
                readTutorial();
                selection = launchMenu();
            } else{
                System.out.println();
                System.out.println("Please Enter a valid key");
                selection = launchMenu();
            } 
    
        }
        quitGame();
        
        
        
    }
    //Displays the Main menu
    public static char launchMenu() throws IOException{
        for(int i = 0; i < 13; i++){
            if(i < 10) System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
            else System.out.println();
        }
        System.out.println("                Welcome     ");
        System.out.println("           Lancer    Seven     ");
        for(int i = 0; i < 3; i++) System.out.println();
        System.out.println("               Controls");
        System.out.println("   'S'           'T'             'Q'");
        System.out.println("Start Game   Read Tutorial    Quit Game");

        int dig_input = -1;
        boolean menuSelected = false;
        while(!menuSelected){
            
            dig_input = reader.read();
            char input = (char)dig_input;
            if(input == 'S'|| input == 's'){
                menuSelected = true;
                return 'S';
            } else if(input == 'T' || input == 't'){
                menuSelected = true;
                return 'T';
            } else if(input == 'Q' || input == 'q'){
                menuSelected = true;
                return 'Q';
            } else return input;
        }
        return 'E';
    }
    
    //public static void lightJump()
    //public static void checkFuel()
    //public static void scram()
    //public static void engageEnemy()
    //public static void fireLaser()
    //public static void fireTorpedo()
    //public static void fireRockets()
    //public static void fireGrenade()
    //public static void shieldsUp()

    //set up a new Game
    public static void newGame() throws IOException{
        startScenario();



    }
    //exit game
    public static void quitGame(){
        System.exit(1);
    }
    //Function for using Enter to continue
    public static void pressAnyKeyToContinue(){ 
        System.out.println();
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }

    //New game story
    public static void startScenario() throws IOException{
        System.out.println("Hi lancer seven, I’m commander Reston. "+
        "We have an important mission for you today.  We need you to "+
        "patrol the area around Crimsania, a planet in the outer Enteron "+
        "system.  Crimsania is a peaceful world, rich with deposits of the "+
        "metals Titanium and Aluminum.  However, recently we have seen "+
        "hostile Argonaut squadrons probing the defenses of Crimsania. "+
        "We suspect that the Argonauts are planning a possible invasion "+
        "of Crimsania to take control of the important metal mining operations.");
        pressAnyKeyToContinue();
        System.out.println("We need you to fly to Crimsania and patrol the area to "+
        "make sure the Argonauts aren’t up to no good!");
        pressAnyKeyToContinue();
        System.out.println("If you haven't read your ship's tutorial, hit 'T' to go back now! "+
        "Or press 'C' to continue");
        
        if ((char)reader.read() == 'T'||(char)reader.read() =='t') readTutorial();

    }
    
    //Walk through of tutorial
    public static void readTutorial(){
        //Fuel
        System.out.println("Your Lancer spacecraft is equipped with 20 fuel "+
        "cells.  This should be enough to complete your mission, but you will "+
        "need to manage your use of fuel carefully!");
        pressAnyKeyToContinue();
        System.out.println("Your Lancer spacecraft has a lightspeed drive. "+
        "In order get beyond light speed, you will burn 2 full fuel cells. "+
        "Each 10 light years you travel burns an additional fuel cell. "+
        "So if you jump to lightspeed and travel 30 light years you will burn "+
        "2+3=5 fuel cells.  And remember you will need another 5 fuel cells to get "+
        "home!  The lightspeed drive is activated by the red button on the far left of your dash.");
        pressAnyKeyToContinue();
        //Scram
        System.out.println("Your Lancer has a device called a Scram Drive.  A Scram "+
        "drive provides a short but powerful burst.  If you are in a tough situation "+
        "with Argonaut ships, you just hit the orange button on your dashboard and the "+
        "Scram Drive will allow you to 'scram' from the area and get to safety.  It "+
        "will burn a half of a fuel cell each time you use it.  If you see the orange"+
        " button flashing, it means your on-board computer thinks you need to scram "+
        "because enemy ships have you in their sights, but you must push the orange "+
        "button to activate the Scram system.  The Scram button is the orange button "+
        "just to the left of the dashboard.");
        pressAnyKeyToContinue();
        //Weapons
        System.out.println("We have set the maneuvering rockets to their highest "+
        "setting.  Which means your Lancer will turn rapidly, allowing you to "+
        "outmaneuver any Argonaut ships you may encounter.  But this means you "+
        "will use more fuel when you execute sharp turns.");
        pressAnyKeyToContinue();
        System.out.println("To the right of your console you have a weapons control "+
        "system.  Push the blue button to activate your lasers.  Lasers are used in a "+
        "dog fight with enemy ships.  You can fire the lasers rapidly as they don’t "+
        "need to recharge.  If you push the blue button again it will toggle to the "+
        "quantum torpedoes.  Your quantum torpedoes can take out a big target like "+
        "an Argonaut cruiser or an Argonaut fighter with its shields at full strength. "+
        "But your systems must recharge after each volley so you can only fire "+
        "torpedoes every 30 seconds.  Finally, if you push the blue button once more "+
        "you will activate a concussion grenade.  The concussion grenade is powered by "+
        "the ships main engines.  It sends out a burst of energy that will momentarily "+
        "paralyze all ships in the vicinity, except yours!  It can provide very "+
        "important advantage so you can maneuver to take out an enemy fighter "+
        "or to get out of a tight spot.  But it burns an entire fuel cell so you need "+
        "to be very careful about using them – remember you always need enough fuel to "+
        "get home!");
        pressAnyKeyToContinue();
        //Shields
        System.out.println("The green button on the far right will activate the shields "+
        "on your ship.  Shields take a lot of power so they only stay active for 30 seconds, "+
        "and they burn down 1/10th of a fuel cell each time you use them.  So use them "+
        "carefully!");
        pressAnyKeyToContinue();
    }

    //Walks through the Game intro
    public static void introScreen(){
        System.out.println("Hi I’m Sammy. I’m going to be your guide on our "+
        "imagiplay today!  I will play the part of the star fleet commander. "+  
        "You will be Lancer Seven.  The Lancer squadron is an elite group of star fighters "+
        "with interstellar capabilities.  A Lancer ship is very high performance. "+
        "It’s powerful enough to quickly jump to lightspeed, but still small enough "+
        "to maneuver in a dog fight. But, when you put that much power into such a " +
        "small package, things can sometimes go wrong!  That’s why all Lancer pilots "+
        "are trained in advanced starship mechanics.\n");
        pressAnyKeyToContinue();
        System.out.println("For today’s adventure, you will need to prepare a few things. "+
        "First of all you’ll need a shelter.  Take two chairs or maybe a box or anything "+
        "you can find.  Cover them with a blanket.  Use your imagination – anything can work! "+
        "Make the shelter big enough that you can hide inside it – you will need to on the adventure.\n");
        pressAnyKeyToContinue();
        System.out.println("Next, you will need to ask an adult to hide an object.  In your kit "+
        "you will see two round cylinder shaped objects with markings on them.  These are fuel rods.  "+
        "Ask your grown up to hide them some place and then give them the ipad.  Ask them to put 3 "+
        "clues in the ipad that will help you find it.\n");
        pressAnyKeyToContinue();        
        System.out.println("That’s all the prep!  Now we are ready.  Put your helmet on, make sure "+
        "the headset is working and you can hear the music playing.  And let the Imagiplay begin!\n");
        pressAnyKeyToContinue();        
        
        
    }
}