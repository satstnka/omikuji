package jp.trans_it.omikuji.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.trans_it.omikuji.model.Result;

class ResultTest {

	@Test
	void test() {
		for(int i = 0; i < 10; i++) {
			Result result = Result.random();
			System.out.println(result);
		}
	}

}
