package Attacks;

import ru.ifmo.se.pokemon.*;

public final class IronTail extends PhysicalMove{
    public IronTail(){
        super(Type.NORMAL, 100, 75);
    }

    @Override
    protected String describe() {
        return "применяет Iron Tail";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.3)
            p.setMod(Stat.DEFENSE, -1);
    }

    
}




