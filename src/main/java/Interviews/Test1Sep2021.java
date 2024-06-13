package Interviews;

import java.util.Map;

public class Test1Sep2021 {
    public static void main(String[] args) {


        /*
        * select * from T2 where Limit 2;
        *
        *
        * select T1.order_id, T3.status_name, T1.value from
        * T1 inner join T2 inner join T3
        * on T1.order_id , T2.order_id , T3.order_id
        * where
        * T1.order_id = T2.order_id and  T1.order_id = T3.order_id
        *limit 2
        * */


        /* class ReadWriteLock{

	        map;

	            //1) Multiple reads allowed parallel
	            //2) Single write or read allowed and not in parallel - w+r, w+w
        }*/
    }
}

class ReadWriteLock{

    public Map map;
    public static int readCounter =0;//should be AtmincInteger
    public static int writeCounter =0;

//    void checkOpertion(Thread t){
//        if(t.getState().equals("READ"))
//            readCounter++;
//    }

    static void read(){
       //to read the map

        if(writeCounter==0){
            readCounter++;

            readCounter--;
        }else{
            //wait until writeCounter =0
        }
    }

     synchronized void write( ){
        //to write the map
         if( writeCounter==0 && readCounter ==0 ){
             writeCounter++;
             //do write
             writeCounter--;
         }else{
             //wait
         }
    }


}
