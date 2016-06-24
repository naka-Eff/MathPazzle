package Q16;

import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.api.map.ImmutableMap;
import com.gs.collections.api.map.MutableMap;
import com.gs.collections.impl.factory.Lists;
import com.gs.collections.impl.factory.Maps;

public class Q16logic {

	public Q16logic() {

	}

	/**
	 * @return ひもの長さ500までの正方形の辺の長さと、正方形の面積の詰まったリスト
	 *         正方形の合計と合うものが必要なため、余分なものは計算しないこと。
	 */
	public ImmutableMap<Integer, Integer> getMap() {
		MutableMap<Integer, Integer> map = Maps.mutable.of();
		for (int x = 1; x * 4 <= 500; x++) {
			map.put(x, x * x);
		}
		return map.toImmutable();
	}

	/**
	 * @return 紐の長さ/2の面積の入ったリスト 正方形*2になるため、colmは必ず偶数になる。
	 */
	public ImmutableList<Integer> getList(int colm) {
		MutableList<Integer> list = Lists.mutable.of();
		/** 面積の種類の為、半分未満まで計算(二乗は避けるため、未満) */
		int max = colm / 2;
		for (int value = 1; value < max; value++) {
			list.add(value * (colm - value));
		}
		return list.toImmutable();
	}
}
