package lesson_15.homework;

import lesson_15.homework.exceptions.WrongAccountException;
import lesson_15.homework.exceptions.WrongCurrencyException;
import lesson_15.homework.exceptions.WrongOperationException;

public class Main {
    // Поле BankApplication
    private static BankApplication bankApp = new BankApplication();

    public static void main(String[] args) {
        // Викликати метод processWrapper з наступними параметрами:
        processWrapper("accountId000", 50, "USD");
        processWrapper("accountId003", 250, "HRV");
        processWrapper("accountId001", 50, "EUR");
        processWrapper("accountId001", 50, "USD");
        processWrapper("accountId001", 2000, "USD");
    }

    // Метод processWrapper(String, int, String)
    public static void processWrapper(String accountId, int amount, String currency) {
        try {
            bankApp.process(accountId, amount, currency);
            System.out.println("Операція успішна.");
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує.");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті.");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів.");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз.");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом.");
        }
    }
}
