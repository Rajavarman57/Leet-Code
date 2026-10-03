class Solution {
    public String removeDuplicates(String s) {
        
        Stack <Character> a = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){

            if(!a.isEmpty() && a.peek()==c){
                a.pop();
            }
            else{
                a.push(c);
            }
        }

        for(char c:a){
            sb.append(c);
        }

        return sb.toString();
        
    }
}