package Interviews;

public class Test10Aug {

    /*
    *
    *
    *
    * Employee
--
String userId
String name
String gender
int age

one-to-many
List<Adress> address

int cur_salary

one-to-one
Profile profile


-----------
Address
--
AddressLineFirst
AddressLineSecond
State
City
Pincode
isCurrent
isPermanent

addEmployee( isCurrent,   isPermanent)
insert - isCurrent = true; isPermanent - false

add/update address( isCurrent,   isPermanent)
insert - isCurrent = true; isPermanent - false

---
put - new Employee -

User{
    name: xyx,
    Age: ,
    gender: Male/Female,
    address:  [{
        AddressLineFirst:
        AddressLineSecond:
        State:
        City:
        Pincode:
        isCurrent: true
        isPermanent:
    },
    {
        AddressLineFirst:
        AddressLineSecond:
        State:
        City:
        Pincode:
        isCurrent:
        isPermanent: true
    },]
    cur_salary:



}

Employee{id, name, age, gender, cur_salary, profileId}
Address{ id, EmployeeId, AddressLineFirst, AddressLineSecond, State, City, Pincode, isCurrent:boolean, isPermanent:boolean}
Profile{id, EmployeeId, Contact_phone, Contact_email, grade, .}

----
Employee who are in <city>

GET - params - city(String)

findEmployeeByCity()


Select * from inner join Employee, Address where
Employee.id in {
    Select EmployeeId from  Address where city = 'city'
}


---
UserService

getEmployee(EmployeeId) - Employee
getAddress(EmployeeId) - List<Address>
getProfile(EmployeeId) - Profile


getUserDetails(EmployeeId) -  User
T1,
getEmployeeService - User.Employee e1
 rest - GET - ResponseObject - jackson -> Employee

 t2,
getAddress - User.List<Address>

t3,
profile



return user

----------------
String - [[]][]
[start_index, end_index, [star_index,end_index,null]]

[   [   ]  ]    [   ]
0   1   2  3    4   5

stk -  0 , 1,
    0, 4, list {1, 2, null}, {4,5, null}

CusList - int start, int end, CusList inner
CusList(int start){
    this.start = start;
    inner = null;
}

findPosition(String s){
    List<CusList> list = new ArrayList<>();
    Stack<Integer> stk = new Stack<>();
    for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='['){
            CusList temp = new CusList(i);
            stk.push(i);
        }
        else if(s.charAt(i)==']' && !stk.isEmpty()){
            int end = i;
            int start = stk.pop();
            for(CusList cur: list){
                if(cur.start == start)
            }
        }
    }
}*/
}
