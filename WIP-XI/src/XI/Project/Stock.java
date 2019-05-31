/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

/**
 *
 * @author WipCamp11
 */
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {
        int item = 5;
        int limit = 10;

        System.out.printf("item %d \n", item);
        System.out.printf("limit %d \n", limit);
        System.out.println("Select menu");
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter menu : ");

        int menu = sc.nextInt();
        System.out.println("menu : " + menu);
        if (menu == 1) {
            if (item < limit) {
                int amount;

                System.out.println("Enter amount to add : ");
                amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.printf("ไอเท็มเกินลิมิต");
                } else {item = item+amount;
                    System.out.println("Add item : ");
                    System.out.printf("item %d \n", item);
                    System.out.printf("limit %d \n", limit);
                }

            } else {
                System.out.printf("ไอเท็มเต็มแล้ว");
            }

        } 
        else if (menu == 2) {
            if (item > 0) {
                int amount;

                System.out.println("Enter amount to remove");
                amount = sc.nextInt();
                if (item - amount < 0) {
                    System.out.printf("ไอเท็มมีไม่พอให้ลบ");
                } else {item = item-amount;
                    System.out.println("remove item : ");
                    System.out.printf("item %d \n", item);
                    System.out.printf("limit %d \n", limit);

                }
            } else {
                System.out.printf("ไม่มีไอเท็มในกล่อง");
            }

        } 
        else if (menu == 3) {
            System.out.printf("item %d \n", item);
            System.out.printf("limit %d \n", limit);
           
        } 
        else{System.out.printf("NO CHOICE");
                    
}
    }
}
