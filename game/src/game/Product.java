/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Date;

/**
 *
 * @author Kapil Thakkar
 */
public class Product
{
    String name, company, unitofquantity, nutrientValue, barcode, logo;
    double quantity, price, sellingPrice,valueToDeduct;
    Date manDate, expDate;
    int bestbefore, category;
    boolean veg, agmark, isExpired;
    
    boolean checkedAuth, checkedBarcode, checkedValidity, checkedNut, checkedMRP, checkedMfd, checkedQty, checkedVeg;

    public double getValueToDeduct()
    {
        return valueToDeduct;
    }

    public void setValueToDeduct(double valueToDeduct)
    {
        this.valueToDeduct = valueToDeduct;
    }

    public Product()
    {
        isExpired = false;
        
        checkedAuth=false;
        checkedBarcode=false;
        checkedValidity=false;
        checkedNut=false;
        checkedMRP=false;
        checkedMfd=false;
        checkedQty=false;
        checkedVeg=false;
    }

    public boolean isIsExpired()
    {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired)
    {
        this.isExpired = isExpired;
    }

    public Product(Product p)
    {
        this.agmark = p.agmark;
        this.barcode = p.barcode;
        this.bestbefore = p.bestbefore;
        this.category = p.category;
        this.company = p.company;
        this.expDate = p.expDate;
        this.logo = p.logo;
        this.manDate = p.manDate;
        this.name = p.name;
        this.nutrientValue = p.nutrientValue;
        this.price = p.price;
        this.quantity = p.quantity;
        this.sellingPrice = p.sellingPrice;
        this.unitofquantity = p.unitofquantity;
        this.veg = p.veg;
        this.isExpired = p.isExpired;
    }

    public boolean isCheckedAuth()
    {
        return checkedAuth;
    }

    public void setCheckedAuth(boolean checkedAuth)
    {
        this.checkedAuth = checkedAuth;
    }

    public boolean isCheckedBarcode()
    {
        return checkedBarcode;
    }

    public void setCheckedBarcode(boolean checkedBarcode)
    {
        this.checkedBarcode = checkedBarcode;
    }

    public boolean isCheckedValidity()
    {
        return checkedValidity;
    }

    public void setCheckedValidity(boolean checkedValidity)
    {
        this.checkedValidity = checkedValidity;
    }

    public boolean isCheckedNut()
    {
        return checkedNut;
    }

    public void setCheckedNut(boolean checkedNut)
    {
        this.checkedNut = checkedNut;
    }

    public boolean isCheckedMRP()
    {
        return checkedMRP;
    }

    public void setCheckedMRP(boolean checkedMRP)
    {
        this.checkedMRP = checkedMRP;
    }

    public boolean isCheckedMfd()
    {
        return checkedMfd;
    }

    public void setCheckedMfd(boolean checkedMfd)
    {
        this.checkedMfd = checkedMfd;
    }

    public boolean isCheckedQty()
    {
        return checkedQty;
    }

    public void setCheckedQty(boolean checkedQty)
    {
        this.checkedQty = checkedQty;
    }

    public boolean isCheckedVeg()
    {
        return checkedVeg;
    }

    public void setCheckedVeg(boolean checkedVeg)
    {
        this.checkedVeg = checkedVeg;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getUnitofquantity()
    {
        return unitofquantity;
    }

    public void setUnitofquantity(String unitofquantity)
    {
        this.unitofquantity = unitofquantity;
    }

    public String getNutrientValue()
    {
        return nutrientValue;
    }

    public void setNutrientValue(String nutrientValue)
    {
        this.nutrientValue = nutrientValue;
    }

    public String getBarcode()
    {
        return barcode;
    }

    public void setBarcode(String barcode)
    {
        this.barcode = barcode;
    }

    public String getLogo()
    {
        return logo;
    }

    public void setLogo(String logo)
    {
        this.logo = logo;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Date getManDate()
    {
        return manDate;
    }

    public void setManDate(Date manDate)
    {
        this.manDate = manDate;
    }

    public Date getExpDate()
    {
        return expDate;
    }

    public void setExpDate(Date expDate)
    {
        this.expDate = expDate;
    }

    public int getBestbefore()
    {
        return bestbefore;
    }

    public void setBestbefore(int bestbefore)
    {
        this.bestbefore = bestbefore;
    }

    public int getCategory()
    {
        return category;
    }

    public void setCategory(int category)
    {
        this.category = category;
    }

    public boolean isVeg()
    {
        return veg;
    }

    public void setVeg(boolean veg)
    {
        this.veg = veg;
    }

    public boolean isAgmark()
    {
        return agmark;
    }

    public void setAgmark(boolean agmark)
    {
        this.agmark = agmark;
    }

}
