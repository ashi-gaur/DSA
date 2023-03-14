

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
    ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            ans.add(temp.data);
            temp = temp.next;
        }
        return check(ans);
    }
    
    boolean check(ArrayList<Integer> List){
        int start = 0;
        int end = List.size()-1;
        while(start <= end){
            if(List.get(start) != List.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}