/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but 
WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 

This work is licensed under the Creative Commons Attribution-ShareAlike 
4.0 International License. To view a copy of this license, visit 
http://creativecommons.org/licenses/by-sa/4.0/. 

*/
package us.fatehi.whatacharacter;


public class ConvertUnicodeNumbers
{

  public static void main(String[] args)
  {
    // Number parsing functions can handle numeric values from other
    // languages

    final String hindiNumber = "१२३४५६७८९०";
    final int number = Integer.parseInt(hindiNumber);
    System.out.println(String.format("%s = %d", hindiNumber, number));
  }

}
