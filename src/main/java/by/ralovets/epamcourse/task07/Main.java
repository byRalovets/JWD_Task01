package by.ralovets.epamcourse.task07;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task07.math.Point;

/**
 * 7. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат
 * <p>
 * Запуск проекта:
 * 1. mvn compile
 * 2. mvn exec:java -Dexec.mainClass="by.ralovets.epamcourse.Main"
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координату X первой точки");
        int x1 = ConsoleInput.readInteger();
        System.out.println("Введите координату Y первой точки");
        int y1 = ConsoleInput.readInteger();
        System.out.println("Введите координату X второй точки");
        int x2 = ConsoleInput.readInteger();
        System.out.println("Введите координату Y второй точки");
        int y2 = ConsoleInput.readInteger();

        double distanceA = new Point(x1, y1).getDistance();
        double distanceB = new Point(x2, y2).getDistance();

        if (distanceA == distanceB) {
            System.out.println("Точки A и B равноудалены от начала координат");
        } else if (distanceA > distanceB) {
            System.out.println("Точка B ближе к началу координат");
        } else {
            System.out.println("Точка A ближе к началу координат");
        }
    }
}