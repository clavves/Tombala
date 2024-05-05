/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sevvalcucuktombalaproject;

/**
 *
 * @author 90554
 */
public class SevvalCucukNode<T> {

    T data;
    SevvalCucukNode<T> next;
    SevvalCucukNode<T> down;
    boolean isCalledOut;

    SevvalCucukNode(T data) {
        this.data = data;
        this.next = null;
        this.down = null;
        this.isCalledOut = false;
    }

    public boolean getIsCalledOut() {
        return isCalledOut;
    }

    public void setIsCalledOut(boolean isCalledOut) {
        this.isCalledOut = isCalledOut;
    }
}
