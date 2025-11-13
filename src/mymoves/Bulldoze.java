package mymoves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect e = new Effect().stat(Stat.SPEED, -1);
        pokemon.addEffect(e);

    }
}
