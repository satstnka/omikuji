package jp.trans_it.omikuji.model;

public enum Result {
	DAIKICHI(3, "大吉"),
	KICHI(2, "吉"),
	KYOU(1, "凶"),
	UNDEFINED(0, "");


	private int id;
	private String name;

	private Result(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	public static Result valueOf(int id) {
		Result result = UNDEFINED;

		Result[] results = values();
		for(Result element : results) {
			if(element.id == id) {
				result = element;
			}
		}
		return result;
	}

	public static Result random() {
		double random = Math.random();
		int id = (int)Math.floor(random * 3.0) + 1;
		Result result = valueOf(id);
		return result;
	}
}
