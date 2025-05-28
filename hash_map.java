import java.util.HashMap; 
 class hash_map {
    public static void main(String[] args) {
       //String str="programming";
        //String str="programming is a fun and fun is a programming"; //p=1,r=2
        //HashMap<Character,Integer> map=new HashMap<>();
        //char[] ch=str.toCharArray();
        //for (char i:ch){
           //   map.put(i, map.getOrDefault(i,0)+1);
       // }
       /*String[] words = str.split(" ");
       HashMap<String,Integer> map=new HashMap<>();
       for(String i : words){
        map.put(i, map.getOrDefault(i,0)+1);
       }*/

       //printing first non repeating character
       String str1="aaabcccddddefff";
       HashMap<Character,Integer> map=new HashMap<>();
       for (char ch : str1.toCharArray()){
          map.put(ch, map.getOrDefault(ch,0)+1);
       }
       for(char i: map.keySet()){
        if(map.get(i)==1){
            System.out.println(i);
            break;
        }
       }
    }
    
}
