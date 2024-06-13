package problemSolving;

/*There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

    Start at the 1st friend.
    Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
    The last friend you counted leaves the circle and loses the game.
    If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
    Else, the last friend in the circle wins the game.

Given the number of friends, n, and an integer k, return the winner of the game.
https://leetcode.com/contest/weekly-contest-236/problems/find-the-winner-of-the-circular-game/
 */

class Node{
	int data;
	Node next;
	
	Node(int i){
		this.data=i;
		this.next = null;
	}
	
}

class CircularLL{
	
	
	public  Node createLL(int n) {
		Node curr = new Node(1);
		Node head = curr;
		for(int i =1+1;i<=n;i++) {
			Node temp = new Node(i);
			curr.next=temp;
			curr=curr.next;
		}
		curr.next=head;
		return head;
	}
	
	
}

public class FindtheWinneroftheCircularGame {

	public static int findTheWinner(int n, int k) {
		
		CircularLL list = new CircularLL();
		Node head = list.createLL(n);
		Node temp= head;
		while(temp!=null) {
			System.out.println(temp.data+" "+temp);
			Node curr = temp;
			if(k<2)
			for(int j =2;j<k-1;j++) {
				curr = curr.next;
			}
			curr.next=curr.next.next;
			temp=curr.next;
			//i++;
			if(temp.data==temp.next.data)
				break;
			
		}
		return temp.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheWinner(6,1));


	}
	
	
	
	

}
