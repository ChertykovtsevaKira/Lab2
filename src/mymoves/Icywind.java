package mymoves;

import ru.ifmo.se.pokemon.*;

public class Icywind extends SpecialMove {
    public  Icywind(double pow, double acc){
        super(Type.ICE, pow,acc);
    }
    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e = new Effect().stat(Stat.SPEED, -1);
    }
}

