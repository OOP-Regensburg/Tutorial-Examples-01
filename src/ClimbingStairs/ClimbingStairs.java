package ClimbingStairs;

import de.ur.mi.bouncer.apps.BouncerApp;

public class ClimbingStairs extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Stairs");
        climbStairs();
    }

    private void climbStairs() {
        // Vor Beginn des Stufenaufstiegs richten wir Bouncer initial nach Norden aus
        bouncer.turnLeft();
        // Solange Bouncer eine Ebene höher steigen kann, steigt er auf die nächste Stufe
        while(bouncer.canMoveForward()) {
            climbOneStair();
            // Bouncer wird vo dem nächsten Schritt nach Norden ausgerichtet
            bouncer.turnLeft();
        }
        // Auf der obersten Stufe angekommen richten wir Bouncer zu letzt nach WESTEN aus
        turnRight();
    }

    /**
     * Bouncer steigt eine Stufe der Treppe hoch
     *
     * Pre-Condition: Bouncer blickt nach Norden und steht direkt vor der Stufe
     * Post-Condition: Bouncer befindet sich auf der Stufe und blickt nach Westen
     */
    private void climbOneStair() {
        bouncer.move();
        turnRight();
        bouncer.move();
    }

    /**
     * Bouncer dreht sich um 90 Grad nach rechts
     *
     * Pre-Condition: -
     * Post-Condition: Bouncers Blickrichtung hat sich um 90 Grad nach Rechts verschoben
     */
    private void turnRight() {
        bouncer.turnLeft();
        bouncer.turnLeft();
        bouncer.turnLeft();
    }
}
