# Дипломный проект по профессии «Инженер по тестированию»

## Мобильное приложение «V Hospice»

## Описание приложения

Приложение даёт функционал по работе с претензиями хосписа и включает в себя:

- Информацию о претензиях и функционал для работы с ними;
- Новостную сводку хосписа;
- Тематические цитаты.

## Документация

1. [Задание дипломного проекта;](https://github.com/netology-code/qamid-diplom)
2. [План проверки и автоматизации приложения;](https://github.com/TIgorT/QADiplomMobileApplicationVH/blob/main/Plan.md)
3. [Чек-лист проверок;](https://docs.google.com/spreadsheets/d/1KymxkIXm-wzX-Xw5MUVbSpl-9s8YcZPgaE3VCoTWl8M/edit?usp=sharing)
4. [Тест-кейсы;](https://docs.google.com/spreadsheets/d/1Sgf9nE7QEXgshpobzQ0zoPE4z5XnbtrFXjmg9Wx2fi8/edit?usp=sharing)
5. [Отчет о проведённом тестировании;](https://github.com/TIgorT/QADiplomMobileApplicationVH/blob/main/TestReport.md)

## Инструкция для приложения и автотестов

1. Клонировать [проект;](https://github.com/TIgorT/QADiplomMobileApplicationVH)
2. Открыть проект в Android Studio;
3. Запустить эмулятор Pixel 7 API 29 и проверить наличие интернета на нём;
4. Запустить мобильное приложение на эмуляторе Pixel 7 API 29;
5. Очистить  мобильное приложение от созданых новостей в разделе Control Panel;
6. Запустить тесты в терминале `./gradlew connectedAndroidTest`;

## Формирование отчета AllureReport
1. Выгрузить папку с результатами проверки allure-results с эмулятора Pixel 7 API 29 через Device Explorer 
 путь: `/data/data/ru.iteco.fmhandroid/files/allure-results`;
2. Скачать Allure отчет в [архиве;](https://github.com/TIgorT/QADiplomMobileApplicationVH/blob/main/allure-results.rar)
3. Выполнить команду `allure serve` в терминале, находясь на уровень выше allure-results;
4. Подождать генерации [отчета](https://github.com/TIgorT/QADiplomMobileApplicationVH/blob/main/Allure%20Report.png)  в открывшемся браузере.
