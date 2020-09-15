//Prototype java file for customer meeting

public class Lancer{
    public static void main(String args[]){
        //Intro to Adventure 1        
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
    //Function for using Enter to continue
    private static void pressAnyKeyToContinue(){ 
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}