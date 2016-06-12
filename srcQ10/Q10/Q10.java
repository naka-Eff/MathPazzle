package Q10;

import com.gs.collections.api.list.MutableList;

public class Q10 {
	private final static MutableList<Integer> elist = rule.getEList();
	private final static MutableList<Integer> alist = rule.getAList();
	private final static int start = 2;
	private final static int end = 36;
	private static int value = 0;
	private static int count = 0;

	public static void main(String[] args) {
		execute();
		System.out.println(count);
	}

	private static void execute() {
		if (start + value >= 37) {
			return;
		}
		if (Eu() < Am()) {
			count++;
		}
		value++;
		execute();
	}

	/**
	 * @return ヨーロピアンスタイルx回足した際の最大値
	 */
	private static int Eu() {
		int max = 0;
		for (int val = 0; val <= 36; val++) {
			int x = plus(val);
			max = max > x ? max : x;
		}
		return max;
	}

	private static int Am() {
		int max = 0;
		for (int val = 0; val <= 37; val++) {
			int x = plusA(val);
			max = max > x ? max : x;
		}
		return max;
	}

	/**
	 * @param val
	 *            ヨーロピアン現在のルーレットの位置
	 * @return 何回足すかの値
	 */
	private static int plus(int val) {
		int add = 0;
		for (int vals = 0; vals <= start + value; vals++) {
			add = add + elist.get(val + vals);
		}
		return add;
	}

	/**
	 * @param val
	 *            現在のルーレットの位置
	 * @return 何回足すかの値
	 */
	private static int plusA(int val) {
		int add = 0;
		for (int vals = 0; vals <= start + value; vals++) {
			add = add + alist.get(val + vals);
		}
		return add;
	}
}
