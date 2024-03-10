# software_tester_basic_course


### Lesson 20
1.В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1. 
Известно количество очков, полученных командой за игру. 
Определить словесный результат игры (выигрыш, проигрыш или ничья).

2.Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

3.Дано двузначное число. Определить: остаток от деления десятков на единицы, результат деления единиц на десятки

4.Даны три вещественных числа a, b, c. 
Проверить:
1.выполняется ли неравенство a < b < c;
2.выполняется ли неравенство b > a > c.

5.Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить второе число в пять раз.


### Lesson 21
1.Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".

2.Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".

3.Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
(Определить процедуру для расчета периметра и площади треугольника по его сторонам.)

4.Напечатать числа в виде следующей таблицы:
1 2...10
1 2...10
1 2...10
1 2...10


### Lesson 22
1.Составить программу вывода любого числа любое заданное число раз.

2.Напечатать числа следующим образом:
25 25.5 24.8
26 26.5 25.8
...
35 35.5 34.8

3.Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1фунт=453г).

4.Вычислить сумму 1 + 1/2 + 1/3 + ... + 1/n.


### Lesson 23
1.Заполнить массив из двенадцати элементов 1, 2, ... 12.

2.Вывести элементы массива на экран в обратном порядке.

3.Определить:
1.сумму всех элементов массива;
2.произведение всех элементов массива;
3.сумму квадратов всех элементов массива;
4.сумму шести первых элементов массива

4.Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.

5.Дан массив.Определить:
1.количество максимальных элементов в массиве;
2.количество минимальных элементов в массиве

6.Составить программу:
1.нахождения минимального значения среди элементов любой строки двумерного массива;
2.нахождения максимального значения среди элементов любого столбца двумерного массива

### Lesson 25
Создайте класс Phone, который содержит переменные number, model и weight.

1.Создайте три экземпляра этого класса.

2.Выведите на консоль значения их переменных.

3.Добавьте в класс Phone методы:
- receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
- Метод getNumber – возвращает номер телефона.

4.Вызовите эти методы для каждого из объектов.

### Lesson 27
### Реализовать программу для стационарного телефона, которая позволяет сохранять контакты в память.

#### Требования:
1.Контакт - это элемент массива контактов.

2.Массив контактов – это массив элементов класса Сontact, который имеет поля “name” и “value” в формате строки.

3.Память телефона ограничена, поэтому максимально возможное количество контактов равно 10.

4.При запуске программы пользователь видит меню из 4-х команд:
- Новый контакт,
- Редактировать контакт,
- Удалить контакт,
- Выйти.

5.При выборе команды "Новый контакт" пользователю предлагается создать новый контакт через ввод данных в терминале.

6.Пользователь должен заполнить имя контакта и его номер любыми допустимыми значениями, нельзя оставить поле пустым.

7.За один вызов команды заполнения контакта пользователь может заполнить только 1 контакт.

8.При выборе команды "Редактировать контакт" пользователю предлагается выбрать контакт по его индексу в массиве и затем 
ввести новое имя и номер.

9.При выборе команды "Удалить контакт" пользователю предлагается выбрать контакт по его индексу в массиве для удаления.

10.После каждой операции с контактами выводится список всех контактов в виде таблички “1. Слава 89999999999”, 
незаполненные места списка выводятся как, например, “6. ...”

11.Программа не завершается, пока пользователь не введет или каким-либо образом выберет пункт «Сохранить и выйти».

#### Особенности реализации: 
используйте массивы, условную логику и циклы.

#### Требования к сдаче проекта: 
создайте проект в IntellijIDEA, затем выложите его на GitHub. 
В ответ приложите ссылку на ваш репозиторий.

#### Доп задания для тех, кто быстро справится с проектом (необязательное):
1.Добавьте при редактировании возможность выбора предмета редактирования: 
имя, телефон или и то, и другое. В зависимости от выбранного, пользователь вводит новое значение только для этого поля.
Например, если пользователь хочет отредактировать контакт “1. Слава 89999999999”, то при выборе редактирования только имени, 
номер телефона в контакте останется прежним.

2.В команду редактирования добавьте возможность менять контакты местами. 
Реализуйте с помощью создания новых массивов или одной из динамических структур данных.

### Lesson 41
### Промежуточная аттестация
Напишите программу, которая принимает на вход два разных целых числа и выводит:
1.Сумму этих чисел.
2.Разницу между этими числами (разница между 4 и 5 равна 1, разница между 6 и 1 равна 5).
3.Ряд цифр от минимального из этих чисел до максимального (например, введено 1 и 5, выведется ряд 1 2 3 4 5 
или 6 и 3, выведется ряд 3 4 5 6).