
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array 
	}
	public void shiftNTimes(int[] array, int numShifts) {

		int timesShifted = 0;
		while (timesShifted < numShifts) {
			int temp = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}

			array[array.length - 1] = temp;
			timesShifted++;
		}
	}

}
