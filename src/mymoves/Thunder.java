package mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Thunder extends SpecialMove {
    public Thunder(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
            if (Math.random() <= 0.3) {
                paralyze(pokemon);
            }


    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }
}
