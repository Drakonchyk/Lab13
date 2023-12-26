package ua.ucu.edu.apps.task2;


public class Main {
    public static void main(String[] args) {
        Database dataBase = new Database(new БазаДаних());
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorize(dataBase)) { ReportBuilder builder = new ReportBuilder(dataBase); }
    }
}
