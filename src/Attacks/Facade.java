package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "применяет Facade";
    }

}