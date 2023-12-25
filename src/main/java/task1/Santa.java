
package task1;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Налаштувати логування для проєкту. Iз додатковим завданням(Див.AuthorHelper.
 * З пакета ex_002_insert_and_update створіть у циклі 200 об'єктів author і збережіть у БД.
 * Значення полів можуть бути будь-якими. Використовуйте метод flush для кожних 10 об'єктів.
 * Метод сommit виконайте один раз, наприкінці.)
 **/
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Santa {
    public static final Logger LOGGER = LogManager.getLogger(Santa.class);
    String name;
    int age;

    public void print() {
        LOGGER.info("Inside print method");

    }
}

class NewSanta {
    public static void main(String[] args) {
        new Santa().print();
    }
}
