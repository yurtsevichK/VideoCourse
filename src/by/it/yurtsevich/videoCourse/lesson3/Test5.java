package by.it.yurtsevich.videoCourse.lesson3;

public class Test5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //как можно увеличить значение b на 10
        b += 10; //короткая запись
        b = b + 10; //длинная запись

        //как можно уменьшить значение b на 10, также можно делить и умножать
        b -= 10; //короткая запись
        b = b - 10; //длинная запись

        b++; // postfix - используй заданное значение потом прибавь 1
        ++b; // prefix - сначала прибавь 1, потом присвой

    }
}