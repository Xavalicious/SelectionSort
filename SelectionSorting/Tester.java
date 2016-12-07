
public class Tester {

	public static void main(String[] args) {
	int b[]=new int[]{3,4,1,9,0,2};	
	sort(b);
	for(int x=0;x<b.length;x++)
	{
		System.out.println(b[x]);
	}
	}
	public static void sort(int a[]){
		int min,minIndex;
		for(int i=0;i<a.length;++i){
			min=a[i];
			minIndex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<min){
					min=a[j];
					minIndex=j;
				}
			}
		a[minIndex]=a[i];
		a[i]=min;
		}
	}
}
