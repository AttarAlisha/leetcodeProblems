class Password {
    public boolean strongPasswordCheckerII(String password) {
        
        if(password.length()<8){
            return false;
        }

        boolean lowercase=false;
        boolean uppercase=false;
        boolean digit=false;
        boolean specialChar=false;

        String specialChracters="!@#$%^&*()-+";

        for (int i=0; i<password.length(); i++){
            char c=password.charAt(i);

            if(i > 0 && c== password.charAt(i-1)){
                return false;
            }

            if(Character.isLowerCase(c)){
                lowercase=true;
            }

            if(Character.isUpperCase(c)){
                uppercase=true;
            }

            if(Character.isDigit(c)){
                digit=true;
            }

            if(specialChracters.indexOf(c) != -1){
                specialChar= true;
            }
        }

        return lowercase && uppercase && digit && specialChar;
    }
}
