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
package exercise;

import java.util.Scanner;


/**
 *
 * @author WipCamp11
 */
public class Test1 {
    public static void main(String[] args) {
         String Name = "Lin";
        
         
         int x = 10;
         
         Scanner sc = new Scanner(System.in);
         
         int y = sc.nextInt();
         int z;
         if(x >=y){
             z = x - y;
             System.out.println("z :" + (x - y) );
             System.out.printf("%d \n",z);
             System.out.printf("%s \n",Name );
             
         }
         else {
             z = x + y;
             System.out.println("z : " +(x + y));
             System.out.printf("%d \n",z);
             System.out.printf("%s \n",Name);
             
         }   
         }
         
}
