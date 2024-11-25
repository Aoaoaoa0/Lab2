package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;


public class Kecleon extends Pokemon{
    public Kecleon (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(60,90,70,60,120,40);
        this.setMove(new DizzyPunch(), new IronTail(), new Astonish(), new RockTomb());

    }

}
