package DayFive;

import java.util.Arrays;
import java.util.HashMap;

public class Parse {
    public static void main(String[] args) {
        String input = "00:01:07,400-234-090 00:05:01,701-080-080 00:05:00,400-234-090";

        String[] lines = input.split(" ");

        HashMap<String, String> phonesTime = new HashMap<>();

        Arrays.stream(lines).map(s -> s.split(",")).forEach(line -> {
            String phone = line[1];
            String time = line[0];
            if (phonesTime.containsKey(phone)) {
                String oldTime = phonesTime.get(phone);
                phonesTime.put(phone, oldTime + time);
            } else {
                phonesTime.put(phone, time);

            }
        });

        System.out.println(phonesTime);}}