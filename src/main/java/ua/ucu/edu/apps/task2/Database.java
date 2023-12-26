package ua.ucu.edu.apps.task2;

public class Database
{
    БазаДаних dataBase;

    public Database(БазаДаних dataBase) { this.dataBase = dataBase; }

    public String getUserData() { return dataBase.отриматиДаніКористувача(); }

    public String getStatisticsData() { return dataBase.отриматиСтатистичніДані(); }
}
