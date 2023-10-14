# gradle-trainer

тренировочный проект для изучения gradle

Используемый стек
---
1. Java 17
2. Gradle

Порядок выполнения задания:
---
1. Создал проект с классом StringUtils с методом boolean isPositiveNumber(String str). Покрыл метод тестами. Собрал в файл utils-1.1.3.jar.
2. Создал многомодульный проект с двумя модулями: core и api.
3. Создал директорию lib в корне проекта, поместил туда utils-1.1.3.jar.
4. Настроил зависимости в модулях.
5. В модуле core в классе Utils реализован метод boolean isAllPositiveNumbers(String… str), который использует метод boolean isPositiveNumber(String str) из utils-1.1.3.jar
6. Написал пару тестов на метод boolean isAllPositiveNumbers(String… str)
7. В модуле api создал класс App с методом main в котором вызывается метод isAllPositiveNumbers(String… str)
