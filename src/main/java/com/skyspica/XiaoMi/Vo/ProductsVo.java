package com.skyspica.XiaoMi.Vo;

/**
 * Created by xiaolei on 17/9/7.
 */
public class ProductsVo {
    public int productId;
    public String name;
    public String price;
    public String img;
    public int number;
    public int fl_id;

    public String getName() {
        return name;
    }

    public int getFl_id() {
        return fl_id;
    }

    public int getNumber() {
        return number;
    }

    public int getProductId() {
        return productId;
    }

    public String getImg() {
        return img;
    }

    public String getPrice() {
        return price;
    }

    public void setFl_id(int fl_id) {
        this.fl_id = fl_id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
