package ArrayList;
import java.util.ArrayList;
import java.util.Random;

public class randomZeros {

	public static void main(String[] args) {
	Random rand = new Random();
	ArrayList<Integer> numsRandom = new ArrayList<Integer>(10);
	for(int i=0; i<10; i++){
		numsRandom.add(rand.nextInt(10)+0);
	}
	System.out.println(numsRandom);
	
	for(int i=0; i<10; i++){
		numsRandom.set(i, 0);
	}
	System.out.println(numsRandom);
	}
}
