/*
Problem: Count Inversion
Time Complexity: O(n*logn)
Space Complexity: O(n)
*/


class Solution {
    public int merge(int[] arr, int low, int mid, int high){
        int i =low;
        int j = mid+1;
        int cnt = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                cnt += (mid - i + 1);
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        
        while(j<=high){
            temp.add(arr[j]);
            j++;
        }
        
        for(int k=low;k<=high;k++){
            arr[k]=temp.get(k-low);
        }
        
        return cnt;
    }
    public int mergeSort(int[] arr, int low, int high){
        int cnt = 0;
        if(low<high){
            int mid = low + (high-low)/2;
            cnt+=mergeSort(arr,low,mid);
            cnt+=mergeSort(arr,mid+1,high);
            cnt+=merge(arr,low,mid,high);
        }
        return cnt;
    }
    public int inversionCount(int arr[]) {
        
        return mergeSort(arr,0,arr.length-1);
        
        
    }
}
