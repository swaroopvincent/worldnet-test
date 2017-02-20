package com.worldnet.test.weapons.core;

import com.worldnet.test.weapons.Weapon;
import com.worldnet.test.weapons.WeaponType;

/**
 * Created by Swaroop.Vincent on 20/02/2017.
 */
public interface WeaponProvider {

    /**
     * The interface that can be used by the game core to retrieve
     * registered weapons in the game.
     * @param type The type of the weapon needed.
     * @return A weapon.
     */
    Weapon getWeapon(final WeaponType type);
}
