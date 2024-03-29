package ch5;
//преобразование строчных букв англ. алфавита в прописные
public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            /*В последующем примере сбрасывается 6ой бит.
              После этого в переменной ch будет храниться
              код символа прописной буквы.
              Значение 65503, используемое в поразрядной
              операции И, является десятичным представлением
              двоичного числа 1111 1111 1101 1111. Таким
              образом, при выполнении данной операции все
              биты кода символа в переменной ch, за исключением
              шестого, остаются прежними, тогда как шестой
              бит сбрасывается в нуль.*/
            ch = (char) ((int) ch & 65503);

            System.out.print(ch + " ");
        }
    }
}
