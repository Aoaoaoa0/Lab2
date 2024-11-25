package Attacks;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет Confide";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

}
