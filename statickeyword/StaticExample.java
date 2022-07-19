package com.company.statickeyword;

public class StaticExample {
    //class variable
    static int i;

    //instance variable
    private int y;

    //instance variable
    private int z = f;  //Başlatmada önce sınıf başlatılır sonrasında ise nesne oluştuysa nesne başlatılır dolayısıyla burda forward reference var gibi gözükse de
                        // aslında forward reference durumu yok. Çünkü statik değişkenler ve metotlar sınıfın bir parçası olduğu için ve başlatmada önce sınıflar başlatılıdğı için
                        // önce class variable and methods başlatılır sonrasında ise instance variable,methods vs başlatılır.

    //class variable
    static int f;


    static void staticMethod(int x){
        //System.out.println(y);      -> Static method cant reach instance variable and instance methods
        //nonStaticMethod();
        System.out.println(i);
    }
    void nonStaticMethod(){
        System.out.println(i);   // -> But instance method can be reach instance variable,instance method,static variable,static method
    }
}
