package lesson7_8;

/**
 * 1. Створіть публічний суперклас Shape, який визначає метод під назвою calcArea(), що повертає площу фігури (0.0 для об'єктів Shape). (Програма використовуватиме різні види фігур, таких як трикутник, прямокутник тощо.)
 * 2. У класі Shape оголосіть поле color типу String з модифікатором видимості protected (гетер та сетер для цього поля задавати не потрібно).
 * 3. Створіть конструктор для Shape з параметром color.
 * 4. Перевизначте метод toString(), щоб повернути рядок з назви фігури та кольору, для класу Shape: "This is Shape, color is: назва_кольору"
 * 5. Створіть клас Main з методом main, у якому продемонструйте створення об’єкта Shape і виведення його назви та кольору на екран.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */

/**
 * Базовий клас, який представляє абстрактну геометричну фігуру.
 */
public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    /**
     * Метод для обчислення площі фігури.
     *
     * @return Площа фігури.
     */
    public double calcArea() {
        return 0.0;
    }

    /**
     * Перевизначений метод для отримання рядкового представлення фігури.
     *
     * @return Рядкове представлення фігури.
     */
    @Override
    public String toString() {
        return "This is Shape: " + color;
    }

}
