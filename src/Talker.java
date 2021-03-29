import java.util.Scanner;

    /**
    Данная программа - первый проект, созданный во время обучения в JetBrains Academy.
    Здесь отрабатывались основы работы со Scanner, примитивными типами данных и циклами.
    */

public class Talker {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Приветствие:
        greet("Talker", "2021");
        // Знакомство с пользователем. Пользователю нужно ввести свое имя с клавиатуры:
        remindName();
        // Бот угадывает возраст пользователя по ответам, введенным с клавиатуры:
        guessAge();
        /*
        Бот демонстрирует свою способность считать.
        Пользователь вводит число с клавиатуры, бот начинает счет с 0 до числа, введенного пользователем,
        каждое число в новой строке:
         */
        count();
        /*
        Бот предлагает проверить знания пользователя в программировании.
        Бот задает вопрос и предлагает 4 варианта ответа,
        пользователю нужно выбрать верный, в случае неверного ответа,
        бот предлагает ввести ответ еще раз, пока не получит верный ответ:
         */
        test();
        //Получив верный ответ на вопрос, бот поздравляет пользователя и прощается:
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        // пользователь вводит остаток от деления возраста на 3, 5 и 7:
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        // по формуле определяется возраст пользователя и выводится в консоль:
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        String option1 = "1. To repeat a statement multiple times.";
        String option2 = "2. To decompose a program into several small subroutines.";
        String option3 = "3. To determine the execution time of a program.";
        String option4 = "4. To interrupt the execution of a program.";
        System.out.println(option1 + "\n" + option2 + "\n" + option3 + "\n" + option4);
        // правильный вариант под цифрой 2. Если пользователь вводит другое число,
        // то ему предлагается повторить попытку. Получив верный ответ, цикл прекращается:
        for (int answer = scanner.nextInt(); answer != 2; answer++) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
            if (answer == 2) {
                break;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}