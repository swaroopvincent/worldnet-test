package com.worldnet.test.weapons;

/**
 * Created by Swaroop.Vincent on 20/02/2017.
 */
public enum WeaponType {

    BOW_AND_ARROW("Bow and Arrow"),
    REVOLVER("Revolver"),
    BASEBALL("Baseball");

    private String weaponType;

    WeaponType(final String type) {
        this.weaponType = type;
    }

    public String getType() {
        return weaponType;
    }
}
