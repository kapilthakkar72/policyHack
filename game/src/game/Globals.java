/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Kapil Thakkar
 */
public class Globals
{
    public static int score;
    public static double availableMoney = 1000;
    public static List<Product> cart = new ArrayList<Product>();   
    public static String name="";
    public static boolean veg=true;
    public static List<Product> productList = new ArrayList<Product>();
    public static int randomNumber;
    
    final public static int expiryWt =30; 
    final public static int mfdWt = 30;
    final public static int authWtOrBarCodeWt = 20;
    final public static int vegWt = 10;
    final public static int nutWt = 10;
    final public static int mrpWt = 8;
    final public static int qtyWt = 2;
    
    final public static int timePerProduct = 15;
    
}
