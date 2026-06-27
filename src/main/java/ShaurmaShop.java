public class ShaurmaShop {
    public static void main (String[] args) {
        String Name = "Варфоломей";
        String Position = "Заворачивальщик лавашей";
        int Rate = 900; // ставка за одну смену
        int Watch = 15; // количество смен
        int Reward = 2000; // премия
        int Sanctions = 1500; // штраф
        int Price = 350; // цена за 1 шаурму
        int Count = 99; // количество штук проданной шаурмы
        int SalaryWithoutReward = Watch * Rate;
        int Salary = (SalaryWithoutReward + Reward) - Sanctions;

        System.out.println ("Имя сотрудника: " + Name);
        System.out.println ("Должность: " + Position);
        System.out.println ("Оплата за смены: " + SalaryWithoutReward);
        System.out.println ("Премия: " + Reward);
        System.out.println ("Штраф: " + Sanctions);
        System.out.println ("Итоговая зарплата: " + Salary);
        System.out.println ("Выручка: " + (Count * Price));
    }
}
