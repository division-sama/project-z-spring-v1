package com.projectz.projectz.formdata;

import org.springframework.web.multipart.MultipartFile;

public class ProductDetail {
    private String product_title;
    private String product_description;
    private String product_price;
    private String product_quantity;
    private String product_currency;
    private MultipartFile file1;
    private MultipartFile file2;
    private MultipartFile file3;
    private MultipartFile file4;
    private MultipartFile file5;
    private MultipartFile file6;


    public ProductDetail() {
    }

    public String getProduct_name() {
        return product_title;
    }

    public void setProduct_name(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_currency() {
        return product_currency;
    }

    public void setProduct_currency(String product_currency) {
        this.product_currency = product_currency;
    }

    public MultipartFile getFile1() {
        return file1;
    }

    public void setFile1(MultipartFile file1) {
        this.file1 = file1;
    }

    public MultipartFile getFile2() {
        return file2;
    }

    public void setFile2(MultipartFile file2) {
        this.file2 = file2;
    }

    public MultipartFile getFile3() {
        return file3;
    }

    public void setFile3(MultipartFile file3) {
        this.file3 = file3;
    }

    public MultipartFile getFile4() {
        return file4;
    }

    public void setFile4(MultipartFile file4) {
        this.file4 = file4;
    }

    public MultipartFile getFile5() {
        return file5;
    }

    public void setFile5(MultipartFile file5) {
        this.file5 = file5;
    }

    public MultipartFile getFile6() {
        return file6;
    }

    public void setFile6(MultipartFile file6) {
        this.file6 = file6;
    }

}
