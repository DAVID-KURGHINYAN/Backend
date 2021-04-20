package helpers;

import groovy.json.JsonGenerator;
import helpers.enums.Languages;
import helpers.enums.Roles;

import java.util.Scanner;

import static java.lang.Math.PI;

//class Bank {
//
//    public static String hip(double varkiGumar, int varkiJamket, double tokos) {
//        double sum = 0;
//        double monthSum = varkiGumar / varkiJamket;
//        double monthPercent = varkiGumar * tokos / 100 / 12;
//        for (int i = 0; i < varkiJamket; i++) {
//            varkiGumar -= monthSum;
//            monthPercent = varkiGumar * tokos / 100 / 12;
//            System.out.println(varkiGumar);
//            System.out.println(sum += monthPercent);
//        }
//        return "amsva mayr gumar: " + varkiGumar + ", hertakan amsva tokos: " + monthPercent;
//    }

//    public static void main(String[] args) {
//        String a = hip(28000, 180, 10.5);
//        System.out.println(a);
        //hakarak
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        char[] arr = text.toCharArray();
//        char[] arr1 = new char[arr.length];
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr1[i] = arr[i];
//            System.out.print(arr1[i]);
//        }

        //binary
//        class Converter{
//            public String toBinary(int num){
//                String binary="";
//                while(num > 0) {
//                    binary = (num%2)+binary;
//                    num /= 2;
//                }
//                return binary;
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        Converter converter = new Converter();
//        System.out.print(converter.toBinary(x));
//        class A {
//            public A() {
//                System.out.println("New A");
//            }
//        }
//        class B extends A {
//            public B() {
//                System.out.println("New B");
//            }
//        }
//
//        class Program {
//            public static void main(String[ ] args) {
//                B obj = new B();
//            }
//        }
//        class A {
//            public void print() {
//                System.out.println("A");
//            }
//        }
//class B extends A {
//    public void print() {
//        System.out.println("B");
//    }
//    public static void main(String[ ] args) {
//        A object = new B();
//        B b = (B) object;
//        b.print();
//    }
//}
//        class Animal {
//            String name;
//            Animal(String n) {
//                name = n;
//            }
//            @Override
//            public int hashCode() {
//                final int prime = 31;
//                int result = 1;
//                result = prime * result + ((name == null) ? 0 : name.hashCode());
//                return result;
//            }
//            @Override
//            public boolean equals(Object obj) {
//                if (this == obj)
//                    return true;
//                if (obj == null)
//                    return false;
//                if (getClass() != obj.getClass())
//                    return false;
//                Animal other = (Animal) obj;
//                if (name == null) {
//                    if (other.name != null)
//                        return false;
//                } else if (!name.equals(other.name))
//                    return false;
//                return true;
//            }
//        }
//class Program {
//    enum Rank {
//        SOLDIER,
//        SERGEANT,
//        CAPTAIN
//    }
//    public static void main(String[] args) {
//        Rank a = Rank.SOLDIER;
//
//        switch(a) {
//            case SOLDIER:
//                System.out.println("Soldier says hi!");
//                break;
//            case SERGEANT:
//                System.out.println("Sergeant says Hello!");
//                break;
//            case CAPTAIN:
//                System.out.println("Captain says Welcome!");
//                break;
//        }
//    }
//}

//abstract class Shape {
//    int width;
//    abstract void area(int width);
//}
////your code goes here
//class Square extends Shape{
//    @Override
//    void area(int width) {
//        System.out.println(width*width);
//    }
//}
//class Circle extends Shape {
//    @Override
//    void area(int r) {
//        System.out.println(PI*r*r);
//    }
//}
//class Program {
//    public static void main(String[ ] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        double y = sc.nextDouble();
//
//        Square a = new Square();
//        Circle b = new Circle();
//        a.area(x);
//        b.area((int) y);
//    }
//}

//try and catch
//public class MyClass {
//    public static void main(String[ ] args) {
//        try {
//            int a[ ] = new int[2];
//            System.out.println(a[5]);
//        } catch (Exception e) {
//            System.out.println("An error occurred");
//        }
//    }
//}

//work with files
//import java.io.File;
//
//public class MyClass {
//    public static void main(String[ ] args) {
//        File x = new File("C:\\sololearn\\test.txt");
//        if(x.exists()) {
//            System.out.println(x.getName() +  "exists!");
//        }
//        else {
//            System.out.println("The file does not exist");
//        }
//    }
//}

//try {
//        File x = new File("C:\\sololearn\\test.txt");
//        Scanner sc = new Scanner(x);
//        while(sc.hasNext()) {
//        System.out.println(sc.next());
//        }
//        sc.close();
//        } catch (FileNotFoundException e) {
//        System.out.println("Error");
//        }

class B implements Runnable {
    public void run() {
        System.out.println("B");
    }
}
class A extends Thread {
    public void run() {
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }
    public static void main(String[ ] args) {
        A object = new A();
        object.start();
        
    }
}

