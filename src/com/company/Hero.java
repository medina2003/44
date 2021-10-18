package com.company;

public abstract class Hero implements HavingSuperAbility {
private int health;
private int damage;
private String superAttack;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAttack() {
        return superAttack;
    }

    public void setSuperAttack(String superAttack) {
        this.superAttack = superAttack;
    }
}
