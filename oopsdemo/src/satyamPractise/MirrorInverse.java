package satyamPractise;

public class MirrorInverse {
		
		static boolean isMirrorInverse(int arr[])
		{
			for(int i =0;i<arr.length;i++)
			{
				if (arr[arr[i]] !=0)
				return false;
			}
			return true;			
		}
		public static void main(String[] args) {
			
			int arr[]= {3,2,1,0};
			if(isMirrorInverse(arr))
				System.out.println("Yes");
			else
				System.out.println("No");

	}

}
