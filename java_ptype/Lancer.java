//Prototype java file for customer meeting
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.lang.Math;

public class Lancer{
    static BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
    public static double fuel = 20.0;
    public static int torpedos = 5;
    public static void main(String args[]) throws IOException{
        //Intro to Adventure 1        
        //Enter data using BufferReader         
        //introScreen();
        launchMenu();
        
        
        
    }
    //Displays the Main menu
    public static void launchMenu() throws IOException{
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
            //Start a New Game
            if(input == 'S'|| input == 's'){
                menuSelected = true;
                newGame();
            //Read the Tutorial
            } else if(input == 'T' || input == 't'){
                menuSelected = true;
                readTutorial();
                launchMenu();
            //Quit Game
            } else if(input == 'Q' || input == 'q'){
                menuSelected = true;
                quitGame();
            } 
        }
    }

    public static void choiceMenu()throws IOException{
        int dig_input = -1;
        boolean menuSelected = false;
        //keeps menu from printing after \n
        int i = 0;
        while(!menuSelected){
            System.out.println();
            if(i!=1) System.out.println("C: Check Fuel -- X: Scram! -- W: Weapons -- S: Shields -- L: Land -- Q: Quit");
            dig_input = reader.read();
            char input = (char)dig_input;
            //Check Fuel levels
            if(input == 'C'|| input == 'c'){
                checkFuel();
                i = 0;
            }//Scram! 
            else if(input == 'X' || input == 'x'){
                scram();
                i = 0;
            }//open Weapons Menu
            else if(input == 'W' || input == 'w'){
                weaponsMenu();
                i = 0;
            }//Shields up
            else if(input == 'S' || input == 's'){
                shieldsUp();
                i = 0;
            }
            else if(input == 'L' || input == 'l'){
                landShipMenu();
                i = 0;
            }//Returns to launch screen 
            else if(input == 'Q' || input == 'q'){
                menuSelected = true;
                launchMenu();
            //keeps \n from displaying menu
            }else if(dig_input == 10 || dig_input == 13){
                i = 1;
            }
            
        }
    }
    //Weapons Menu
    public static void weaponsMenu() throws IOException{
        int dig_input = -1;
        boolean menuSelected = false;
        //keeps menu from printing after \n
        int i = 0;
        while(!menuSelected){
            System.out.println();
            if(i!=1) System.out.println("L: Lasers -- T: Quantum Torpedos -- G: Concussion Grenades -- Q: Back");
            dig_input = reader.read();
            char input = (char)dig_input;
            //Lasers
            if(input == 'L'|| input == 'l'){
                fireLaser();
                i = 0;
            }
            //Quantum Torpedos
            else if(input == 'T' || input == 't'){
                fireTorpedo();
                i = 0;
            }//Concussion Grenades
            else if(input == 'G' || input == 'g'){
                fireGrenade();
                i = 0;
            }//Returns to launch screen 
            else if(input == 'Q' || input == 'q'){
                menuSelected = true;
                choiceMenu();
            //keeps \n from displaying menu
            }else if(dig_input == 10 || dig_input == 13){
                i = 1;
            }
            
        }
    }
    //Ground Menu
    public static void landShipMenu() throws IOException{
        System.out.println("\nGo explore this planet's suface and search for resources!");
        int dig_input = -1;
        boolean menuSelected = false;
        //keeps menu from printing after \n
        int i = 0;
        while(!menuSelected){
            System.out.println();
            if(i!=1) System.out.println("R: Refuel -- W: Restock Weapons -- Q: Take Off");
            dig_input = reader.read();
            char input = (char)dig_input;
            //refuel
            if(input == 'r'|| input == 'R'){
                i = 0;
                refuel();
            }//restock weapons
            else if(input == 'W' || input == 'w'){
                i = 0;
                restockWeap();
            }//return to orbit
            else if(input == 'Q' || input == 'q'){
                menuSelected = true;
                System.out.println("\nExiting planet atomsphere");
                choiceMenu();
            }//keeps \n from displaying menu
            else if(dig_input == 10 || dig_input == 13){
                i = 1;
            }
        }    
    }

    public static void refuel() throws IOException{
        System.out.print("\nEnter how many fuel cells you found?\n");
        int i = 0;
        reader.read();
        while (i < 2){
            if(i == 1){
                fuel += Integer.parseInt(reader.readLine());
                checkFuel();
            }
            i++;
        }
    }
    public static void restockWeap() throws IOException{
        System.out.print("\nEnter how many torpedos you found?\n");
        int i = 0;
        reader.read();
        while (i < 2){
            if(i == 1){
                torpedos += Integer.parseInt(reader.readLine());
                System.out.println("\nYou now have "+ torpedos+ " quantum torpedos");
            }
            i++;
        }
    }

    //Fuel Gauge
    public static void checkFuel(){
        if(fuel <= 0) {
            fuel = 0;
            System.out.println("\nYou're out of fuel, land and refill");
        }
        else System.out.println("\nYou currently have: " + (Math.floor(fuel* 100) /100) +" fuel rods");
    }
    //Scram Drive
    public static void scram(){
        if(fuel <= 0) System.out.println("Out of fuel, cannot Scram");
        else{    
            System.out.println("\nActivating Scram!");
            fuel -= 0.5;
            System.out.println("\nYou are now safe from harm\n");
            checkFuel();
        }
    }
    //Shields
    public static void shieldsUp(){
        if(fuel <= 0) System.out.println("Out of fuel, shields down");
        else{
            System.out.println("\nActivating Shields! You have 30 seconds to escape!\n");
            fuel -= 0.1;
            checkFuel();
        }
    }
    //Weapons systems for Lancer
    //Lasers
    public static void fireLaser(){
        System.out.println("\nCharging Laser to fire");
        double rand = Math.random();
        if(rand > 0.7) {
            System.out.println("\nYou hit an Enemy!");
        } else{
            System.out.println("\nYou Missed!");
        }
    }
    //Quantum Torpedos
    public static void fireTorpedo(){
        if (torpedos == 0) System.out.println("\nAll Quantum Torpedos Gone!");
        else{   
            System.out.println("\nLoading Quantum Torpedo to fire");
            torpedos -= 1;
            double rand = Math.random();
            if(rand > 0.5){
                System.out.println("\nEnemy sent to quantum realm!");
            } else {
                System.out.println("\nYou Missed!");
            }
            System.out.println("\nOnly "+ torpedos + " torpedos left");
        }
    }
    //Concussion Grenades
    public static void fireGrenade(){
        if (fuel <= 0) System.out.println("\nOut of fuel, can't concuss!");
        else{
            System.out.println("\nTargeting Concussion Grenade");
            fuel -= 1.0;
            double rand = Math.random();
            if(rand > 0.2){ 
                System.out.println("\nEnemies Concussed!");
            } else{
                System.out.println("\nYou Missed!");
            }
            checkFuel();
        }
    }
    //public static void lightJump()
    //set up a new Game
    public static void newGame() throws IOException{
        fuel = 20.0;
        torpedos = 5;
        startScenario();
        System.out.println("\nSomething Happend!");
        choiceMenu();

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
        "or press 'C' to continue");
        

        int dig_input = -1;
        boolean menuSelected = false;
        while(!menuSelected){
            dig_input = reader.read();
            char input = (char)dig_input;
            if (input == 'T'||input =='t'){ 
                menuSelected = true;
                readTutorial();
            } else if (input == 'c' || input == 'C'){
                menuSelected = true;
            } 
        }
    }
    
    //Walk through of tutorial
    public static void readTutorial()throws IOException{
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
        "with Argonaut ships, you just hit the 'X' button on your dashboard and the "+
        "Scram Drive will allow you to 'scram' from the area and get to safety.  It "+
        "will burn a half of a fuel cell each time you use it.  If you see a large enemy"+
        " your on-board computer will think you need to scram but you must push the 'X' "+
        "button to activate the Scram system");
        pressAnyKeyToContinue();
        //manuvering
        System.out.println("We have set the maneuvering rockets to their highest "+
        "setting.  Which means your Lancer will turn rapidly, allowing you to "+
        "outmaneuver any Argonaut ships you may encounter.  But this means you "+
        "will use more fuel when you execute sharp turns.");
        pressAnyKeyToContinue();
        //weapons
        System.out.println("If you press 'W', you have the weapons control "+
        "system.  Push 'L' to activate your lasers.  Lasers are used in a "+
        "dog fight with enemy ships.  You can fire the lasers rapidly as they don’t "+
        "need to recharge.  If you push 'T' it will toggle to the "+
        "quantum torpedoes.  Your quantum torpedoes can take out a big target like "+
        "an Argonaut cruiser or an Argonaut fighter with its shields at full strength. "+
        "But you only have five so use them wisely.  Finally, if you push 'G' "+
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