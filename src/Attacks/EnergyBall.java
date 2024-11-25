package Attacks;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "применяет Energy Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.1)
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

}
