package com.aaron.volleyproject;

public class HeroMod {
    private String heroName;
    private String heroAttr;
    private String heroAttack;
    private String heroImg;

    public String getHeroName() {
        return heroName;
    }

    public String getHeroAttr() {
        return heroAttr;
    }

    public String getHeroAttack() {
        return heroAttack;
    }

    public String getHeroImg() {
        return heroImg;
    }

    public HeroMod(String heroName, String heroAttr, String heroAttack, String heroImg) {
        this.heroName = heroName;
        this.heroAttr = heroAttr;
        this.heroAttack = heroAttack;
        this.heroImg = heroImg;
    }
}
