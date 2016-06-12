package Q14;

import java.util.Optional;

import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.api.map.MutableMap;
import com.gs.collections.impl.factory.Lists;
import com.gs.collections.impl.factory.Maps;

public class Q14Logic {
	private static MutableMap<Integer, String> map = Maps.mutable.of();
	private static int count = 0;

	public Q14Logic() {

	}

	public void run(ImmutableList<String> list) {
		list.each(country -> {
			String lastName = Search(country);
			// この先はgs collectionでかけない
			Optional<ImmutableList<String>> xxx = xxx(lastName, list, Lists.mutable.of(country));
			if (xxx.isPresent()) {
				runs(Lists.immutable.ofAll(xxx.get()), Lists.mutable.of(country));
			}

		});

		// 結果発表
		System.out.println(map);
		System.out.println(map.size());
	}

	public void runs(ImmutableList<String> list, MutableList<String> lists) {
		list.each(country -> {
			String lastName = Search(country);
			Optional<ImmutableList<String>> xxx = xxx(lastName, list, lists);
			if (xxx.isPresent()) {
				lists.add(country);
				// 最大値の更新
				if (map.size() < lists.size()) {
					setMap(lists);
				}
				runs(Lists.immutable.ofAll(xxx.get()), lists);
			}
		});
	}

	public void setMap(MutableList<String> lists) {
		count = 1;
		lists.each(country -> {
			map.put(count, country);
			count++;
		});
	}

	/**
	 * @param country
	 *            現在の国
	 * @return 最後の文字列
	 */
	public String Search(String country) {
		int length = country.length();
		return country.substring(length - 1, length);
	}

	/**
	 * @param lastName しりとりの最後の文字
	 * @param list もともとのリスト
	 * @param lists 同一を防ぐためのもの
	 * @return
	 */
	public Optional<ImmutableList<String>> xxx(String lastName, ImmutableList<String> list, MutableList<String> lists) {
		MutableList<String> remaking = Lists.mutable.ofAll(list);
		lists.each(name->{
			remaking.remove(name);
		});
		ImmutableList<String> select = remaking.select(name -> name.startsWith(lastName)).toImmutable();
		return Optional.ofNullable(select);
	}
}
