import java.util.*;

class CodeChefProb1{
	int T; // for Test Cases
	int N; // for number of inputs
	int[] A;
	int i,j, sum=0, flag=0, flag2=0;
	float[] avg;
	int[] sumArr;
	String res;

	void stipend(){
		Scanner sc= new Scanner(System.in);
		T= sc.nextInt();
		for (i=0; i<T; i++) {
			N=sc.nextInt();
			A=new int[N];
			sumArr= new int[N];
			//Arrays.fill(sumArr, 0);
			avg=new float[N];
			for (j=0; j<N; j++) {
				A[j]=sc.nextInt();
				if(A[j]>=2 && A[j]<=5){
					sum+=A[j];
					System.out.println((j+1)+"Sum-->"+sum);
					if(A[j]==2){
						flag=1;
					}
					if(A[j]==5){
						flag2=1;
					}
				}
				else{
					throw new IllegalArgumentException("anumber out of range");
				}
			}
				sumArr[i]=sum;
				//System.out.println((i+1)+"Sum-->"+sumArr[i]+", N-->"+N);
				avg[i]+=sumArr[i]/N;
				//System.out.println((i+1)+"Avg-->"+avg[i]);
				//System.out.println((i+1)+"flags involbed--> flag1="+flag+", flag2="+flag2);
				sum=0;
				flag=0;
				flag2=0;
		}
	}

	public void result(){
	 	for(i=0;i<T;i++){
	 		if((avg[i]> 3.8) && (flag==0) && (flag2==1)){
	 			res="yes"; 
	 		}
	 		else{
	 			res="No";	
	 		}
	 		System.out.println(res);
	 	}
	} 		
	
	public static void main(String arg[]){
		CodeChefProb1 prob1 = new CodeChefProb1();
		prob1.stipend();
		prob1.result();
	}
}