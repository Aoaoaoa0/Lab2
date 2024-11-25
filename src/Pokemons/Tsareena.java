package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Tsareena extends Pokemon{
    public Tsareena (String name, int level){
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(72, 120, 98, 50, 98, 72);
        this.setMove(new Splash(), new Rest(), new PlayNice(), new EnergyBall());

    }

}
