package Hurdles;

import de.ur.mi.bouncer.apps.BouncerApp;

public class Hurdles extends BouncerApp {

    @Override
    public void bounce() {
    loadMap("Hurdles");
    climbHurdles();
    }

    /**
     * Bouncer klettert über die drei ersten Hindernisse vor ihm
     *
     * Pre-Condition: Bouncer befindet sich am Boden vor dem ersten Hindernis und blickt nach Westen
     * Post-Condition: Bouncer befindet sich am Boden hinter dem dritten Hindernis und blickt nach Westen
     */
    private void climbHurdles() {
        moveToFirstHurdle();
        for(int i = 0; i < 3; i++) {
            jumpOverHurdle();
        }
    }

    /**
     * Bouncer bewegt sich zum ersten Hindernis
     *
     * Pre-Condition: Bouncer befindet sich beliebig viele Felder vor dem ersten Hindernis
     * Post-Condition: Bouncer befindet sich direkt vor dem ersten Hindernis
     */
    private void moveToFirstHurdle() {
        while(bouncer.canMoveForward()) {
            bouncer.move();
        }
    }

    /**
     * Bouncer übersteigt ein einzelnes Hindernis
     *
     * Pre-Condition: Bouncer befindet sich direkt vor dem Hindernis, steht an dessen unterem Ende und blickt nach Westen
     * Post-Condition: Bouncer befindet sich direkt hinter dem Hindernis, steht an dessen unterem Ende und blickt nach Westen
     */
    private void jumpOverHurdle() {
        ascendHurdle();
        bouncer.move();
        descendHurdle();
    }

    /**
     * Bouncer klettert auf das vor ihm liegende Hindernis
     *
     * Pre-Condition: Bouncer befindet sich direkt vor dem Hindernis, steht an dessen unterem Ende und blickt nach Westen
     * Post-Condition: Bouncer befindet sich auf der Spitze des Hindernis und blickt nach Westen
     */
    private void ascendHurdle() {
        bouncer.turnLeft();
        while(bouncer.canNotMoveRight()) {
            bouncer.move();
        }
        turnRight();
        bouncer.move();
    }

    /**
     * Bouncer klettert das vor ihm liegende Hindernis herab
     *
     * Pre-Condition: Bouncer befindet sich auf der Spitze des Hindernis und blickt nach Westen
     * Post-Condition: Bouncer befindet sich direkt am Fuße des überwundenen Hindernisses und blickt nach Westen
     */
    private void descendHurdle() {
        turnRight();
        while(bouncer.canMoveForward()) {
            bouncer.move();
        }
        bouncer.turnLeft();
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
