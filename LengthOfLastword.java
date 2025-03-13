class LengthOfLastword {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        int lastspaceindex=s.lastIndexOf(' ');

        return s.length() -lastspaceindex -1;
    }
}
