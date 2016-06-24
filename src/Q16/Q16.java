package Q16;

import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.api.map.ImmutableMap;

public class Q16 {
	private static Q16logic logic = new Q16logic();
	private static boolean boo = false;

	public static void main(String[] args) {
		/** 紐の長さ/2とその紐の長さの正方形の面積の詰まったマップ */
		ImmutableMap<Integer, Integer> map = logic.getMap();
		System.out.println("結果:" + execute(map));
	}

	private static int execute(ImmutableMap<Integer, Integer> map) {
		int mapSize = map.size();
		int count = 0;
		for (int value = 1; value <= mapSize; value++) {
			int menseki = map.get(value);
			if (culculate(value, menseki)) {
				count++;
				System.out.println(value);
			}
		}
		return count;
	}

	/**
	 * @param x
	 * @param y
	 * @return その紐の長さが正方形と等しくなる組み合わせがあったかどうか
	 */
	private static boolean culculate(int x, int y) {
		int xx = x * 2;
		/** その紐の長さで可能な面積の詰まったリスト */
		ImmutableList<Integer> list = logic.getList(xx);
		if (check(list, y)) {
			return true;
		}
		return false;
	}

	private static boolean check(ImmutableList<Integer> list, int y) {
		boo = false;
		list.each(num -> {
			list.each(number -> {
				if (y == num + number) {
					boo = true;
					System.out.println(num + ":" + number + ":" + y);
				}
			});
		});
		return boo;
	}
}
