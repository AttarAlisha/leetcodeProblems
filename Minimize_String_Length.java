class Minimize_String_Length {
    public int minimizedStringLength(String s) {
        
        HashSet<Character> set= new HashSet<>();

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            set.add(c);
        }

        return set.size();
    }
}
