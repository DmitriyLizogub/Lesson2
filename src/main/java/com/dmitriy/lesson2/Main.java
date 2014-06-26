package com.dmitriy.lesson2;

import java.util.Arrays;

public class Main{

    public static void main(String [] args){
        Person director = new Person("Aaron", "Tomson", 50, Position.DIRECTOR);
        Person developer = new Person("Alex", "Smith", 40, Position.DEVELOPER);
        Person qa = new Person("Dave", "Johnson", 20,Position.QA);
        Person ba = new Person("Charley", "Sheen", 30, Position.BA);
        Person ba2 = new Person("Charley", "Sheen", 30, Position.BA);
        String separator = "-----------------------------------------------------------------";
        Person [] personArray1 = {director, developer, ba};
        Person [] personArray2 = {director, developer, ba};
        Person [] personArray3 = {director, qa, ba2};

/**FIRST TASK*/
        //director against dev
        boolean isDirectorEqToDevByValue = director.equals(developer);
        boolean isDirectorEqToDevByRef = (director == developer);
        System.out.println(separator);
        System.out.println("director.equals(developer) is " + isDirectorEqToDevByValue);
        System.out.println("(director == developer) is " + isDirectorEqToDevByRef);

        //qa against ba
        boolean isQaEqToBaByValue = qa.equals(ba);
        boolean isQaEqToBaByRef = (qa == ba);
        System.out.println(separator);
        System.out.println("qa.equals(ba) is " + isQaEqToBaByValue);
        System.out.println("(qa == ba) is " + isQaEqToBaByRef);

        //qa against qa
        boolean isQaEqToQaByValue = qa.equals(qa);
        boolean isQaEqToQaByRef = (qa == qa);
        System.out.println(separator);
        System.out.println("qa.equals(qa) is " + isQaEqToQaByValue);
        System.out.println("(qa == qa) is " + isQaEqToQaByRef);

        //ba against ba2
        boolean isBaEqToBa2ByValue = ba.equals(ba2);
        boolean isBaEqToBa2ByRef = (ba == ba2);
        System.out.println(separator);
        System.out.println("ba.equals(ba2) is " + isBaEqToBa2ByValue);
        System.out.println("(ba == ba2) is " + isBaEqToBa2ByRef);


/**SECOND TASK*/
        //personArray1 against  personArray2
        boolean isArrays1And2EqualsByValues = Arrays.equals(personArray1, personArray2); //внутри Arrays.equals зашито и сравнение по ссылке, по-этому personArray1 == personArray2 отдельно проверять не надо
        boolean isArrays1And2EqualsByRef = (personArray1 == personArray2);
        System.out.println(separator);
        System.out.println("!! personArray1 = {director, developer, ba}  and personArray2 = {director, developer, ba} !!");
        System.out.println("Arrays.equals(personArray1, personArray2); is " + isArrays1And2EqualsByValues);
        System.out.println("(personArray1 == personArray2) is " + isArrays1And2EqualsByRef);

        //personArray1 against  personArray3
        boolean isArrays1And3EqualsByValues = Arrays.equals(personArray1, personArray3);
        boolean isArrays1And3EqualsByRef = (personArray1 == personArray3);
        System.out.println(separator);
        System.out.println("Arrays.equals(personArray1, personArray3); is " + isArrays1And3EqualsByValues);
        System.out.println("(personArray1 == personArray3) is " + isArrays1And3EqualsByRef);

        //personArray3 against  personArray3
        boolean isArrays33EqualsByValues = Arrays.equals(personArray3, personArray3);
        boolean isArrays33EqualsByRef = (personArray3 == personArray3);
        System.out.println(separator);
        System.out.println("Arrays.equals(personArray3, personArray3); is " + isArrays33EqualsByValues);
        System.out.println("(personArray3 == personArray3) is " + isArrays33EqualsByRef);

        //print array elements
        System.out.println(separator);
        printArrayElements(personArray1);
        System.out.println(separator);
    }


    private static void printArrayElements(Person[] personArray1) {
        for (Person person : personArray1) {
            System.out.println(person.toString());
        }
    }
}



/*
/usr/lib/jvm/java-7-oracle/bin/java -Didea.launcher.port=7532 -Didea.launcher.bin.path=/home/dmitriy/Programs/idea/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-7-oracle/jre/lib/jfxrt.jar:/usr/lib/jvm/java-7-oracle/jre/lib/rt.jar:/usr/lib/jvm/java-7-oracle/jre/lib/resources.jar:/usr/lib/jvm/java-7-oracle/jre/lib/jsse.jar:/usr/lib/jvm/java-7-oracle/jre/lib/javaws.jar:/usr/lib/jvm/java-7-oracle/jre/lib/jfr.jar:/usr/lib/jvm/java-7-oracle/jre/lib/plugin.jar:/usr/lib/jvm/java-7-oracle/jre/lib/jce.jar:/usr/lib/jvm/java-7-oracle/jre/lib/deploy.jar:/usr/lib/jvm/java-7-oracle/jre/lib/charsets.jar:/usr/lib/jvm/java-7-oracle/jre/lib/management-agent.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-7-oracle/jre/lib/ext/zipfs.jar:/home/dmitriy/JavaLessons/JavaLessons/com/dmitriy/lesson2/main/output/production/JavaLessons:/home/dmitriy/Programs/idea/lib/idea_rt.jar com.intellij.rt.execution.application.AppMain Main

OUTPUT:

-----------------------------------------------------------------
director.equals(developer) is false
(director == developer) is false
-----------------------------------------------------------------
qa.equals(ba) is false
(qa == ba) is false
-----------------------------------------------------------------
qa.equals(qa) is true
(qa == qa) is true
-----------------------------------------------------------------
ba.equals(ba2) is true
(ba == ba2) is false
-----------------------------------------------------------------
!! personArray1 = {director, developer, ba}  and personArray2 = {director, developer, ba} !!
Arrays.equals(personArray1, personArray2); is true
(personArray1 == personArray2) is false
-----------------------------------------------------------------
Arrays.equals(personArray1, personArray3); is false
(personArray1 == personArray3) is false
-----------------------------------------------------------------
Arrays.equals(personArray3, personArray3); is true
(personArray3 == personArray3) is true
-----------------------------------------------------------------
Person{name='Aaron', surName='Tomson', age=50, position=DIRECTOR}
Person{name='Alex', surName='Smith', age=40, position=DEVELOPER}
Person{name='Charley', surName='Sheen', age=30, position=BA}
-----------------------------------------------------------------

Process finished with exit code 0
*/