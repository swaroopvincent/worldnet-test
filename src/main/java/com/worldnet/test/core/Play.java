package com.worldnet.test.core;

import com.worldnet.test.players.*;
import com.worldnet.test.players.Character;
import com.worldnet.test.weapons.*;
import com.worldnet.test.weapons.core.WeaponProvider;
import com.worldnet.test.weapons.core.WeaponRegistry;
import com.worldnet.test.weapons.core.WeaponStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Swaroop.Vincent on 20/02/2017.
 */
public class Play {

    private WeaponStore weaponStore;
    private List<Character> players;
    private List<WeaponType> weaponTypes;

    public Play() {
        weaponStore = new WeaponStore();
        buildWeaponRepository(weaponStore);
        players = new ArrayList<Character>();
        buildPlayersForTheGame();
        buildWeaponTypesOfTheGame();
    }

    private void buildWeaponRepository(final WeaponRegistry weaponRegistry) {
        weaponRegistry.register(WeaponType.BOW_AND_ARROW, new Arrow());
        weaponRegistry.register(WeaponType.BASEBALL, new BaseBall());
        weaponRegistry.register(WeaponType.REVOLVER, new Revolver());
    }

    private void buildPlayersForTheGame() {
        players.add(new Rick());
        players.add(new Daryl());
        players.add(new Michonne());
        players.add(new Negan());
    }

    private void buildWeaponTypesOfTheGame() {
        weaponTypes = new ArrayList<WeaponType>();
        weaponTypes.add(WeaponType.BOW_AND_ARROW);
        weaponTypes.add(WeaponType.BASEBALL);
        weaponTypes.add(WeaponType.REVOLVER);
    }

    public Character getMyFighter() {
        final Random random = new Random();
        return players.get(random.nextInt(4));
    }

    public Weapon getMyWeapon(final WeaponProvider weaponProvider) {
        final Random random = new Random();
        final WeaponType weaponType = weaponTypes.get(random.nextInt(3));
        return weaponProvider.getWeapon(weaponType);
    }

    void start() throws InterruptedException {
        final Character character = getMyFighter();
        System.out.println("## Game started ##");
        System.out.println("Player :: " + character.getName());
        do {
            Weapon weapon = getMyWeapon(weaponStore);
            weapon.execute();
            Thread.sleep(1000);
        } while(true);
    }

    public static void main(String[] args) throws InterruptedException {
        Play play = new Play();
        play.start();
    }
}
