
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exploring Label");
		outer:for(int i=1;i<=5;i++)  
			  {  
				System.out.println();  
				for(int j=1;j<=5;j++)
				{
					if((i+j)%5 == 0)
						break outer;
					else {
						System.out.println(i+j);
					}
					System.out.println("not reached till  th multiple of 5 ");
				}
			  }
				
		
	}

}
