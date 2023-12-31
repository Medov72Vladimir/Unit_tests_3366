# Unit-тесты (семинары)
## Урок 5. Другие виды тестирования

Задание 1.<br> 

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.<br>
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.<br>

1. Unit-тест "testAddContact" - в этом тесте мы проверяем, что при добавлении нового контакта в записную книжку, он действительно сохраняется и можно получить доступ к нему при запросе всех контактов.<br>
2. Unit-тест "testEditContact" - в этом тесте мы проверяем, что при изменении данных существующего контакта, эти изменения сохраняются и можно получить доступ к обновленным данным при запросе всех контактов.<br>
3. Unit-тест "testDeleteContact" - в этом тесте мы проверяем, что при удалении контакта из записной книжки, он действительно удаляется и больше не доступен при запросе всех контактов.<br>
4. Интеграционный тест "testAddEditDeleteContact" - в этом тесте мы проверяем, что при добавлении нового контакта в записную книжку, он сохраняется, затем мы редактируем его данные и убеждаемся, что изменения сохраняются, после чего удаляем контакт и проверяем, что он больше не доступен при запросе всех контактов.<br>
5. Интеграционный тест "testSearchContacts" - в этом тесте мы добавляем несколько контактов в записную книжку, затем производим поиск по имени или номеру телефона и убеждаемся, что результаты поиска соответствуют ожидаемым.<br>
6. Интеграционный тест "testImportExportContacts" - в этом тесте мы добавляем несколько контактов в записную книжку, затем экспортируем их в файл, убеждаемся, что файл содержит все нужные данные. Затем мы удаляем все контакты из записной книжки и импортируем их обратно из файла, проверяем, что все контакты были успешно импортированы.<br>
7. Сквозной тест "testDeleteAllContacts" - в этом тесте мы добавляем несколько контактов в записную книжку, затем удаляем все контакты и проверяем, что при запросе всех контактов список пуст.<br>
8. Сквозной тест "testAddDuplicateContact" - в этом тесте мы добавляем новый контакт в записную книжку, затем пытаемся добавить контакт с тем же именем или номером телефона и проверяем, что система не допускает добавления дубликата.<br>
9. Сквозной тест "testEditNonexistentContact" - в этом тесте мы пытаемся отредактировать несуществующий контакт в записной книжке и проверяем, что система выдает соответствующую ошибку и не производит изменений.<br>


Задание 2.<br> 

Ниже список тестовых сценариев.<br> 
Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.<br>

1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".<br>
ОТВЕТ: это юнит-тест, так как проверяется отдельная функция (проверяется одно звено в цепи)<br>
2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".<br>
ОТВЕТ: это интеграционный тест, так как проверяется взаимодействие пользовательского интерфейса и списка контактов (проверяется несколько звеньев цепи)<br>
3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".<br>
ОТВЕТ: это сквозной тест, так как он охватывает полный цикл взаимодействия пользователя с функционалом записной книжки (проверяется вся цепь)<br>