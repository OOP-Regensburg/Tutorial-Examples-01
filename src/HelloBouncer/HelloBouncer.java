package HelloBouncer;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class HelloBouncer extends BouncerApp {

    public static void main(String[] args) {
        BouncerLauncher.launch("HelloBouncer");
    }

    /**
     * Bouncers Aufgabe: Klettere auf das Hindernis und bleibe auf dem roten Feld stehen!
     */

    @Override
    public void bounce() {
        loadMap("HelloBouncer");
    }
}
