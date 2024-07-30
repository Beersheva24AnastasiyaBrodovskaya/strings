package telran.strings;

public class Strings {
    public static String firstName(){
        //regex for strings starting with capital letter and rest as lowercase letters
        //minimal length is 5 letters
        return "[A-Z][a-z]{4,}";
    }
    public static String javaVariable(){
        //TODO
        //only ASCII symbols are allowed
        //regular expression for testing syntax of java variables names
        return "[A-Za-z_$][0-9A-Za-z_$]*$";
    }
}
