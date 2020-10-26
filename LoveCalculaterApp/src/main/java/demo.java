
public class demo {
	public static void main(String[] args) {
		int sum=3,n=0;
		
		for(int i=0;i<=10;i++) {
			if(i%3==0) {
			n=+i*10;
			sum=sum+n;
			System.out.println(sum+""+i);
			}
		}
	}

}
