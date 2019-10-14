package Hurdles;

import de.ur.mi.bouncer.apps.BouncerApp;

public class Hurdles extends BouncerApp {

    /**
     * Bouncers Aufgabe: Klettere über die drei Hindernisse vor dir und bleibe hinter dem letzten Hindernis stehen!
     */

    @Override
    public void bounce() {
    loadMap("Hurdles");
    }
}
