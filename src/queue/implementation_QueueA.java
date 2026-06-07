package queue;

public class implementation_QueueA {
    public static class queueA{
        int f =-1;
        int r =-1;
        int size =0;
        int[]arr = new int[10];
        public void add(int x){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=x;
            }else{
                arr[r+1]=x;
                r++;
            }size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        public int remove(){
            f++;
            size--;
            return arr[f-1];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(7);
        q.add(9);
        q.add(0);
        q.display();
        q.remove();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.size);

    }
}
