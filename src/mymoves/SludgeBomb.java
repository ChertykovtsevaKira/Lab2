package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;

import static ru.ifmo.se.pokemon.Type.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(double pow, double acc) {
        super(POISON, pow, acc);
    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);


        if (Math.random() <= 0.3) {
                Effect.poison(pokemon);
            }
        }
    }
