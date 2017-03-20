package com.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class person {
      String name;
      int age;
      boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0  && age < 151  ){
            this.age = age;


        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //      String getname() {
//          return name;
//      }
//
//      void setName(String name){
//          this .name = name;
//      }
//
//
//      int getAge() {
//        return age;
//    }
//
//    void setage (int age){
//          this.age = age;
//
//        boolean getisAlive(){
//            return isAlive;
//
//    }
//        void setIsAlive(boolean isAlive){
//            this.isAlive = isAlive;
//    }
}


