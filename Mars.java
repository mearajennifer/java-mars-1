import java.util.Scanner;

class Mars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your space name?");
        String name = input.nextLine();

        System.out.println("What color is your spacesuit?");
        String color = input.nextLine();

        System.out.println("How long is your mission?");
        String missionLength = input.nextLine();

        System.out.println("What is your space skill?");
        String skill = input.nextLine();

        System.out.println("What is your space pet's name?");
        String petName = input.nextLine();

        System.out.println("Welcome, " + name + "! I like your " + color + " spacesuit. Your mission on Mars will last " + missionLength + ". We really need your skill, " + skill + ", to help the colony thrive. Your pet, " + petName + ", is so cute!");
    }
}