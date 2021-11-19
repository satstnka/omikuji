package jp.trans_it.omikuji.test;

import org.junit.jupiter.api.Test;

import jp.trans_it.omikuji.TanakaMessage;
import jp.trans_it.omikuji.model.Message;
import jp.trans_it.omikuji.model.Result;

class MessageTest {

	@Test
	void test() {
		Message message = new TanakaMessage();
		System.out.println(message.getName());

		Result[] results = {Result.DAIKICHI, Result.KICHI, Result.KYOU};
		for(Result result : results) {
			System.out.println(
				String.format(
					"%s - %s",
					result,
					message.getMessage(result)
				)
			);
		}

	}

}
