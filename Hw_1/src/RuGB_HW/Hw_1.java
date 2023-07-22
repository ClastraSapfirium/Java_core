package RuGB_HW;
import java.io.*;


public class Hw_1 {
    private static String[] datephone = new String[5];
    public static void main(String[] args) throws IOException {
        //переменная описывает вызываемое действие
        String act;

        //загрузка БД
        loaddatephone();
        //вывод записей на екран
        Printbook();

        //вывод на екран описания возможных действий с указанием команд
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные," +
                            " (show)показать данные, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //добавление записи
            if(act.equals("add")){
                System.out.println("Ввод фамилии, имени, отчества.");
                System.out.println("Введите фамилию:");
                String first_name = bf.readLine();
                System.out.println("Введите имя:");
                String second_name = bf.readLine();
                System.out.println("Введите отчество:");
                String Third_name = bf.readLine();
                System.out.println("Введите дату рождения (dd.mm.yyyy):");
                String birthdate = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                System.out.println("Введите пол (м/ж):");
                String pol = bf.readLine();
                adddatephone(first_name, second_name, Third_name, birthdate, phone, pol);
            }else{
                //удаление записи
                if(act.equals("del")){
                    for (int i = 0; i < datephone.length; i++) {
                        datephone[i]="";
                    }
                }else{
                    //поиск номеров по фамилии
                    if(act.equals("show")){
                        Printbook();
                    }
                }
            }
        //запрос на следующее действие
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (show)показать данные, (exit)выход");
        act=bf.readLine();
        }
    }

    //loaddatephone - загружает БД
    public static void loaddatephone() throws IOException {
        File file = new File("book.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("book.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String dat = " ";
                datephone[0]=dat;
                datephone[1]=dat;
                datephone[2]=dat;
                datephone[3]=dat;
                datephone[4]=dat;
                datephone[5]=dat;
            }
            reader.close();
        }
    }
    
    //Print - выводит на екран все записи
    public static void Printbook(){
        System.out.println("Cправочник всех введённых данных: ");
        for (int i = 0; i < datephone.length; i++) {
           System.out.println(datephone[i]);;
        }
    }

    //adddatephone - добавляет запись
    private static void adddatephone(String first_name, String second_name, String Third_name, String birthdate, String phone, String pol) {
        datephone[0]=first_name;
        datephone[1]=second_name;
        datephone[2]=Third_name;
        datephone[3]=birthdate;
        datephone[4]=phone;
        datephone[5]=pol;
    }
}