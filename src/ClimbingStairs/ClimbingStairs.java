package ClimbingStairs;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class ClimbingStairs extends BouncerApp {

    public static void main(String[] args) {
        BouncerLauncher.launch("ClimbingStairs");
    }

    /**
     * Bouncers Aufgabe: Steige die vor dir liegende Treppe hinauf und bleibe auf der obersten Stufe stehen!
     */

    @Override
    public void bounce() {
        loadMap("Stairs");
    }
}
