package RunningAround;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class RunningAround  extends BouncerApp {

    public static void main(String[] args) {
        BouncerLauncher.launch("RunningAround");
    }

    /**
     * Bouncers Aufgabe: Laufe entlang des Randes um die Karte. Höre nicht damit auf!
     */

    @Override
    public void bounce() {
        loadMap("Empty");
    }
}
