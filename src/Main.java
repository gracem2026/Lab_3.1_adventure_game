import java.sql.SQLOutput;
import java.util.Scanner;
//269 lines of pain :))
public class Main {
    //Prints out the valid options
    public static void printChoices(String choiceA, String choiceB){
        System.out.println("Your options are: " + choiceA + " or " + choiceB);
        System.out.println("Input your choice below: ");
    }

    //Prints out the response for a win
    public static void win() {
        System.out.println("[YOU WIN!]");
        System.out.println("Good job, it seems like you’ve managed to survive this time. You must’ve made some good choices!");
        System.out.println("This is just one of the possible win endings you can get in this game. \nFeel free to restart and get a new ending!");
        credits();
    }

    //Prints out the response for a game over
    public static void gameOver() {
        System.out.println("[GAME OVER!]");
        System.out.println("Oh no! It seems like your ability to breathe has suddenly ended due to you making some unlucky choices.");
        System.out.println("You may choose to restart the game to hopefully try and survive!");
        credits();
    }

    //Prints out the ending credits
    public static void credits() {
        System.out.println("\n\n~Pinecone adventure~");
        System.out.println("Credits-\nCode: Grace Ma\nGame design: Grace Ma");
        System.out.println("Pain and suffering: Grace Ma");
        System.out.println("Braincells lost making this: Almost all of them\nSanity remaining: In the negatives probably");
        System.out.println("Thanks to Ms. Nahar for coding support :)\nAnd thanks to you for playing the game :D");
    }
    //Game starts!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grace's text adventure game- Pinecone Journey! :D \nYou will be given options after each event, and different choices will result in a different ending. \nIf you end up surviving, you win :) have fun!");
        System.out.println("1. You find yourself in the middle of the woods. \nYou’ve spawned with a bag with pinecones inside. \nThere are two paths, one leading into the mountains and the other to the beach. \nWhich path do you take?");
        printChoices("mountains", "beach");
        String choiceOne = input.next();

        //Check for erroneous input
        for (boolean t = choiceOne.equals("mountains") || choiceOne.equals("beach"); !t; t = choiceOne.equals("mountains") || choiceOne.equals("beach")){
            System.out.println("This is not a valid option, try again: ");
            choiceOne = input.next();
        }

        //2 mountains
        if (choiceOne.equals("mountains")){
            System.out.println("2. You arrive at the foot of the mountains.");
            System.out.println("The mountain is tall and menacing, and climbing it would take a long time.");
            System.out.println("There is a nearby town where you can rest, as the sun is about to set. What do you do?");
            printChoices("climb", "rest");
            String choiceTwo = input.next();

            for (boolean t = choiceTwo.equals("climb") || choiceTwo.equals("rest"); !t; t = choiceTwo.equals("climb") || choiceTwo.equals("rest")){
                System.out.println("This is not a valid option, try again: ");
                choiceTwo = input.next();
            }

            //3 climb
            if (choiceTwo.equals("climb")){
                System.out.println("You begin climbing up the mountain.");
                System.out.println("The view is nice, but you feel tired after climbing for a while.");
                System.out.println("You've still got a long way to go, so you decide to build a quick shelter.");
                System.out.println("Where do you build your shelter?");
                printChoices("cave", "treehouse");
                String choiceThree = input.next();

                for (boolean t = choiceThree.equals("cave") || choiceThree.equals("treehouse"); !t; t = choiceThree.equals("cave") || choiceThree.equals("treehouse")){
                    System.out.println("This is not a valid option, try again: ");
                    choiceThree = input.next();
                }

                //4 cave
                if (choiceThree.equals("cave")){
                    System.out.println("You find a nearby cave.");
                    System.out.println("It is really dark inside, and you don’t have a light source on you. ");
                    System.out.println("It’s also pitch black outside, so there isn’t much stuff you can do. ");
                    System.out.println("You attempt to eat one of the pinecones in your bag, but it doesn’t taste very good.");
                    System.out.println("Suddenly, you hear shrieking coming from the depths of the cave.");
                    System.out.println("You look up and there’s a group of bats staring at you with their big and bright eyes.");
                    System.out.println("“Don’t you dare trespass on our property!”");
                    System.out.println("Terrified, you run as quickly as possible.");
                    System.out.println("Unfortunately, since it is already nighttime, you did not see where you were going and ran right off a cliff!");
                    System.out.println("You have reached the ending: [Trespassers will be prosecuted]");
                    gameOver();
                }

                //4 treehouse
                else{
                    System.out.println("You decide to build a treehouse.");
                    System.out.println("You start by building a scaffolding using some wood, and you find some twigs to build onto the framework.");
                    System.out.println("You use some leaves to waterproof your house, which is a good idea as it just started raining.");
                    System.out.println("There’s some rocks nearby, which you use to make simple tools to help with building and hunting.");
                    System.out.println("It’s warm and cozy in your new house, and you take some time to enjoy the scenery around you.");
                    System.out.println("Over the next few days, you continue expanding and decorating the treehouse.");
                    System.out.println("A family of squirrels visit one day, and you give them the pinecones, and so a new friendship begins.");
                    System.out.println("You have lots of fun playing with the squirrels and birds that visit you in your backyard. It’s a good life.");
                    System.out.println("You have reached the ending: [Peaceful treehouse life]");
                    win();
                }
            }

            //3 rest
            else{
                System.out.println("You arrive at a small but lively town, where you decide to rest for the day");
                System.out.println("The air smells of baked potatoes, which is coming from a food stall in the westward direction. ");
                System.out.println("A cat comes to you and stares at you. Maybe it wants you to follow it eastward.");
                System.out.println("Which way do you go?");
                printChoices("west", "east");
                String choiceThreeRest = input.next();

                for (boolean t = choiceThreeRest.equals("west") || choiceThreeRest.equals("east"); !t; t = choiceThreeRest.equals("west") || choiceThreeRest.equals("east")){
                    System.out.println("This is not a valid option, try again: ");
                    choiceThreeRest = input.next();
                }

                //4 west
                if (choiceThreeRest.equals("west")){
                    System.out.println("You go west, and you meet a kid selling baked potatoes.");
                    System.out.println("“Hello kind stranger! You don’t look like you’re from here. Where did you come from?” The kid curiously asks.");
                    System.out.println("“Uh… I arrived from the woods. I don’t really know where I come from either”, you reply.");
                    System.out.println("“Hmm… It must be tiring walking so long. I bet you're starved! Here! Have some potatoes! By the way, where are you going next?”");
                    System.out.println("The kid shoves a basket filled with freshly baked potatoes. They are golden brown and slightly smoking due to the heat.");
                    System.out.println("You take a bite from a potato. “Wow, this tastes good. Just a slight problem… I don’t know where to go next.”");
                    System.out.println("“You could help me run my potato shop, and I live in this house right behind it.”");
                    System.out.println("“Thanks, so I guess I’m hired?” \n“Yep! Your first shift starts now!”");
                    System.out.println("“By the way, you should take a salted fish. It’s a local specialty here!” The kid shoves another basket of fish in your arms.");
                    System.out.println("“Cool, thanks for your gifts. I should probably return the favour. Here, you can have these.” You give the pinecones to the kid.");
                    System.out.println("“No way- this is gonna get us so rich if we sell it! Pinecones are really rare here, you know?”");
                    System.out.println("You look at the excited kid and give him a smile. \nThe two are you are gonna get really rich, really fast.");
                    System.out.println("You have reached the ending: [Huge monetary gains]");
                    win();
                }

                //4 east
                else{
                    System.out.println("You follow the cat eastward. The cat is quite beautiful, you must say, with shiny black fur and blue eyes.");
                    System.out.println("You get a nice view of the town, its bustling lifestyle, as well as its interesting commercial methods.");
                    System.out.println("You’ve managed to trade your pinecones for a giant bag of gold coins. I guess these things must be valuable in the town.");
                    System.out.println("Nightfall arrives quickly, and you’ve been walking around town for a while. The cat seems unbothered and is still going forward");
                    System.out.println("You have been diverted from the busy main street to a suspicious alleyway. \nYou start questioning, is this really a good choice?");
                    System.out.println("Suddenly, you feel someone throw a bag over your head and you hear the loading of a gun. \nEverything goes black.");
                    System.out.println("-------------------------------------------------------- *silence*");
                    System.out.println("“Hey, this guy’s rich! Nice job, kitty cat!”\n" +
                            "\t\t“Cool. Now, where do we hide the body?”");
                    System.out.println("You have reached the ending: [Curiosity killed the player]");
                    gameOver();
                }
            }
        }

        //2 beach
        else{
            System.out.println("You arrive at the beach. The water is clear and pleasant. ");
            System.out.println("This looks like the perfect place to go for a swim.");
            System.out.println("There's also a grassy hill nearby.");
            System.out.println("Do you want to swim in the ocean or investigate the hill?");
            printChoices("swim", "investigate");
            String choiceTwoAlt = input.next();

            for (boolean t = choiceTwoAlt.equals("swim") || choiceTwoAlt.equals("investigate"); !t; t = choiceTwoAlt.equals("swim") || choiceTwoAlt.equals("investigate")){
                System.out.println("This is not a valid option, try again: ");
                choiceTwoAlt = input.next();
            }

            //3 swim
            if (choiceTwoAlt.equals("swim")){
                System.out.println("You enjoy a relaxing swim in the beautiful water. You swim further until you find a fish. ");
                System.out.println("The fish tells you to go back to the shore as there is something dangerous ahead. What do you do?");
                printChoices("back", "ahead");
                String choiceThreeSwim = input.next();

                for (boolean t = choiceThreeSwim.equals("back") || choiceThreeSwim.equals("ahead"); !t; t = choiceThreeSwim.equals("back") || choiceThreeSwim.equals("ahead")){
                    System.out.println("This is not a valid option, try again: ");
                    choiceThreeSwim = input.next();
                }

                //4 go back
                if (choiceThreeSwim.equals("back")){
                    System.out.println("It’s best to not take any chances with the unknown depths of the sea, so you pick up the pace and swim back to shore.");
                    System.out.println("A triangular fin-like object zooms by the horizon. \n“Nope, not today, I’m not going to deal with this! I'm not gonna get eaten by a shark!!”");
                    System.out.println("You recall an incident of people being intrigued by the mysteries of the deep sea, so they decide to go on a submarine trip. The submarine never returned.");
                    System.out.println("“I’m not gonna be like that submarine”, you say to yourself, “I’m going to survive!” \nYou pant and gasp for air, desperately pushing yourself against the waves.");
                    System.out.println("You collapse onto the shore, absolutely exhausted. \nSurprisingly, the fish walks in front of you. It somehow has arms and legs...");
                    System.out.println("You’re quite stunned by this addition of limbs, but you’re too tired to question anything anymore.");
                    System.out.println("“Thank goodness you listened to my warning! There’s a giant shark over there, and I’ve seen it happen too many times…”");
                    System.out.println("“Seen… what happen?” You mutter slowly.");
                    System.out.println("“There have also been some travellers who found the beach. It’s beautiful, isn’t it?”");
                    System.out.println("“Unfortunately, people have a tendency of sacrificing themselves for pleasure. It’s a stupid thing to do.”");
                    System.out.println("You nod at the thought that this fish is quite wise. “Hey, at least I managed to live.”");
                    System.out.println("You take a nap and continue your life by the beach, living off unfortunate shrimp that got washed up on the shore.");
                    System.out.println("The fish ends up becoming your friend, and the two of you share interesting philosophical discussions.");
                    System.out.println("You give the fish a pinecone as a trade of friendship. “So this is a pinecone, huh… I haven’t seen any of these before in the sea!”");
                    System.out.println("You have reached the ending: [Better safe than sorry]");
                    win();
                }

                //4 go ahead
                else{
                    System.out.println("You think to yourself, why not go ahead? \nLife is short, after all, might as well spend it doing something fun.");
                    System.out.println("You pick up your swimming pace and pursue the deeper waters up ahead.");
                    System.out.println("The fish desperately screams as it flails its fins around, “Don’t go there! Are you trying to get yourself killed?”");
                    System.out.println("You reply, “Nah, I’m just having some fun! Here, watch over my pinecones for me.”");
                    System.out.println("You toss your bag of pinecones into the water, and dive below the water and observe the beautiful coral reef.");
                    System.out.println("Until it starts going darker, and darker, and darker…");
                    System.out.println("  D\n     A\n        R\n           K\n              E\n                 R");
                    System.out.println("You feel immense pressure surrounding you. \n     You feel sharp teeth crushing against you. \n          Then, you feel nothing.");
                    System.out.println("Your bones get decimated and you lose all consciousness before you could even scream.");
                    System.out.println("-------------------------------------------------------- *silence*");
                    System.out.println("“What a stupid way to visit the afterlife. I almost feel bad for you. At least you left a souvenir behind for me- I think pinecones are cool.”");
                    System.out.println("You have reached the ending: [You only live once]");
                    gameOver();
                }
            }

            //3 investigate
            else{
                System.out.println("You find a flat and grassy field next to the beach. The air is crisp and fresh.");
                System.out.println("This is the perfect place to take a nap. ");
                System.out.println("Or alternatively, you could have some fun, go back to the beach, and build a sand castle!");
                printChoices("nap", "sandcastle");
                String choiceThreeInv = input.next();

                for (boolean t = choiceThreeInv.equals("nap") || choiceThreeInv.equals("sandcastle"); !t; t = choiceThreeInv.equals("nap") || choiceThreeInv.equals("sandcastle")){
                    System.out.println("This is not a valid option, try again: ");
                    choiceThreeInv = input.next();
                }

                //nap
                if (choiceThreeInv.equals("nap")){
                    System.out.println("You lie down on the soft, fluffy grass. The sunlight is warm, and there is a gentle breeze. ");
                    System.out.println("You fall asleep in no time, and you start dreaming.");
                    System.out.println("In one dream, you are a traveler that got separated from their sibling and is set to explore a new world.");
                    System.out.println("In another dream, you wake up at a space station and end up developing an obsession with trash cans.");
                    System.out.println("In your dreams, you meet lots of new people, and accomplish various achievements.");
                    System.out.println("There’s too many dreams… and you still want more… maybe as a break from this boring reality?");
                    System.out.println("The tide rises a bit too high and a drop of seawater splashes on your face. This brings you back to the present world.");
                    System.out.println("It’s so empty, so miserable, devoid of anything exciting.");
                    System.out.println("Of all the possible endings of your fate, you just had to get the worst one.");
                    System.out.println("If only there was a way to warp your destiny and forge a thrilling and enriching path ahead.");
                    System.out.println("You decide to end it all. You plummet into the depths of the ocean, never to be seen again.");
                    System.out.println("A small bag with three brown and prickly pinecones remain on the grass, eternally dormant.");
                    System.out.println("You have reached the ending: [Distorted Fate]");
                    gameOver();
                }

                //sandcastle
                else{
                    System.out.println("You find a small red bucket half-buried in the sand. How convenient.");
                    System.out.println("It’s almost as if the universe spawned it there for your usage.");
                    System.out.println("You carefully prepare the perfect ratio of sand and seawater, and you lay down the first brick of your new castle.");
                    System.out.println("The sun rises and sets, the horizon shifts between red and blue, and the tides rise and fall. \nOver time, your kingdom begins to expand.");
                    System.out.println("With some convenient shrimp provided by a friendly walking fish and a small fire, you were able to not only survive, but to thrive.");
                    System.out.println("You look at the towering castle before you. A month of effort, none of which have gone to waste.");
                    System.out.println("Despite it being made out of sand, the main towers are stable. There are some intricate details and patterns etched into the surface.");
                    System.out.println("This new kingdom has seen many inhabitants, including crabs and birds.");
                    System.out.println("You make some finishing touches- you place the tiny red bucket and your pinecones on the roof of the tallest building.");
                    System.out.println("And thus, with your signature on the canvas, your masterpiece is complete.");
                    System.out.println("You have reached the ending: [Artist of humble origin]");
                    win();
                }
            }
        }

    }
}