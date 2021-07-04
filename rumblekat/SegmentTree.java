class SegmentTree{
    int [] segmentArr;
    SegmentTree(int [] arr, int n){
        segmentArr = new int [n*4];
        init(arr,0,n-1,1);
    }
    int init(int [] arr, int left, int right, int node){
        System.out.println("left : " + left + " right : " + right);
        if(left == right){
            return segmentArr[node] = arr[left];
        }
        int mid = (left + right) / 2;
        segmentArr[node] += init(arr, left, mid, node * 2); //left side
        segmentArr[node] += init(arr, mid+1,right, node*2 +1); //right side
        return segmentArr[node]; 
    }
}