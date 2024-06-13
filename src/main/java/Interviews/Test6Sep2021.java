package Interviews;

public class Test6Sep2021 {
    public static void main(String[] args) {

    }
    /*
    * 2 3 4 5 6 - binary search
    *
    * cdjavainterview
    * Ascii a = 47
    * Ascii c = 49
    * a b c
    * 0 1 2
    * */

    void findFirstRepFirstNonRep(String s){
        int[] map = new int[26];
        for(int i =0;i<s.length();i++){ // O(n)
            int index = s.charAt(i) - 'a';
            // index = c - a = 49 -47 = 2
            //map[2]++ = 0 -> 1

            map[index]++;
        }
        char rep='a' ;
        char nonRep='a';
        for(int i =0;i<s.length();i++){// O(n)
            int index = s.charAt(i)-'a';
            if(map[index]>1){
                rep = s.charAt(i);
                break;
            }
        }

        for(int i =0;i<s.length();i++){// O(n)
            int index = s.charAt(i)-'a';
            if(map[index]==1){
                nonRep = s.charAt(i);
                break;
            }
        }
        System.out.println(rep);
        System.out.println(nonRep);
    }

    int findByBinarySearch(int [] nums, int tar){

        int start =0;
        int end = nums.length -1;
        int mid =0;
        while (start <= end) {
            mid = (start+end)/2;
            if(nums[mid] == tar)
                return mid;
            else if(tar > nums[mid]){
                start = mid;
            }
            else if(tar < nums[mid]){
                end = mid;
            }
        }
        return  -1;
    }

    /*from Sakina Shaikh to Everyone:    4:56  PM
EmployeeDetails
EmpId	FullName		ManagerId
121		John Snow			321
321		Walter White		986
421		Kuldeep Rana		876


EmployeeSalary
EmpId	Project		Salary
121		P1			8000
321		P2			10000
421		P1			12000

Write an SQL query to fetch employee names having a salary greater than or equal to 5000 and less than or equal to 10000.


select ed.FullName from
EmployeeDetails ed, EmployeeSalary es inner join on ed.EmpId  = es.EmpId
where es.Salary >= 5000 and es.Salary <= 10000

Write an SQL query to fetch project-wise count of employees sorted by project’s count in descending order.

select Project , count(Project) from EmployeeSalary
group by Project
order by desc Project


Here
kotlin
Big Data

*/


}
