package Strings;

public class Example3 {


    public boolean isValid(String password){
        char[] text = password.toCharArray();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        if(password.length() < 8 || password.length() > 26) return false;
        hasSpecialCharacters(password);

        for(int count = 0; count < text.length; count++){
            char s = text[count];
            if(Character.isDigit(s)){
                hasDigit = true;
                continue;
            }
            if(Character.isUpperCase(s)){
                hasUpperCase = true;
                continue;
            }
            if(Character.isLowerCase(s)){
                hasLowerCase = true;
                continue;
            }

        }

        if(hasDigit && hasUpperCase && hasLowerCase && hasSpecialCharacters(password)) return true;
        return false;
    }

    private boolean hasSpecialCharacters(String password){
        char[] array = {'_','-','.','*','&','%','$','#','@','!','`','~','+','=','?',',','/','|','"','^'};
        StringBuilder builder = new StringBuilder();
        for (int count = 0; count < array.length; count++){builder.append(array[count]);}


        if(password.contains(builder)) return true;
        return false;
    }

}
