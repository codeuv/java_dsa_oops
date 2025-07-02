package com.codeuv.DS;

import java.util.Arrays;


public class ArrayListY<DataType> {
    private DataType[] list;
    int DEFAULT_SIZE = 1;
    int size = 0;
    public ArrayListY(){
        list = (DataType[]) new Object[DEFAULT_SIZE];
    }
    public ArrayListY(int size){
        list =  (DataType[]) new Object[size];
    }
    boolean isFull(){
        return size == list.length;
    }

    private void resize(){
        int i1 = size * 2;

        DataType[] temp = (DataType[]) new Object[ size * 2];
        for(int i = 0 ; i < size ; i++){
            temp[i] = list[i];
        }
        System.out.println("RESIZED");
        list = temp;
    }
    public  void add(DataType elem){
        if(isFull()){
            resize();
        }
        list[size++] = elem;
    }
    public DataType remove(){
        if(size == 0) {
            System.out.println("LIST IS EMPTY");
            return null;
        }
        return list[--size];
    }
    public DataType get(int i){
        if(i < 0 || i >= size){
            System.out.println("INDEX OUT OF BOUNDS");
            return null;
        }
        return list[i];
    }
    public void set(int i ,DataType elem){
        if(i < 0 || i >= size){
            System.out.println("INDEX OUT OF BOUNDS");
        }
        list[i] = elem;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for(int i = 0 ; i < size ;i++){
            s.append(list[i]).append(", ");
        }
        String s1 = s.substring(0, s.length() - 2)+"]";
        return s1;
    }

    public static void main(String[] args) {

    }
}
