package HelloBouncer;

import de.ur.mi.bouncer.apps.BouncerApp;

public class HelloBouncer extends BouncerApp {

    /**
     * Bouncers Aufgabe: Klettere auf das Hindernis und bleibe auf dem roten Feld stehen!
     */

    @Override
    public void bounce() {
        loadMap("HelloBouncer");
    }
}
