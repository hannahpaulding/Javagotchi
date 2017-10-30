import java.util.Scanner;
public class Game
{
    boolean userQuits = false;
    Creature creature;
    Scanner kb = new Scanner(System.in);

    public void run()
    {
        startTutorial();

        while (!userQuits)
        {
            interact();
            System.out.println(this.creature.checkStatus());
        }
    }

    private void startTutorial()
    {
        System.out.println("Hi there! Welcome to Javagotchi!");
        System.out.println("What's the name of your creature?");
        String name = kb.nextLine();

        this.creature = new Creature(name);
        System.out.println("Great, you can now meet " + this.creature.getName() + "!");

    }

    private void interact()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Play\n2.Eat\n3. Sleep\n4. Quit");
        int choice = kb.nextInt();
        switch (choice)
        {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                System.out.println("Error! You have to pick a number between 1 and 4!");
                break;
        }
    }
}
