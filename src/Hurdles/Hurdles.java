package Hurdles;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class Hurdles extends BouncerApp {

    public static void main(String[] args) {
        BouncerLauncher.launch("Hurdles");
    }

    /**
     * Bouncers Aufgabe: Klettere über die drei Hindernisse vor dir und bleibe hinter dem letzten Hindernis stehen!
     */

    @Override
    public void bounce() {
    loadMap("Hurdles");
    }
}
