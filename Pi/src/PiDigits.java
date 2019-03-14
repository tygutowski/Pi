
public class PiDigits {
	public static void main(String[] args){
		int a=3;
		int iteration = 1;
		double total = 1;
		int temp = 0;
		long startTime = System.nanoTime()/100000000;
		while(a>0){
			
			for(int i = temp; i>=0; i--){
				if(iteration%2==1){
					total-=(double)(1/(double)a);
				}
				else{
					total+=(double)(1/(double)a);
				}
				iteration+=1;
				a+=2;
			}
			long endTime = System.nanoTime()/100000000;
			System.out.println("pi: " + total*4 + "			Time: " + (endTime - startTime));
			//startTime = System.nanoTime();
			temp+=1;


		}
	}
}
