package Attacks;

import ru.ifmo.se.pokemon.*;

public final class PlayNice extends StatusMove{
    public PlayNice(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет PlayNice";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }

}
