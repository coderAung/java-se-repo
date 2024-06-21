package org.core.game.helper;

import java.util.Random;

public interface RandomNumberGenerator {
	int getRandom(int limit);
	
	static RandomNumberGenerator getInstance(Random random) {
		return (limit) -> random.nextInt(limit);
	}
}
