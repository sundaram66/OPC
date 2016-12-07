package spoj;

import java.util.Stack;

/**
 * Created by seetharams on 24/11/16.
 */

    class DirectoryNode {
        int level;
        int length;
        public DirectoryNode(int level, int length){
            this.level = level;
            this.length = length;
        }
    }

    public class test2 {

        public static void main(String[] s) {
;
            System.out.println(lengthLongestPath("dir\\n\\ssubdir1\\n\\s\\tfile1.png\\n\\s\\tsubsubdir1\\n\\tsubdir2\\n\\s\\tsubsubdir2\\n\\s\\s\\tfile2.ext"));

        }
        public static int lengthLongestPath(String input) {

            if(input==null||input.length()==0)
                return 0;
            int maxLength = 0;
            String[] arr = input.split("\n");
            

            Stack<DirectoryNode> dirStack = new Stack<DirectoryNode>();

            for(int i=0; i<arr.length; i++){
                String str = arr[i];
                int count=0;
                int j=0;
                while(j<str.length()-1){
                    if(str.substring(j, j+1).equals(" ") || str.substring(j, j+1).equals("\\s")){
                        j++;
                        count++;
                    }else{
                        break;
                    }
                }

                while(!dirStack.isEmpty() && count <=dirStack.peek().level){
                    dirStack.pop();
                }

                if(str.contains(".jpeg") || str.contains(".png") || str.contains(".gif")){
                    if(dirStack.isEmpty()){
                        maxLength = Math.max(maxLength, str.length()-count);
                    }else{
                        maxLength = Math.max(maxLength, dirStack.peek().length +str.length()-count);
                    }
                }else{
                    if(dirStack.isEmpty()){
                        dirStack.push(new DirectoryNode(count, str.length()-count+1));
                    }else{
                        dirStack.push(new DirectoryNode(count, dirStack.peek().length + str.length()-count+1));
                    }
                }
            }

            return maxLength;
        }
    }

