public class bellmanFordResultPrint {
	public void resultPrint(double[] distances, int source){
		String endPlace = new String();
		String sourcePlace = new String();
		if (source == 0)
			sourcePlace = "Aminbazar";
		else if (source == 1)
			sourcePlace = "Airport";
		else if (source == 2)
			sourcePlace = "Shyamoli";
		else if (source == 3)
			sourcePlace = "Rampura";
		else if (source == 4)
			sourcePlace = "Mohammadpur";
		else if (source == 5)
			sourcePlace = "Farmgate";
		else if (source == 6)
			sourcePlace = "Malibagh";
		else if (source == 7)
			sourcePlace = "Shahbagh";
		else if (source == 8)
			sourcePlace = "Sayedabad";
		else if (source == 9)
			sourcePlace = "Kamrangir Char";
		else if (source == 10)
			sourcePlace = "Sadarghat";
		
		
		System.out.print("Distance from "+sourcePlace+" by using Bellman Ford : ");
		for (int i=0; i<distances.length; i++){
			if (i == 0)
				endPlace = "Aminbazar";
			else if (i == 1)
				endPlace = "Airport";
			else if (i == 2)
				endPlace = "Shyamoli";
			else if (i == 3)
				endPlace = "Rampura";
			else if (i == 4)
				endPlace = "Mohammadpur";
			else if (i == 5)
				endPlace = "Farmgate";
			else if (i == 6)
				endPlace = "Malibagh";
			else if (i == 7)
				endPlace = "Shahbagh";
			else if (i == 8)
				endPlace = "Sayedabad";
			else if (i == 9)
				endPlace = "Kamrangir Char";
			else if (i == 10)
				endPlace = "Sadarghat";
			System.out.println(+i+". to "+endPlace+" is "+distances[i]);
			
		}
	}
}
