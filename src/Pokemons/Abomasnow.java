package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Abomasnow extends Pokemon{
    public Abomasnow (String name, int level){
        super(name, level);
        this.setType(Type.GRASS,Type.ICE);
        this.setStats(90,92, 75, 92, 85, 60);
        this.setMove(new Facade(), new Rest(), new Confide(), new FocusBlast());

    }

}
