package home;

public class RandomGeneratorDemo {
	public static void main(String[] args){
		int randomNumber1 =(int) (Math.random()*100);
		int randomNumber2 =(int) (Math.random()*100);
		int randomNumber3 =(int) (Math.random()*100);
       
                System.out.println ("Случайное число №1 = " + randomNumber1);
                System.out.println ("Случайное число №2 = " + randomNumber2);
                System.out.println ("Случайное число №3 = " + randomNumber3);
                System.out.println ();
                System.out.println ("Сумма этих чисел равна: " +(randomNumber1 + randomNumber2 + randomNumber3));
	}

}

