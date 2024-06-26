
public class SapXepChon implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		double current;
		int i,j;
		for (i=1;i<arr.length;i++) {
			current=arr[i];
			j=i-1;
			
			while (j>=0 && arr[j]>current) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
			
	}

	@Override
	public void sapXepGiam(double[] arr) {
		double current;
		int i,j;
		for (i=1;i<arr.length;i++) {
			current=arr[i];
			j=i-1;
			
			while (j>=0 && arr[j]<current) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
	}
	
}
