package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	

	public static void referer(String[] word) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> mean = new HashMap<String,String>();
          
	       mean.put("apple","りんご");
	       mean.put("peach","桃");
	       mean.put("banana","バナナ");
	       mean.put("lemon","レモン");
	       mean.put("pear","梨");
	       mean.put("kiwi","キウイ");
	       mean.put("strawberry","いちご");
	       mean.put("grape","ぶどう");
	       mean.put("muscat","マスカット");
	       mean.put("cherry","さくらんぼ");
	      
     


	       for(String s:word) {
	    	   //辞書で調べた単語の意味を取得する
	    	   
	    	   if(mean.get(s) == null) {
	    	     System.out.println(s + "は辞書に存在しません");
	    	     }else {
	    	    	 System.out.println(s+"の意味は" + mean.get(s));
	    	     }
	       }
	  
	}
	
	
}
	    
	       
     