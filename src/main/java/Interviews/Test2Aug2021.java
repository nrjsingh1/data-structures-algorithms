package Interviews;


public class Test2Aug2021 {

    public static void main(String[] args) {
//        Arr = [0, 0,1,0,1,1,1,1]
//                      f         s
//        B = 1 - may not be continious zeros
//
//        Output: 6 - mx string length
        // brute force - for each i =0 , j = i+1 - keep the zero count B as terminating limit, if not zero than keep adding in the sting , update maximum,  O(n^2)


        //approach 2 two pointer --  keep a pointer at last 0 of count B, keep incrementing till no zero is found, if found then increment one more (if not zero), keep moving 2nd pointer and update max.
        //single pass - O(n)

//        int arr[] = {0, 0, 1, 0, 1, 1, 1, 1};
//        int max =0;
//        int b =1;
//        int f =0;
//        int s =0;
//        while(f<arr.length && s<arr.length){
//            if(arr[s]==1) {
//                max = Math.max(max, s - f + 1);
//                s++;
//            }
//            else if(arr[s]==0){
//                if(b>0){
//                    max = Math.max(max, s - f + 1);
//                    s++;
//                    b--;
//                }
//                else{
//                    f++;
//                    max = Math.max(max, s - f + 1);
//                    s++;
//                }
//            }
//        }
//
//        System.out.print(max);

        //#2
        //is BST
        // maximum of left sub tree should be smaller than current node, and minimum of right sub tree should be greater than current
//               3
//
//          2        4
//        1    6
//q - 3!, 2!, 4! , 1!, 6!,
        // t(n) - t(n/2) +t{n/2)
       //  O(logN)
//        t(4) =  t(2) + t(2)
//                = T(1) + T(1 + T(1) + T(1)  = 4*1 = n * O(1) - O(n)
//        t(2) = T(1) + T(1)
//        t(1)= 1

    }

//
//
//    boolean isBST(Node root){
//        Queue<Node> q = new LinkedList<>();
//        if(root==null)
//            return true;
//        q.add(root);
//        while(!q.isEmpty()){
//            Node cur = q.poll();
//            if(cur.left !=null && cur.left.val < cur.val){
//                q.add(cur.left);
//            }else if(cur.left !=null && cur.left.val > cur.val)
//                return false;
//
//            if(cur.right !=null && cur.right.val > cur.val){
//                q.add(cur.right);
//            }else if(cur.right !=null && cur.right.val < cur.val)
//                return false;
//        }
//        return true;
//    }




}
//Class of Student  - each multiple subjects (5 Sub) , later new subject might be added , no hard coded Subjects
//dynamic no of students , each might have subjects.
//
//class Student{
//
//    private String name;
//    private Date DOB;
//    private String gender;
//}
//
////A , B , C, D, E
//class Subject{
//    private String name;
//}
//
//class ClassRoom{
//
//    public Map<Student, List<Subject>> map;
//    public ClassRoom( Map<Student, List<Subject>> mapNew){
//        this.map = mapNew;
//    }
//
//    public addStudent(Student s, List<Subject> list){
//        if(map.containsKey(s))
//            map.put(s, list);
//        else
//            map.add(s, list);
//    }
//
//}
//
//    Subject
//            subId
//            subName
//            subType
//
//
//    Student
//            id
//            name
//            subId
//
//
////for a student A , all the subjects which he is studying
//    select * from stdent where name ='A'
//
//    select * from subject
//            inner join subject.subId = student.subId


