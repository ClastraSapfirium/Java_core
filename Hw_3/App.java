// 1.
// – Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
// – Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк.
// – Создать массив из 5 сотрудников
// – Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и размер повышения должны быть параметрами метода.
// – Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен принимать в качестве параметра массив сотрудников.
// – Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.


package Hw_3;

public class App {
	public static void main(String[] args) {
		Worker[] Corporation = new Worker[5];
			Corporation[0] = new Worker("Iharevich Pavel", "Student", "Pavel@mail.com", "297654932",20000,18);
			Corporation[1] = new Worker("Vladzimirovich Petr", "CNC operator", "Petr@mail.com", "297654931",35000,31);
			Corporation[2] = new Worker("Ivanova Nadzeshda", "Master", "Nadzeshda@mail.com", "297654936",40000,24);
			Corporation[3] = new Worker("Victorovich Ivan", "Boss", "Ivan@mail.com", "297654939",60000,50);
			Corporation[4] = new Worker("Ihnatovich Yuliya", "CEO", "Yuliya@mail.com", "297654930",90000,60);
        for (Worker Worker : Corporation)
        	if (Worker.getAge()>40)
    		System.out.println(Worker);

    }
}
class Worker {
    private String name;
    private String status;
    private String mail;
    private String phone;
    private int salary;
    private int age;

	public Worker(String name, String status, String mail, String phone, int salary, int age) {
	this.name = name;
    this.status = status;
    this.mail = mail;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
	} 
    public int getAge() {
		return age;
	}
	@Override
	public String toString(){
		return(name+ "\n-"
			+status+ "\n-"
			+mail+ "\n-"
			+phone+ "\n-"
			+salary+ "\n-"
			+age);
	}
}
