package Q17;

public class Q17 {
	private static boolean a = false;
	private static int count = 0;

	public static void main(String[] args) {
		execute();
		System.out.println("最終結果:" + count);
	}

	private static void execute() {
		int y = 1;
		executeImpl(true, y);
		executeImpl(false, y);
	}

	private static void executeImpl(boolean boo, int i) {
		int j = i++;
		if (31 <= j) {
			check(boo);
			return;
		}
		if (boo) {
			executeImpl(true, j);
			executeImpl(false, j);
		} else {
			executeImpl(true, j);
		}
	}

	/**
	 * @param boo
	 *            30人目が男性と女性どちらか 男性なら続きは男性でも女性でもok, 女性なら男性のみ
	 */
	private static void check(boolean boo) {
		if (boo) {
			count = count + 2;
		} else {
			count = count + 1;
		}
	}
}
