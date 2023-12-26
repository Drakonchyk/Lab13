package ua.ucu.edu.apps.task3;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @Setter @Getter
public class Company
{
    private String name;
    private String description;
    private String logo;

    @Override
    public String toString()
    {
        return "Company:\nName: " + name + '\n' +
                "Description: " + description + '\n' +
                "Logo: " + logo + '\n';
    }
}