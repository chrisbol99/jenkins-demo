package com.markwaite;

public class MarkWaite {
    public final String getName() {
        return "Mark E. Waite";
    }

    public final String getBlogURL() {
        return "http://markwaite.blogspot.com/";
    }

    public final String getFormName() {
        return "Mark's form";
    }

    public static void main(String[] args) {
        MarkWaite me = new MarkWaite();
        System.out.println("Hello from " + me.getName() + " who blogs at " + me.getBlogURL());
    }
