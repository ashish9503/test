class Binary{

static int binarysearch(int arr[] , int target){
    int s=0;
    int e=arr.length-1;

    while (s<=e) {
        //find the mid ele..
        int mid = (s+e)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            mid=mid+1;
        }
        else{
            s=mid+1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int arr[]={2,3,4,57,88,992};
        int target=88;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
        
    }
}