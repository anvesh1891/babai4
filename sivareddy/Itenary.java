package Practise1;

import java.util.HashMap;
import java.util.Map;

public class Itenary {
	public static void findItenary(Map<String,String> dataSet)
	{
		HashMap<String,String> reverseMap=new HashMap<String,String>();
		for(Map.Entry<String, String> entry:dataSet.entrySet())
			reverseMap.put(entry.getValue(), entry.getKey());
		String start=null;
		for(Map.Entry<String, String> entry:dataSet.entrySet())
		{
			if(!reverseMap.containsKey(entry.getKey()))
			{
				start=entry.getKey();
				break;
			}
		}
		if(start==null)
		{
			System.out.println("Invalid Input");
			return;
		}
		String to=dataSet.get(start);
		while(to!=null)
		{
			System.out.println(start+" -> "+to);
			start=to;
			to=dataSet.get(to);
		}
	}
	public static void main(String[] args)
	{
		Map<String,String> dataSet=new HashMap<String,String>();
		dataSet.put("chennai","bangalore");
		dataSet.put("bombay", "delhi");
		dataSet.put("delhi", "goa");
		dataSet.put("goa", "chennai");
		findItenary(dataSet);
	}
}
