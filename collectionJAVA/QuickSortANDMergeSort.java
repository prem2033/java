package collectionJAVA;

public class QuickSortANDMergeSort {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int l=low-1;
		for(int i=low;i<high;i++) {
			if(pivot>=arr[i]) {//increase l and swap l and i
				l++;
				int temp=arr[l];
				arr[l]=arr[i];
				arr[i]=temp;
			}
	}//after done with loop swap l+1 and pivot(i,e the last element of the array)
		int temp=arr[l+1];
		arr[l+1]=arr[high];
		arr[high]=temp;
		
		return l+1;
		
	}
	public static void sort(int []arr,int l,int h) {
		  if(l<h) {
			  int p=partition(arr,l,h);
			  sort(arr,l,p-1);
			  sort(arr,p+1,h);
		  }
	}

	public static void mergesort(int a[],int low,int mid,int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int l1[]=new int[n1];
		int l2[]=new int[n2];
		for(int i=0;i<n1;i++)
			   l1[i]=a[low+i];
		for(int i=0;i<n2;i++)
			   l2[i]=a[mid+1+i];
		int i=0,j=0;
		int k=low;
		while(i<n1 &&j <n2) {
			if(l1[i]<=l2[j])
				a[k++]=l1[i++];
			else
				a[k++]=l2[j++];
		}
		while (i <n1) 
            a[k++] = l1[i++]; 
		while (j<n2) 
            a[k++] = l2[j++]; 
		
	}
	  public static void merge(int arr[],int low,int high) {
		  if(low<high) {int mid=(low+high)/2;
			  sort(arr,low,mid);
			  sort(arr,mid+1,high);
			  mergesort(arr,low,mid,high);
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,6,3,5,1,2,10,4,5,7,9,11,2,5,7,87,5,4,0,8,9,0};
		int size=arr.length;
		//usning Quick sort
		sort(arr,0,size-1);
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");
		//using merge sort
		System.out.println("\nMERGE");
		int a[]= {9,6,3,5,1,2,10,4,5,7,9,11,2,5,7,87,5,4,0,8,9,0};
		int len=a.length;
		merge(a,0,len-1);
		for(int i=0;i<len;i++)
			System.out.print(a[i]+" ");
		/*Arrays.sort(int[] a) in recent 
		 * JDK is implemented with Dual-pivot Quicksort algorithm
		 *  which has O(n log n) average complexity 
		 *  and is performed in-place (e.g. requires no extra space)*/
	}

}
