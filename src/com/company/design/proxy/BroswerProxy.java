package com.company.design.proxy;

public class BroswerProxy implements IBrowser {

    private String url;
    private Html html;

    public BroswerProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        if (html == null) {
            this.html = new Html(url);
            System.out.println("BroswerProxy loading html from : " + url);
        }
        System.out.println("BroswerProxy use cache html: " + url);
        return null;
    }
}
