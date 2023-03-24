
package com.mycompany.homework3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Егор
 */
public class HomeWork3 {

public static void main(String[] args) {
    HashMap<String,Auto> autoMap = new HashMap<>();
    
    Auto auto1 = new Auto("Opel",2003,"xc903s");
    Auto auto2 = new Auto("BMW",2013,"xlo23k");
    Auto auto3 = new Auto("Audi",2022,"acl323");
        
    autoMap.put(auto1.getRegNum(), auto1);
    autoMap.put(auto2.getRegNum(), auto2);
    autoMap.put(auto3.getRegNum(), auto3);
    
    
    
    System.out.println(autoMap.toString());
    System.out.println("Введите число:1 если вы хотите добавить в каталог автомобиль");
    System.out.println("Введите число:2 если вы хотите удалить автомобиль по регистрационному номеру");
    System.out.println("Введите число:3 если вы хотите очистить список");
    
   
    int test = 0;
            while (test == 0)
            {
                System.out.print("Введите значение: ");
                Scanner scan = new Scanner (System.in);
                int num = scan.nextInt();
            
                if(num ==1 || num ==2 || num == 3){
                    test = num;
                    //System.out.println("Заработала");
                }
                else{
                    System.out.println("Некоректный ввод");
                }
            }
    
 
            
            
            if(test == 1){
                System.out.print("Введите марку автомобиля: ");
                Scanner scan1 = new Scanner (System.in);
                String brand = scan1.next();
                
                System.out.print("Введите год автомоблиля: ");
                Scanner scan2= new Scanner (System.in);
                int year = scan2.nextInt();
                
                System.out.print("Введите серийный номер автомобиля");
                Scanner scan3= new Scanner (System.in);
                String regNum = scan3.next();
               
                if (autoMap.containsKey(regNum)){
                    System.out.println("Автомобиль с таким регистрационным номером уже существует!");
                }
                else{
                    Auto auto4 = new Auto(brand,year,regNum);
                    autoMap.put(auto4.getRegNum(), auto4);
                    System.out.println(autoMap.toString());
                }
               
                
                
                
            }
            else if (test == 2 ){
                System.out.println("Введите серийный номер автомобиля");
                Scanner scan3= new Scanner (System.in);
                String regNum = scan3.next();
                if (autoMap.containsKey(regNum)){
                    autoMap.remove(regNum);
                    System.out.println(autoMap.toString());
                }
                else{
                    System.out.print("Автомобиля с таким серийным номером в базе нет");
                }
                
            }
            else{
                autoMap.clear();
                System.out.println(autoMap.toString());
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Работу выполинл Маркизов Егор, Обучающийся РИБО-02-21, Варивнт - 1");
}
}