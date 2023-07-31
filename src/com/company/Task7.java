package com.company;

//Task7. In the Example class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
//        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
//public class Example {
//    private final String first, last;
//
//    public Example(String first, String last) {
//        this.first = first;
//        this.last = last;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Set<Example> s = new HashSet<>();
//        s.add(new Example("Donald", "Duck"));
//        System.out.println(s.contains(new Example("Donald", "Duck")));
//    }
//}


import java.util.Objects;

public class Task7 {

    private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }


    @Override
    public boolean equals (Object l) {
        if (this == l) return true;
        if (l == null) || getClass() != l.getClass()) return false;
        Task7 task7 = (Task7) l;
        return Object.equals(first, task7.first) &&
                Object.equals(last, task7.last);
    }

    @Override
    public int hashCode() {return Objects.hash(first, last); }




    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }

}
