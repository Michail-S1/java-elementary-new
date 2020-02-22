package lesson2;

public class References {

        public static void main(String[] args) {
            int number = 5;
            System.out.println("before call" + number);
            System.out.println("after call" + number);


        }
        public static void changeNumber(int number){
            number =  10;
            System.out.println("before call" + number);
            System.out.println("after call" + number);

        }

    }
