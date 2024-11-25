package Attacks;

import ru.ifmo.se.pokemon.*;

public final class Astonish extends PhysicalMove{
    public Astonish(){
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected String describe() {
        return "применяет Astonish";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.3)
            Effect.flinch(p);
    }

}
