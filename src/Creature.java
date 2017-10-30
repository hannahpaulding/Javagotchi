public class Creature
{
    int energy, fullness, happiness;
    String name;

    public Creature(String name)
    {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //
    public void eat()
    {
        if (fullness >= 12)
        {
            p("Whoops " + this.getName() + "is already full!");
        }
        else
        {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if(fullness > 15)
            {
                fullness = 15;
            }

            p("Yum! " + this.getName() + " really enjoyed that!");
        }

    }

    public void sleep()
    {
        if (energy >= 12)
        {
            p("Whoops " + this.getName() + "is not that sleepy!");
        }
        else
        {
            energy += 8;
            happiness -= 5;
            fullness -= 5;

            if(energy > 15)
            {
                energy = 15;
            }

            p("*Yawn* That was a good nap!");
        }
    }

    public void play()
    {
        happiness += 8;
        energy -= 6;
        fullness -= 4;

        if(happiness > 15)
        {
            happiness = 15;
        }

        p("That was so much fun! Let's do this again!");
    }

    public String checkStatus()
    {
        String s = "";
        if (happiness <= 6)
        {
            s += "Oh, " + this.getName() + "is feeling sad!\n";
        }
        if (energy <= 6)
        {
            s += "Hmmm, " + this.getName() + "is getting tired!\n";
        }
        if (fullness <= 6)
        {
            s += "Aw, " + this.getName() + "is a little hungry!\n";
        }
        return s;
    }

    public void p(String s)
    {
        System.out.println(s);
    }

}

