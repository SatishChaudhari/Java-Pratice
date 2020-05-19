package JavaPractice2;
// Enum inside a class
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
public class EnumClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.LOW;
        Level myVar1 = Level.MEDIUM;
        Level myVar2 = Level.HIGH;
        System.out.println(myVar +" /" + myVar1 + " /" + myVar2);
    }
}
