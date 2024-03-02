public class EqualsIntegerClass {
    public static void main(String[] args){
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

//        Integer class has a cached range of -128 to 127 if the value referenced within the range then it will be cache
//        if not in range then new objects will be created for each value

        System.out.println(num1==num2);
        System.out.println(num3==num4);
    }
}
