package uma.p1PAB;

/**
 * Hello world!
 *
 */
public class Fibonacci {	
	public int compute(int numMeses, int numPareja) {
		int[] resultado = new int[numMeses+1];
		
		if(numMeses==0) { resultado[0]=0;	}
		else if(numMeses==1) { resultado[1]=1;	}
		if(numPareja<=0 || numMeses<0) {throw new RuntimeException();}
		else if(numMeses>1) { 
			resultado[numMeses]=compute(numMeses-1, numPareja)+numPareja *compute(numMeses-2,numPareja);
		}
		return resultado[numMeses];
	}
}


