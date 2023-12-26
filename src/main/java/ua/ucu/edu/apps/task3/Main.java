package ua.ucu.edu.apps.task3;

import lombok.SneakyThrows;

public class Main
{
    @SneakyThrows
    public static void main(String[] args)
    {
        String url = "https://github.com/";
        Company company = PDLReader.getInfo(url);
        System.out.println(company);
    }
}
