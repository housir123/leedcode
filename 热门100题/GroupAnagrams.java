package com.springmvc.leedcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> Map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int counts[]=new int[26];
            int length=str.length();
            for(int i=0;i<length;i++){
                counts[str.charAt(i)-'a']++;
            }
            StringBuffer buffer = new StringBuffer();
            for(int i=0;i<26;i++){
                if(counts[i]>0){
                    buffer.append((char)('a'+i));
                    buffer.append(counts[i]);
                }
            }
            String s = buffer.toString();
            List<String> strings = Map.getOrDefault(s,  new ArrayList<String>());
            strings.add(str);
            Map.put(s, strings);
        }
        return new ArrayList<List<String>>(Map.values());
    }

}