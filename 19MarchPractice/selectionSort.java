class selectionSort{
public static void main(String[]args){
	int temp=0;
int a[]={2,8,4,100,10};
for(int i=0;i<a.length;i++){
	for(int j=i+1;j<a.length;j++){
		if(a[i]>=a[j]){
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
}
}