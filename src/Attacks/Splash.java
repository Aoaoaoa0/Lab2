package Attacks;

import ru.ifmo.se.pokemon.*;

public final class Splash extends StatusMove{
    public Splash(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет Splash";
    }

}
