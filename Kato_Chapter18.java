package kadai_018;

abstract class Kato_Chapter18 {
    
	//フィールド
	public String familyName = "加藤" ;
	public String givenName;
	public String address = "東京都中野区〇×";
	
	     
	//メソッド
	public void commonintriduce() {
		System.out.println("名前は" + familyName + givenName +"です");
		System.out.println("住所は" + address + "です");
	
	}
	
	//抽象メソッド
	abstract public void eachIntroduce();
	
	//紹介するメソッド
	public void execIntroduce() {
		commonintriduce();
		eachIntroduce();
}
}