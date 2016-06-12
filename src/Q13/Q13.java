package Q13;

public class Q13 {

	public static void main(String[] args) {
		Contener contener = Contener.getInstance();
		LogicQ13 logic = new LogicQ13();
		logic.start(contener);
	}
}