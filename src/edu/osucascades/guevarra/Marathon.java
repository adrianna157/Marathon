package edu.osucascades.guevarra;

public class Marathon {
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int lose = slowestIndex(times);
        int second = secondFastestIndex(times);
        System.out.printf("The slowest runner is: %s (%d Minutes)%n", names[lose], times[lose]);

        System.out.printf("The second lowest runner is: %s (%d Minutes)%n", names[second], times[second]);
    }

    public static int slowestIndex(int[] times)
    {

        int slowestIndex = 0;

        for (int counter = 0; counter < times.length; counter++)
        {

            if (times[counter] < times[slowestIndex])
            {
                slowestIndex = counter;
            }
        }

        return slowestIndex;

    }

    public static int fastestIndex(int[] times)
    {

        int fastestIndex = 0;

        for (int counter = 0; counter < times.length; counter++)
        {

            if (times[counter] < times[fastestIndex])
            {
                fastestIndex = counter;
            }
        }

        return fastestIndex;

    }

    public static int secondFastestIndex(int[] times)
    {
        int fastestIdx = fastestIndex(times);
        int secondFastestIdx = 0;

        for (int counter = 0; counter < times.length; counter++)
        {

            if (times[counter] < times[secondFastestIdx] && counter != fastestIdx)
            {
                secondFastestIdx = counter;
            }
        }

        return secondFastestIdx;
    }




}

