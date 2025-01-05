import java.util.*;
 class Season
{
    enum Seasons
    {
        WINTER(5),
        SPRING(-3),
        SUMMER(15),
        FALL(2);
    private int tempe;
    
    Seasons(int tempe)
    {
        this.temperature=tempe;
    }
    public int gettemperature()
    {
        return tempe;
    }
    }
    
    public static void main (String[] args) {
        for(Seasons season:Seasons.values())
        {
            System.out.println(season+" "+season.gettemperature());
        }
    }
}

