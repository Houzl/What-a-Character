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


public class UnicodeCharLiterals
{

  public static void main(String[] args)
  {
    // How to use Unicode characters in string and character literals.
    // The hexadecimal values can be in uppercase or lowercase. The
    // characters are always in the Basic Multilingual Plane.

    char ch1 = 'a';
    char ch2 = '编';
    // char ch3 = '𝒮';
    // (Not a BMP character!)
    // char ch4 = '\';
    // (Backslash is a syntax error!)

  }

}
