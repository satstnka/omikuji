package jp.trans_it.omikuji;

import jp.trans_it.omikuji.model.Message;
import jp.trans_it.omikuji.model.Result;

public class TanakaMessage implements Message {

	@Override
	public String getName() {
		return "田中";
	}

	@Override
	public String getMessage(Result result) {
		String message = "";
		if(result == Result.DAIKICHI) {
			message = "何をやってもうまくいく日。行動しないともったいない!!!";
		}
		else if(result == Result.KICHI) {
			message = "学びの一日。読書がおすすめです。";
		}
		else if(result == Result.KYOU) {
			message = "熱中症には気を付けましょう。";
		}

		return message;
	}

}
