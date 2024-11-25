package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Snover extends Pokemon{
    public Snover (String name, int level){
        super(name, level);
        this.setType(Type.GRASS, Type.ICE);
        this.setStats(60, 62, 50, 62, 60, 40);
        this.setMove(new Facade(), new Rest(), new Confide());

    }

}
