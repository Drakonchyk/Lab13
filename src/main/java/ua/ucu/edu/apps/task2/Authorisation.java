package ua.ucu.edu.apps.task2;

public class Authorisation extends Авторизація
{
    public boolean authorize(Database dataBase)
    {
        dataBase.getStatisticsData();
        return true;
    }
}
