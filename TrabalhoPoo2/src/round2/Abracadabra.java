package round2;

public class Abracadabra {

	public static void main(String[] args) {
	int A[]= {1,2,3,4,5,6,7,8,9,10};
	int B[]= {1,2,3,4,5,6,7,8,9,10};
	int C[]=new int[10];
	int result;
	for(int i=0;i < A.length; ++i) {
		result=A[i]+B[i];
		C[i]=result;
		System.out.println("O vetor A que possui["+A[i]+"] + ["+B[i]+"]que possui o vetor B,resulta no vetor C que possuira["+C[i]+"]");
		
		
	}

	}

}
