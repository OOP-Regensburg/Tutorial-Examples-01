package HelloBouncer;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class HelloBouncer extends BouncerApp {

    public static void main(String[] args) {
        BouncerLauncher.launch("HelloBouncer");
    }

    @Override
    public void bounce() {
        loadMap("Empty");
        bouncer.move();
        climbObstacle();
        bouncer.move();
    }

    /**
     * Bouncer betritt das vor ihm liegende Hindernis
     *
     * Pre-Condition: Bouncer befindet sich direkt vor dem Hindernis und blickt nach Westen
     * Post-Condition: Bouncer befindet sich über/auf dem ersten Feld des Hindernis
     */
    public void climbObstacle() {
        bouncer.turnLeft();
        bouncer.move();
        bouncer.turnLeft();
        bouncer.turnLeft();
        bouncer.turnLeft();
        bouncer.move();

    }
}
