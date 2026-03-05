public class Projector implements PowerControllable {
    private boolean on;

    @Override public void powerOn() { on = true; }
    @Override public void powerOff() { on = false; System.out.println("Projector OFF"); }

   
}
