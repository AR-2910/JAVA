import java.util.Random;
import java.util.Scanner;

//generate a quote/password/fun fact
public class Generator {
    public static void main(String[] args) {

        System.out.println("WELCOME!!!");
        System.out.println();
        System.out.println("PRESS 1 FOR A MOTIVATIONAL QUOTE");
        System.out.println("PRESS 2 FOR A PASSWORD");
        System.out.println("PRESS 3 FOR A FUN FACT");
        System.out.print("=>");

        //take user input based on their requirements
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        System.out.println();


        switch (choice){
            case 1: //generate a motivational quote

                System.out.println("WELCOME TO INSPIRIO QUOTES :) ");
                System.out.println();

                String[] quotes={"Don't wait for the stars to align, create your own constellation.",
                    "Success is a journey, not a destination. Enjoy the ride.",
                    "The scars you bear are the proof of the battles you've won.",
                    "Doubt kills more dreams than failure ever will.",
                    "The past is a place of reference, not a place of residence.",
                    "Embrace uncertainty, for it is the path to growth.",
                    "Life is a dance between making it happen and letting it happen.",
                    "Dreams don't work unless you do.",
                    "Don't count the days; make the days count.",
                    "A diamond is just a piece of charcoal that handled stress exceptionally well.",
                    "Don't be afraid to stand for what you believe in, even if it means standing alone.",
                    "The best time to plant a tree was 20 years ago. The second-best time is now.",
                    "You are not a drop in the ocean; you are the entire ocean in a drop.",
                    "In the end, we only regret the chances we didn't take.",
                    "The best revenge is massive success." };

                int random_quote = new Random().nextInt(quotes.length);
                //gives random index value from 'quotes' array.

                System.out.println("Your Quote: "+quotes[random_quote]);
                //print selected random quote

                break;


            case 2: //generate a password
                System.out.println("WELCOME TO PASSKEYGEN :0 ");
                System.out.println();
                System.out.println("ENTER LENGTH OF REQUIRED PASSWORD:");
                System.out.print("=>");
                //input desired length from user
                int length=input.nextInt();

                //all possible characters that can be used
                String nums="1234567890";
                String chars="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
                String special="!@#$%^&*";

                String temp=nums+chars+special;

                StringBuilder password = new StringBuilder();

                //ensuring atleast one of each type is present
                password.append(nums.charAt(new Random().nextInt(nums.length())));
                password.append(chars.charAt(new Random().nextInt(chars.length())));
                password.append(special.charAt(new Random().nextInt(special.length())));


                for(int i=3;i<=length;i++){  //filling rest of the password length
                    int randompswrd = new Random().nextInt(temp.length());
                    password.append(temp.charAt(randompswrd));
                }

                String result = password.toString();

                //print generated password after shuffling its characters to create randomness
                System.out.println("PASSWORD: "+shuffle(result));

                break;


            case 3://generate a fun facts
                System.out.println("WELCOME TO FACTFRENZY ;) ");
                System.out.println();
                String[] facts={"Octopuses have three hearts, and blue blood.",
                        "Octopuses have three hearts, and blue blood.",
                        "The unicorn is Scotland's national animal.",
                        "Cows have best friends and can become stressed when separated.",
                        "There are more possible iterations of a game of chess than atoms in the observable universe.",
                        "A day on Venus is longer than a year on Venus.",
                        "The world's largest desert is Antarctica, not the Sahara.",
                        "A jiffy is an actual unit of time, defined as 1/100th of a second in electronics.",
                        "The world's rarest diamond is called 'The Pink Star' and sold for $71.2 million.",
                        "Giraffes have the same number of neck vertebrae as humans (seven).",
                        "The tongue is the only muscle in the human body that works without any support from the skeleton.",
                        "A group of owls is called a 'parliament.",
                        "The surface area of Russia is larger than the surface area of Pluto.",
                        "The longest word without a vowel is 'rhythms'.",
                        "Honeybees can recognize human faces."};

                //gives random index to choose fact from
                int random_fact = new Random().nextInt(facts.length);

                //print selected random fun fact
                System.out.println("Your Fun Fact: "+facts[random_fact]);

                break;


            default:
                System.out.println("INVALID INPUT!");
        }

        System.out.println();
        System.out.println("We're glad you stopped by. Come back for more inspiration, security, or fun anytime ^_^ ");


    }

    //function to shuffle characters of a string used in password generator.
    public static String shuffle(String input){
        char[] chars=input.toCharArray();
        Random r = new Random();

        for(int i=0;i< chars.length-1;i++){
            int randomindex = r.nextInt(chars.length);

            char temp = chars[i];
            chars[i]=chars[randomindex];
            chars[randomindex]=temp;
        }
        return new String(chars);
    }

}
