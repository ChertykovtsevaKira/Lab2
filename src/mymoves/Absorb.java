package mymoves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double damage = super.calcBaseDamage(att, def);
        if (damage > 0) {
            int heal = (int) (damage * 0.5);
            att.setMod(Stat.HP, heal);
        }
            return damage;

    }
}



