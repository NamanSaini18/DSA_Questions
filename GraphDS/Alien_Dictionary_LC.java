package GraphDS;

import java.util.HashMap;
import java.util.*;

public class Alien_Dictionary_LC
{
    class Solution
    {
        public String AlienOrder(String[] words)
        {
            HashMap<Character, List<Character>> map = new HashMap<>();
            for(int i=0;i<words.length;i++)
            {
                String str = words[i];
                for(int j=0;j<str.length();j++)
                {
                    if(!map.containsKey(str.charAt(j)))
                    {
                        map.put(str.charAt(j),new ArrayList<>());
                    }
                }
            }

            for(int i=0;i<words.length-1;i++)
            {
                String str1 = words[i];
                String str2 = words[i+1];
                if(str2.startsWith(str1) && str1.length() > str2.length())
                {
                    return "";
                }
                for (int j = 0; j < Math.min(str1.length(),str2.length()); j++)
                {
                    if(str1.charAt(j) != str2.charAt(j))
                    {
                        map.get(str1.charAt(j)).add(str2.charAt(j));
                        break;
                    }

                }
            }
            return TopologicalSort(map);
        }
        public String TopologicalSort(HashMap<Character,List<Character>> map)
        {
            int[] res = Indegree(map);
            StringBuilder sb = new StringBuilder();
            Queue<Character> queue = new LinkedList<>();
            for(char ch : map.keySet())
            {
                if(res[ch-'a'] == 0)
                {
                    queue.offer(ch);
                }
            }
            int ctr = 0;
            while (!queue.isEmpty())
            {
                char ch = queue.remove();
                ctr++;
                sb.append(ch);
                for(char neighbour : map.get(ch))
                {
                    res[neighbour-'a']--;
                    if(res[neighbour='a'] == 0)
                    {
                        queue.add(neighbour);
                    }
                }
            }
            return map.size() == ctr ? sb.toString() : "";

        }
        public int[] Indegree(HashMap<Character, List<Character>> map) {
            int[] in = new int[26];
            for (int key : map.keySet()) {
                for (int neighbour : map.get(key)) {
                    in[neighbour - 'a']++;
                }
            }
            return in;
        }
    }
}
