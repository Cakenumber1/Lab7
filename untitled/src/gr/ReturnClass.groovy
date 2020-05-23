package gr

class ReturnClass {
    // Создайте два метода, один из которых возвращает тип Integer,
    // а второй – тип int. В обоих методах должен быть один параметр
    // тип Integer. Попытайтесь выполнить эти методы, передав в
    // качестве параметра значение null. Какой из методов выполнится?
    static int returnInt(Integer a) {
        return a
    }

    static Integer returnInteger(Integer a) {
        return a
    }
}
