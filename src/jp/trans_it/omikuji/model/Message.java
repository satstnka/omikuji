package jp.trans_it.omikuji.model;

/**
 * おみくじメッセージ インターフェイス
 */
public interface Message {
	/**
	 * 名前を取得する
	 * @return メッセージを記述した人の名前
	 */
	public String getName();

	/**
	 * おみくじのメッセージを取得する。
	 * @param result おみくじの結果
	 * @return メッセージ
	 */
	public String getMessage(Result result);
}
