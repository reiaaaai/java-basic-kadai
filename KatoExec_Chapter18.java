package kadai_018;

public class KatoExec_Chapter18 {

	 public static void main(String[] args)
	{
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		
       ichiro.setGivenName("一郎");
       ichiro.execIntroduce();
       
       taro.setGivenName("太郎");
       taro.execIntroduce();
       
       hanako.setGivenName("花子");
       hanako.execIntroduce();
      
}
}