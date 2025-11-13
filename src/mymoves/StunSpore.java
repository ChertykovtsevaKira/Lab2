package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class StunSpore extends StatusMove {
    public StunSpore(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.paralyze(pokemon);
    }
}