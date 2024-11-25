package Attacks;

import ru.ifmo.se.pokemon.*;

public final class DizzyPunch extends PhysicalMove{
    public DizzyPunch(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "применяет DizzyPinch";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.2)
            Effect.confuse(p);
    }

}
