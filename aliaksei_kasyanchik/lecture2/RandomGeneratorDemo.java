package home;

public class RandomGeneratorDemo {
	public static void main(String[] args){
		int randomNumber1 =(int) (Math.random()*100);
		int randomNumber2 =(int) (Math.random()*100);
		int randomNumber3 =(int) (Math.random()*100);
       
                System.out.println ("��������� ����� �1 = " + randomNumber1);
                System.out.println ("��������� ����� �2 = " + randomNumber2);
                System.out.println ("��������� ����� �3 = " + randomNumber3);
                System.out.println ();
                System.out.println ("����� ���� ����� �����: " +(randomNumber1 + randomNumber2 + randomNumber3));
	}

}

