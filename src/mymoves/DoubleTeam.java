package mymoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect e = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(e);
    }
}
