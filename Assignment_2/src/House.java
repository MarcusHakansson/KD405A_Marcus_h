	
	public class House{
	 
	 private int yearBuilt = 0;
	 private int size;
	 private final static int minSize = 10;
	 private final static int maxSize = 1000;
	 private final static int minYear = 1800;
	 private final static int maxYear = 2015;
	 
	 
	 public House(int yearBuilt,int size){
		 if(yearBuilt>=minYear && yearBuilt <= maxYear){
		 	this.yearBuilt = yearBuilt;
		 }
			this.size = size;
			
	 }
	 
	 public int getYearBuilt(){
	 return this.yearBuilt;
	 }
	 
	 public int getSize(){
	 return this.size;
	 }
	 
	 public static int getMinSize(){
	 return minSize;
	 }
	 public static int getMaxSize(){
	 return maxSize;
	 }
	 
	 public static int getMinYear(){
	 return minYear;
	 }
	 
	 public static int getMaxYear(){
	 return maxYear;
	 }
	 
}
	