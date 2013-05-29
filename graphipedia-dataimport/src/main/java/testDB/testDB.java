package testDB;
import java.util.*;

import org.graphipedia.query.*;
public class testDB {
	static void main(String[] args)
	{
		String dbDir = "/Users/Ricky/mashwork/graphipedia/DB";
		GraphipediaService GS = new GraphipediaService(dbDir);
		List<String> store = GS.findPath("A", "D", 5);
		Iterator<String> IT = store.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT);
		}
	}
}
