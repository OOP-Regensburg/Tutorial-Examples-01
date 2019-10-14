package RunningAround;

import de.ur.mi.bouncer.apps.BouncerApp;

public class RunningAround  extends BouncerApp {

    /**
     * Bouncers Aufgabe: Laufe entlang des Randes um die Karte. Höre nicht damit auf!
     */

    @Override
    public void bounce() {
        loadMap("Empty");
    }
}
