package com.worldnet.test.weapons.core;

import com.worldnet.test.weapons.Weapon;
import com.worldnet.test.weapons.WeaponType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Swaroop.Vincent on 20/02/2017.
 */
public class WeaponStore implements WeaponProvider, WeaponRegistry {

    private Map<WeaponType, Weapon> weaponRepository;

    public WeaponStore() {
        weaponRepository = new HashMap<WeaponType, Weapon>();
    }

    public void register(final WeaponType type, final Weapon weapon) {
        weaponRepository.put(type, weapon);
    }

    public Weapon getWeapon(final WeaponType type) {
        return weaponRepository.get(type);
    }
}
