package DayFive;

import java.util.*;
import java.lang.Math;

public class PhoneParse {
    public static void main(String[] args) {
        String sampleString = "00:01:07,400-234-090 00:05:01,701-080-080 00:05:00,400-234-090";
        String[] stringArray = sampleString.split(" ");
        String[] intArray = new String[stringArray.length];

        //create new hashmap to hold phone# and total cost
        Map<Integer,Double> costmap = new HashMap<Integer,Double>();

        //create map to hold phone# and total seconds
        Map<String,Integer> map = new HashMap<String,Integer>();

        //create a linkedlist to hold numerical phone value excluding the free number
        List<Integer> newlist =  new LinkedList<Integer>(Arrays.asList());

        // variable to hold total phone bill
        double phoneBill = 0.00;
        //places each phone data pair into intArray
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            intArray[i] = numberAsString;
        }
        System.out.println("Number of integers: " + intArray.length);
        System.out.println("The integers are:");
        for (String number : intArray) {
            System.out.println(number);

            // separates time entered
            String[] dataArray = number.split(",");
            System.out.println(dataArray[0]);

            // separates time entered
            String[] timeArray = dataArray[0].split(":");
            // convert string to int & hours to seconds
            int hour = Integer.parseInt(timeArray[0]) *3600;
            // convert string to int & minutes to seconds
            int minute = Integer.parseInt(timeArray[1])*60;
            //convert string to int & seconds to seconds
            int second = Integer.parseInt(timeArray[2]);
            // Total seconds per call
            int total = hour + minute + second;
            System.out.println(total);



            // Total cost of call
            double callCost;
            if (total <= 300){
                callCost = total * 3;
            }else {
                callCost = Math.ceil((total/60.0))*150;
            }

            //convert phone# into numerical value
            int phoneValue = Integer.parseInt(dataArray[1].replace("-",""));
            System.out.println("phone value " + phoneValue);


            //hashmap of phone# and total seconds
            if (map.containsKey(dataArray[1])){
                map.put(dataArray[1], (map.get(dataArray[1]) + total));
            } else {
                map.put(dataArray[1], total);
            }


            System.out.println("The phone/total seconds map: " + map);



            //puts phone# and total cost into hashmap
            if (costmap.containsKey(phoneValue)){
                costmap.put(phoneValue, (costmap.get(phoneValue) + callCost));
            } else {
                costmap.put(phoneValue,callCost);
            }

            //Calculates total phone bill cost minus free number
            // free number is currently hardcoded please put variable
            if(phoneValue != 400234090){
                phoneBill = phoneBill + callCost;
            }


            System.out.println(callCost);
            System.out.println(costmap);
            System.out.println(costmap.get(phoneValue));



            //separates phone number entered
            System.out.println(dataArray[1]);


        }
        System.out.println("The map is "+ map);
        // This will return max value in the Hashmap
        int maxValueInMap=(Collections.max(map.values()));
        // Iterate through hashmap and creates newlist to hold all max times phone numbers
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                // Print the keys with max value
                System.out.println(Integer.parseInt(entry.getKey().replace("-","")));
                newlist.add(Integer.parseInt(entry.getKey().replace("-","")));
                System.out.println("the new list is "+newlist);

            }
        }

        //Get the free number from the phone num array
        int freeNumber = Collections.min(newlist);
        System.out.println("The free number is " +freeNumber);



        System.out.println("Total phone bill cost is "+phoneBill);
    }
}

