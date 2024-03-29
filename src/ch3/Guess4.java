package ch3;

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'S';
        do {
            System.out.println("Задумана буква и диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");
            ch = (char) System.in.read(); // Получить символ с клавиатуры

            // отбросить все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                // вложенный оператор if
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while(answer != ch);
    }
}
