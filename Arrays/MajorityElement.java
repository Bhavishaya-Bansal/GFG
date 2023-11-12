public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        int el = 0;
        int cnt = 0;
        for(int i=0;i<size;i++){
            if(cnt ==0){
                cnt = 1;
                el = a[i];
            }
            else if(el == a[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2 = 0;
        for(int i=0;i<size;i++){
            if(el == a[i]){
                cnt2++;
            }
        }
        if(cnt2>(size)/2){
            return el;
        }
        return -1;
    }
}

