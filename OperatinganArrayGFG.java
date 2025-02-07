/* Question
Operating an array
Given an array arr, complete the following three functions:
searchEle: This function searches for an element x in the array arr. It should return a boolean value - true if the element is found, and false otherwise.
insertEle: This function inserts an element y at index yi in the array. true will be printed if the insertion is done correctly, and false otherwise.
deleteEle: This function deletes the first occurrence of an element z in the array. true will be printed if the deletion is done correctly, and false otherwise.

Note: 0-based indexing is followed.
Example:
Input: arr[] = [2, 4, 1, 0, 2], x=1, y=2, yi=2, z=0
Ouput: true true true
Explanation: As x=1 is present in the array, so return 1. After inserting y=2 at yi=2th index, the array becomes 2,4,2,1,0,2. After deleting z=0, the array becomes 2,4,2,1,2
*/

/*Complete the function(s) below*/
class Solution {
    public boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        for(int ele:arr){
            if(ele==x){
                return true;
            }
        }
        return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
        // add code here.
        arr.add(yi,y);
    }

    public void deleteEle(List<Integer> arr, int z) {
        // add code here.
        arr.remove(Integer.valueOf(z));
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String[] arrInput = scanner.nextLine().split(" ");
            List<Integer> arr = new ArrayList<>();
            for (String s : arrInput) {
                arr.add(Integer.parseInt(s));
            }
            List<Integer> temp = new ArrayList<>(arr);

            String[] inputs = scanner.nextLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            int yi = Integer.parseInt(inputs[2]);
            int z = Integer.parseInt(inputs[3]);

            Solution obj = new Solution();
            boolean b = obj.searchEle(arr, x);
            System.out.print(b ? "true " : "false ");

            obj.insertEle(arr, y, yi);
            temp.add(yi, y);
            System.out.print(arr.equals(temp) ? "true " : "false ");
            temp.remove((Integer)z);
            obj.deleteEle(arr, z);
            System.out.println(arr.equals(temp) ? "true " : "false ");

            System.out.println("~");
        }

        scanner.close();
    }
}

//  } Driver codes ends here