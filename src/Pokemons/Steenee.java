package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Steenee extends Pokemon{
    public Steenee (String name, int level){
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(52, 40, 48, 40, 48, 62);
        this.setMove(new Splash(), new Rest(), new PlayNice());

    }

}
