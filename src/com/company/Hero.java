package com.company;

public abstract  class Hero implements HavingSuperAbility  {
    private int health;
    private int damege;
    private String superAttack;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }

    public String getSuperAttack() {
        return superAttack;
    }

    public void setSuperAttack(String superAttack) {
        this.superAttack = superAttack;
    }
}
