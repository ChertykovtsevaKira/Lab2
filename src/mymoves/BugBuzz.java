package mymoves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz(double pow, double acc) {
        super(Type.BUG, pow, acc);

    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);

    }
}


