package com.worldnet.test.weapons.core;

import com.worldnet.test.weapons.Weapon;
import com.worldnet.test.weapons.WeaponType;

/**
 * Created by Swaroop.Vincent on 20/02/2017.
 */
public interface WeaponRegistry {

    /**
     * The service for registering weapons to the game.
     * @param type The type of the weapon.
     * @param weapon The instance of weapon.
     */
    void register(final WeaponType type, final Weapon weapon);
}
