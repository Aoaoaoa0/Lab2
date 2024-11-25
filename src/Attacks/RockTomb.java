package Attacks;

import ru.ifmo.se.pokemon.*;


public final class RockTomb extends PhysicalMove{
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected String describe(){
        return "применяет Rock Tomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }

}
