package Attacks;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }


}
