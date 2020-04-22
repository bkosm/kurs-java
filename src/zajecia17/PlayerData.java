package zajecia17;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
	private List<Integer> scores;

	public PlayerData() {
		scores = new ArrayList<>();

		for (int i = 10; i <= 100; i += 10) {
			scores.add(i);
		}
	}

	public int getValue(int index) {
		if (index >= scores.size()) {
			return -1;
		} else {
			return scores.get(index);
		}
	}
}
